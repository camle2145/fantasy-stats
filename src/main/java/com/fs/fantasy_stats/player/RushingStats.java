package com.fs.fantasy_stats.player;

import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@IdClass(RushingStatsId.class)
@Table(name = "rushing_stats")
public class RushingStats {

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "player_id", referencedColumnName = "player_id")
    @JsonIgnore
    private Player player;

    @Id
    private int seasonYear;

    private Integer carries;
    private Integer rushYards;
    private Integer rushTouchdowns;
    private Integer rushingTwoPointConversions;


    // Default constructor
    public RushingStats() {}

    // Constructor with all fields
    public RushingStats(Player player, Integer seasonYear, Integer carries, Integer rushYards, Integer rushTouchdowns, 
                       Integer rushingTwoPointConversions) {
        this.player = player;
        this.seasonYear = seasonYear;
        this.carries = carries;
        this.rushYards = rushYards;
        this.rushTouchdowns = rushTouchdowns;
        this.rushingTwoPointConversions = rushingTwoPointConversions;
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

    public Integer getCarries() {
        return carries;
    }

    public void setCarries(Integer carries) {
        this.carries = carries;
    }

    public Integer getRushYards() {
        return rushYards;
    }

    public void setRushYards(Integer rushYards) {
        this.rushYards = rushYards;
    }

    public Integer getRushTouchdowns() {
        return rushTouchdowns;
    }

    public void setRushTouchdowns(Integer rushTouchdowns) {
        this.rushTouchdowns = rushTouchdowns;
    }

    public Integer getRushingTwoPointConversions() {
        return rushingTwoPointConversions;
    }

    public void setRushingTwoPointConversions(Integer rushingTwoPointConversions) {
        this.rushingTwoPointConversions = rushingTwoPointConversions;
    }


} 