package com.fs.fantasy_stats.player;

public class PhysicalStats {


    private Double armLength;
    private Double handsize;
    private Double forty;
    private Double twentySplit;
    private Double tenSplit;
    private Double bench;
    private Double vertical;
    private Double broad;
    private Double shuttle;
    private Double cone;
    private Double ras;

    public PhysicalStats() {
    }

    public PhysicalStats(Double armLength, Double handsize, Double forty,
                         Double twentySplit, Double tenSplit, Double bench,
                         Double vertical, Double broad, Double shuttle,
                         Double cone, Double ras) {
        this.armLength = armLength;
        this.handsize = handsize;
        this.forty = forty;
        this.twentySplit = twentySplit;
        this.tenSplit = tenSplit;
        this.bench = bench;
        this.vertical = vertical;
        this.broad = broad;
        this.shuttle = shuttle;
        this.cone = cone;
        this.ras = ras;
    }

    public Double getArmLength() {
        return armLength;
    }

    public void setArmLength(Double armLength) {
        this.armLength = armLength;
    }

    public Double getHandsize() {
        return handsize;
    }

    public void setHandsize(Double handsize) {
        this.handsize = handsize;
    }

    public Double getForty() {
        return forty;
    }

    public void setForty(Double forty) {
        this.forty = forty;
    }

    public Double getTwentySplit() {
        return twentySplit;
    }

    public void setTwentySplit(Double twentySplit) {
        this.twentySplit = twentySplit;
    }

    public Double getTenSplit() {
        return tenSplit;
    }

    public void setTenSplit(Double tenSplit) {
        this.tenSplit = tenSplit;
    }

    public Double getBench() {
        return bench;
    }

    public void setBench(Double bench) {
        this.bench = bench;
    }

    public Double getVertical() {
        return vertical;
    }

    public void setVertical(Double vertical) {
        this.vertical = vertical;
    }

    public Double getBroad() {
        return broad;
    }

    public void setBroad(Double broad) {
        this.broad = broad;
    }

    public Double getShuttle() {
        return shuttle;
    }

    public void setShuttle(Double shuttle) {
        this.shuttle = shuttle;
    }

    public Double getCone() {
        return cone;
    }

    public void setCone(Double cone) {
        this.cone = cone;
    }

    public Double getRas() {
        return ras;
    }

    public void setRas(Double ras) {
        this.ras = ras;
    }
}
