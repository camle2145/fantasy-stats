package com.fs.fantasy_stats.player;

import java.io.Serializable;
import java.util.Objects;

public class PassingStatsId implements Serializable {
    private String player;
    private Integer seasonYear;

    public PassingStatsId() {}

    public PassingStatsId(String player, Integer seasonYear) {
        this.player = player;
        this.seasonYear = seasonYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PassingStatsId)) return false;
        PassingStatsId that = (PassingStatsId) o;
        return seasonYear == that.seasonYear && Objects.equals(player, that.player);
    }

    @Override
    public int hashCode() {
        return Objects.hash(player, seasonYear);
    }
} 