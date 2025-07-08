package com.fs.fantasy_stats.player;

import java.io.Serializable;
import java.util.Objects;

public class RushingStatsId implements Serializable {
    private String player;
        private Integer seasonYear;

    public RushingStatsId() {}

    public RushingStatsId(String player, Integer seasonYear) {
        this.player = player;
        this.seasonYear = seasonYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RushingStatsId)) return false;
        RushingStatsId that = (RushingStatsId) o;
        return seasonYear == that.seasonYear && Objects.equals(player, that.player);
    }

    @Override
    public int hashCode() {
        return Objects.hash(player, seasonYear);
    }
} 