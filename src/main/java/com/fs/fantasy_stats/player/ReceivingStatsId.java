package com.fs.fantasy_stats.player;

import java.io.Serializable;
import java.util.Objects;

public class ReceivingStatsId implements Serializable {
    private String player;
    private Integer seasonYear;

    public ReceivingStatsId() {}

    public ReceivingStatsId(String player, Integer seasonYear) {
        this.player = player;
        this.seasonYear = seasonYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ReceivingStatsId)) return false;
        ReceivingStatsId that = (ReceivingStatsId) o;
        return seasonYear == that.seasonYear && Objects.equals(player, that.player);
    }

    @Override
    public int hashCode() {
        return Objects.hash(player, seasonYear);
    }
} 