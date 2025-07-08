package com.fs.fantasy_stats.player;

import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@IdClass(ReceivingStatsId.class)
@Table(name = "receiving_stats")
public class ReceivingStats {

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "player_id", referencedColumnName = "player_id")
    @JsonIgnore
    private Player player;

    @Id
    private int seasonYear;

    private Integer targets;
    private Integer receptions;
    private Integer receivingYards;
    private Integer receivingTouchdowns;
    private Integer receivingTwoPointConversions;

    // Default constructor
    public ReceivingStats() {}

    // Constructor with all fields
    public ReceivingStats(Player player, Integer seasonYear, Integer targets, Integer receptions, Integer receivingYards,
                         Integer receivingTouchdowns, Integer receivingTwoPointConversions) {
        this.player = player;
        this.seasonYear = seasonYear;
        this.targets = targets;
        this.receptions = receptions;
        this.receivingYards = receivingYards;
        this.receivingTouchdowns = receivingTouchdowns;
        this.receivingTwoPointConversions = receivingTwoPointConversions;
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

    public Integer getTargets() {
        return targets;
    }

    public void setTargets(Integer targets) {
        this.targets = targets;
    }

    public Integer getReceptions() {
        return receptions;
    }

    public void setReceptions(Integer receptions) {
        this.receptions = receptions;
    }

    public Integer getReceivingYards() {
        return receivingYards;
    }

    public void setReceivingYards(Integer receivingYards) {
        this.receivingYards = receivingYards;
    }

    public Integer getReceivingTouchdowns() {
        return receivingTouchdowns;
    }

    public void setReceivingTouchdowns(Integer receivingTouchdowns) {
        this.receivingTouchdowns = receivingTouchdowns;
    }

    public Integer getReceivingTwoPointConversions() {
        return receivingTwoPointConversions;
    }

    public void setReceivingTwoPointConversions(Integer receivingTwoPointConversions) {
        this.receivingTwoPointConversions = receivingTwoPointConversions;
    }
} 