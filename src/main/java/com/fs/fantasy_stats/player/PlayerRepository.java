package com.fs.fantasy_stats.player;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * This interface represents a repository for managing Player entities.
 *
 * @author Leo Cameron
 * @version 1.0
 */
@Repository
public interface PlayerRepository  extends JpaRepository<Player, String>{

    void deleteByName(String playerName);

    Optional<Player> findByName(String playerName);
}
