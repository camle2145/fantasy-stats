package com.fs.fantasy_stats.player;

import java.io.Serializable;
import java.util.Objects;

public class PlayerStatsId implements Serializable {
    private String player;
    private Integer seasonYear;

    public PlayerStatsId() {}

    public PlayerStatsId(String player, Integer seasonYear) {
        this.player = player;
        this.seasonYear = seasonYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PlayerStatsId)) return false;
        PlayerStatsId that = (PlayerStatsId) o;
        return seasonYear == that.seasonYear && Objects.equals(player, that.player);
    }

    @Override
    public int hashCode() {
        return Objects.hash(player, seasonYear);
    }
} 