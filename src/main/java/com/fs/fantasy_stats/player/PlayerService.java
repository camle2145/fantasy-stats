package com.fs.fantasy_stats.player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Component
public class PlayerService {

    private final PlayerRepository playerRepository;

    @Autowired
    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    public List<Player> getPlayers() {
        return playerRepository.findAll();
    }

    public List<Player> getPlayersByTeam(String teamName) {
        return playerRepository.findAll().stream()
                .filter(player -> {
                    try {
                        int teamId = Integer.parseInt(teamName);
                        return teamId == player.getTeam();
                    } catch (NumberFormatException e) {
                        // If teamName is not a number, return false (no match)
                        return false;
                    }
                })
                .collect(Collectors.toList());
    }

    public List<Player> getPlayersByName(String playerName) {
        return playerRepository.findAll().stream()
                .filter(player -> player.getName() != null && playerName.toLowerCase()
                        .contains(player.getName().toLowerCase())).collect(Collectors.toList());
    }

    public List<Player> getPlayersByPosition(String position) {
        return playerRepository.findAll().stream()
                .filter(player -> player.getPos() != null && position.toLowerCase()
                        .contains(player.getPos().toLowerCase())).collect(Collectors.toList());
    }

    public List<Player> getPlayersByTeamAndPos(String team, String position) {
        return playerRepository.findAll().stream()
                .filter(player -> {
                    try {
                        int teamId = Integer.parseInt(team);
                        return teamId == player.getTeam() && player.getPos() != null && position.equals(player.getPos());
                    } catch (NumberFormatException e) {
                        return false;
                    }
                })
                .collect(Collectors.toList());
    }

    public Player addPlayer(Player player) {
        return playerRepository.save(player);
    }

    public Player updatePlayer(Player player) {
        Optional<Player> existingPlayer = playerRepository.findByName(player.getName());
        if (existingPlayer.isPresent()) {
            Player playerToUpdate = existingPlayer.get();
            playerToUpdate.setName(player.getName());
            playerToUpdate.setPos(player.getPos());
            playerToUpdate.setTeamId(player.getTeam());
            playerToUpdate.setAge(player.getAge());
            return playerRepository.save(playerToUpdate);
        }
        return null;
    }

    @Transactional
    public void deletePlayer(String playerName) {
        playerRepository.deleteByName(playerName);
    }
    
    // Methods to get players with stats
    public List<PlayerWithStatsDTO> getPlayersWithStats() {
        return playerRepository.findAll().stream()
                .map(PlayerWithStatsDTO::new)
                .collect(Collectors.toList());
    }
    
    public List<PlayerWithStatsDTO> getPlayersWithStatsByTeam(String teamName) {
        return playerRepository.findAll().stream()
                .filter(player -> {
                    try {
                        int teamId = Integer.parseInt(teamName);
                        return teamId == player.getTeam();
                    } catch (NumberFormatException e) {
                        return false;
                    }
                })
                .map(PlayerWithStatsDTO::new)
                .collect(Collectors.toList());
    }
    
    public List<PlayerWithStatsDTO> getPlayersWithStatsByName(String playerName) {
        return playerRepository.findAll().stream()
                .filter(player -> player.getName() != null && playerName.toLowerCase()
                        .contains(player.getName().toLowerCase()))
                .map(PlayerWithStatsDTO::new)
                .collect(Collectors.toList());
    }
    
    public List<PlayerWithStatsDTO> getPlayersWithStatsByPosition(String position) {
        return playerRepository.findAll().stream()
                .filter(player -> player.getPos() != null && position.toLowerCase()
                        .contains(player.getPos().toLowerCase()))
                .map(PlayerWithStatsDTO::new)
                .collect(Collectors.toList());
    }
    
    public List<PlayerWithStatsDTO> getPlayersWithStatsByTeamAndPos(String team, String position) {
        return playerRepository.findAll().stream()
                .filter(player -> {
                    try {
                        int teamId = Integer.parseInt(team);
                        return teamId == player.getTeam() && player.getPos() != null && position.equals(player.getPos());
                    } catch (NumberFormatException e) {
                        return false;
                    }
                })
                .map(PlayerWithStatsDTO::new)
                .collect(Collectors.toList());
    }
    
    public PlayerWithStatsDTO getPlayerWithStatsById(String playerId) {
        Optional<Player> player = playerRepository.findById(playerId);
        return player.map(PlayerWithStatsDTO::new).orElse(null);
    }
    
    public PlayerWithStatsDTO getPlayerWithStatsByName(String playerName) {
        Optional<Player> player = playerRepository.findByName(playerName);
        return player.map(PlayerWithStatsDTO::new).orElse(null);
    }
}
