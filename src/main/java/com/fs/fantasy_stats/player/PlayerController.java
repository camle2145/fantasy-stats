package com.fs.fantasy_stats.player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
     * @param draftYear optional filter to retrieve players drafted in the specified year.
     * @return a list of players matching the provided filters or all players if no filters are applied.
     */
    @GetMapping
    public List<Player> getPlayers(
            @RequestParam(required = false) String team,
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String position,
            @RequestParam(required = false) Integer draftYear){
        if(team != null && name != null){
            return playerService.getPlayersByTeamAndPos(team, position);
        } else if(team!= null){
            return playerService.getPlayersByTeam(team);
        } else if(name != null){
            return playerService.getPlayersByName(name);
        } else if(position != null){
            return playerService.getPlayersByPosition(position);
        } else if(draftYear != null){
            return playerService.getPlayersByDraftYear(draftYear);
        } else {
            return playerService.getPlayers();
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
