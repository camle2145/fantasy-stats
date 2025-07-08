package com.fs.fantasy_stats.player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * This class serves as a controller for managing Player resources. It provides endpoints
 * for retrieving, creating, updating, and deleting Player data. It calls
 * PlayerService to get information on a given player
 *
 * <p>Base URL: {@code /api/v1/player}</p>
 *
 * @author Leo Cameron
 * @version 1.0
 */
@RestController
@RequestMapping(path = "api/v1/player")
public class PlayerController {

    private final PlayerService playerService;

    /**
     * Constructs a PlayerController with the specified PlayerService.
     *
     * @param playerService the PlayerService instance used
     */
    @Autowired
    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    /**
     * Retrieves a list of players based on the specified filters. If one or more query parameters are
     * provided, the method returns players matching the given parameters. If no parameters are provided,
     * it returns all players.
     *
     * @param team optional filter to retrieve players belonging to the specified team.
     * @param name optional filter to retrieve players with the specified name.
     * @param position optional filter to retrieve players with the specified position.
     * @return a list of players matching the provided filters or all players if no filters are applied.
     */
    @GetMapping
    public List<Player> getPlayers(
            @RequestParam(required = false) String team,
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String position){
        if(team != null && name != null){
            return playerService.getPlayersByTeamAndPos(team, position);
        } else if(team!= null){
            return playerService.getPlayersByTeam(team);
        } else if(name != null){
            return playerService.getPlayersByName(name);
        } else if(position != null){
            return playerService.getPlayersByPosition(position);
        }
            return playerService.getPlayers();        
    }
    
    /**
     * Retrieves a list of players with their stats based on the specified filters.
     * This endpoint returns comprehensive player information including all associated stats.
     *
     * @param team optional filter to retrieve players belonging to the specified team (can be team ID or team name).
     * @param name optional filter to retrieve players with the specified name.
     * @param position optional filter to retrieve players with the specified position.
     * @return a list of players with stats matching the provided filters or all players if no filters are applied.
     */
    @GetMapping("/with-stats")
    public List<PlayerWithStatsDTO> getPlayersWithStats(
            @RequestParam(required = false) String team,
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String position){
        
        // Handle team filtering - support both team ID and team name
        String teamFilter = team;
        if (team != null && !team.matches("\\d+")) {
            // If team is not a number, try to find team ID by name
            Integer teamId = TeamMapping.getTeamIdByName(team);
            if (teamId != null) {
                teamFilter = teamId.toString();
            }
        }
        
        if(teamFilter != null && position != null){
            return playerService.getPlayersWithStatsByTeamAndPos(teamFilter, position);
        } else if(teamFilter != null){
            return playerService.getPlayersWithStatsByTeam(teamFilter);
        } else if(name != null){
            return playerService.getPlayersWithStatsByName(name);
        } else if(position != null){
            return playerService.getPlayersWithStatsByPosition(position);
        }
        return playerService.getPlayersWithStats();        
    }
    
    /**
     * Retrieves a list of all available teams with their IDs and names.
     *
     * @return a map of team IDs to team names
     */
    @GetMapping("/teams")
    public Map<Integer, String> getTeams() {
        return TeamMapping.getAllTeams();
    }
    
    /**
     * Retrieves a specific player with their stats by player ID.
     *
     * @param playerId the ID of the player to retrieve
     * @return a ResponseEntity containing the player with stats or NOT_FOUND if player doesn't exist
     */
    @GetMapping("/{playerId}/with-stats")
    public ResponseEntity<PlayerWithStatsDTO> getPlayerWithStatsById(@PathVariable String playerId) {
        PlayerWithStatsDTO player = playerService.getPlayerWithStatsById(playerId);
        if(player != null){
            return new ResponseEntity<>(player, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    
    /**
     * Retrieves a specific player with their stats by player name.
     *
     * @param playerName the name of the player to retrieve
     * @return a ResponseEntity containing the player with stats or NOT_FOUND if player doesn't exist
     */
    @GetMapping("/name/{playerName}/with-stats")
    public ResponseEntity<PlayerWithStatsDTO> getPlayerWithStatsByName(@PathVariable String playerName) {
        PlayerWithStatsDTO player = playerService.getPlayerWithStatsByName(playerName);
        if(player != null){
            return new ResponseEntity<>(player, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    /**
     * Adds a new player to the system.
     *
     * @param player the Player object containing information about the new player to be added.
     * @return a ResponseEntity containing the newly created Player object and an HTTP status of CREATED.
     */
    @PostMapping
    public ResponseEntity<Player> addPlayer(@RequestBody Player player) {
        Player createdPlayer = playerService.addPlayer(player);
        return new ResponseEntity<>(createdPlayer, HttpStatus.CREATED);
    }

    /**
     * Updates an existing player's information.
     *
     * @param player the Player object containing the updated information for the player.
     * @return a ResponseEntity containing the updated Player object and an HTTP status of OK
     *         if the update operation is successful, otherwise returns an HTTP status of NOT_FOUND.
     */
    @PutMapping
    public ResponseEntity<Player> updatePlayer(@RequestBody Player player) {
        Player updatedPlayer = playerService.updatePlayer(player);
        if(updatedPlayer != null){
            return new ResponseEntity<>(updatedPlayer, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    /**
     * Deletes an existing player based on their name.
     *
     * @param playerName the name of the player to be deleted
     * @return a ResponseEntity containing a success message and an HTTP status of OK
     */
    @DeleteMapping("/{playerName}")
    public ResponseEntity<String> deletePlayer(@PathVariable String playerName) {
        playerService.deletePlayer(playerName);
        return new ResponseEntity<>("Player deleted successfully", HttpStatus.OK);
    }

}
