package com.fs.fantasy_stats.player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

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
                .filter(player -> teamName.equals(player.getTeam()))
                .collect(Collectors.toList());
    }

    public List<Player> getPlayersByName(String playerName) {
        return playerRepository.findAll().stream()
                .filter(player -> playerName.toLowerCase()
                        .contains(player.getName().toLowerCase())).collect(Collectors.toList());
    }

    public List<Player> getPlayersByPosition(String position) {
        return playerRepository.findAll().stream()
                .filter(player -> position.toLowerCase()
                        .contains(player.getPos().toLowerCase())).collect(Collectors.toList());
    }

    public List<Player> getPlayersByDraftYear(Integer draftYear) {
        return playerRepository.findAll().stream()
                .filter(player -> player.getDraftDetails().getDraftYear().equals(draftYear))
                        .collect(Collectors.toList());
    }

    public List<Player> getPlayersByTeamAndPos(String team, String position) {
        return playerRepository.findAll().stream()
                .filter(player -> team.equals(player.getTeam())
                        && position.equals(player.getPos())).collect(Collectors.toList());
    }

    public Player addPlayer(Player player) {
        return playerRepository.save(player);
    }

    public Player updatePlayer(Player player) {
        Optional<Player> existingPlayer = playerRepository.findByName(player.getName());
        if (existingPlayer.isPresent()) {
            Player playerToUpdate = existingPlayer.get();
            playerToUpdate.setFirstName(player.getFirstName());
            playerToUpdate.setLastName(player.getLastName());
            playerToUpdate.setMergeName(player.getMergeName());
            playerToUpdate.setPos(player.getPos());
            playerToUpdate.setTeam(player.getTeam());
            playerToUpdate.setAge(player.getAge());
            playerToUpdate.setSalaryAvg(player.getSalaryAvg());
            return playerRepository.save(playerToUpdate);
        }
        return null;
    }

    @Transactional
    public void deletePlayer(String playerName) {
        playerRepository.deleteByName(playerName);
    }
}
