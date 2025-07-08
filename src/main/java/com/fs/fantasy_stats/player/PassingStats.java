package com.fs.fantasy_stats.player;

import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@IdClass(PassingStatsId.class)
@Table(name = "passing_stats")
public class PassingStats {

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "player_id", referencedColumnName = "player_id")
    @JsonIgnore
    private Player player;

    @Id
    private Integer seasonYear;

    private Integer passAttempts;
    private Integer passCompletions;
    private Integer passYards;
    private Integer passTouchdowns;
    private Integer interceptions;
    private Integer passingTwoPointConversions;

    // Default constructor
    public PassingStats() {}

    // Constructor with all fields
    public PassingStats(Player player, Integer seasonYear, Integer passAttempts, Integer passCompletions, Integer passYards,
                       Integer passTouchdowns, Integer interceptions, Integer passingTwoPointConversions) {
        this.player = player;
        this.seasonYear = seasonYear;
        this.passAttempts = passAttempts;
        this.passCompletions = passCompletions;
        this.passYards = passYards;
        this.passTouchdowns = passTouchdowns;
        this.interceptions = interceptions;
        this.passingTwoPointConversions = passingTwoPointConversions;
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

    public Integer getPassAttempts() {
        return passAttempts;
    }

    public void setPassAttempts(Integer passAttempts) {
        this.passAttempts = passAttempts;
    }

    public Integer getPassCompletions() {
        return passCompletions;
    }

    public void setPassCompletions(Integer passCompletions) {
        this.passCompletions = passCompletions;
    }

    public Integer getPassYards() {
        return passYards;
    }

    public void setPassYards(Integer passYards) {
        this.passYards = passYards;
    }

    public Integer getPassTouchdowns() {
        return passTouchdowns;
    }

    public void setPassTouchdowns(Integer passTouchdowns) {
        this.passTouchdowns = passTouchdowns;
    }

    public Integer getInterceptions() {
        return interceptions;
    }

    public void setInterceptions(Integer interceptions) {
        this.interceptions = interceptions;
    }

    public Integer getPassingTwoPointConversions() {
        return passingTwoPointConversions;
    }

    public void setPassingTwoPointConversions(Integer passingTwoPointConversions) {
        this.passingTwoPointConversions = passingTwoPointConversions;
    }
} 