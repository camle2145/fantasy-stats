package com.fs.fantasy_stats.player;

import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@IdClass(PlayerStatsId.class)
@Table(name = "player_stats")
public class PlayerStats {

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "player_id", referencedColumnName = "player_id")
    @JsonIgnore
    private Player player;

    @Id
    private Integer seasonYear;

    private Integer gamesPlayed;
    private Double fantasyPointsStandard;
    private Double fantasyPointsPpr;
    private Double fantasyPointsHalfPpr;

    // Default constructor
    public PlayerStats() {}

    // Constructor with all fields
    public PlayerStats(Player player, Integer seasonYear, Integer gamesPlayed, Double fantasyPointsStandard,
                      Double fantasyPointsPpr, Double fantasyPointsHalfPpr) {
        this.player = player;
        this.seasonYear = seasonYear;
        this.gamesPlayed = gamesPlayed;
        this.fantasyPointsStandard = fantasyPointsStandard;
        this.fantasyPointsPpr = fantasyPointsPpr;
        this.fantasyPointsHalfPpr = fantasyPointsHalfPpr;
    }

    // Getters and Setters
    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Integer getSeasonYear() {
        return seasonYear;
    }

    public void setSeasonYear(Integer seasonYear) {
        this.seasonYear = seasonYear;
    }

    public Integer getGamesPlayed() {
        return gamesPlayed;
    }

    public void setGamesPlayed(Integer gamesPlayed) {
        this.gamesPlayed = gamesPlayed;
    }

    public Double getFantasyPointsStandard() {
        return fantasyPointsStandard;
    }

    public void setFantasyPointsStandard(Double fantasyPointsStandard) {
        this.fantasyPointsStandard = fantasyPointsStandard;
    }

    public Double getFantasyPointsPpr() {
        return fantasyPointsPpr;
    }

    public void setFantasyPointsPpr(Double fantasyPointsPpr) {
        this.fantasyPointsPpr = fantasyPointsPpr;
    }

    public Double getFantasyPointsHalfPpr() {
        return fantasyPointsHalfPpr;
    }

    public void setFantasyPointsHalfPpr(Double fantasyPointsHalfPpr) {
        this.fantasyPointsHalfPpr = fantasyPointsHalfPpr;
    }
} 