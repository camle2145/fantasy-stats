package com.fs.fantasy_stats.player;

public class PlayerBuilder {
    private String name;
    private String firstName;
    private String lastName;
    private String mergeName;
    private String pos;
    private String team;
    private Double age;
    private Double salaryAvg;
    private Integer faYear;
    private Double dynoECR;
    private Double dyno2QBECR;
    private Double dynoSD;
    private Double dynpECR;
    private Double dynpSD;
    private Double rdpECR;
    private Double rdpSD;
    private DraftDetails draftDetails;
    private PlayStats playStats;
    private PhysicalStats physicalStats;
    private Ids ids;

    public PlayerBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PlayerBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public PlayerBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public PlayerBuilder setMergeName(String mergeName) {
        this.mergeName = mergeName;
        return this;
    }

    public PlayerBuilder setPos(String pos) {
        this.pos = pos;
        return this;
    }

    public PlayerBuilder setTeam(String team) {
        this.team = team;
        return this;
    }

    public PlayerBuilder setAge(Double age) {
        this.age = age;
        return this;
    }

    public PlayerBuilder setSalaryAvg(Double salaryAvg) {
        this.salaryAvg = salaryAvg;
        return this;
    }

    public PlayerBuilder setFaYear(Integer faYear) {
        this.faYear = faYear;
        return this;
    }

    public PlayerBuilder setDynoECR(Double dynoECR) {
        this.dynoECR = dynoECR;
        return this;
    }

    public PlayerBuilder setDyno2QBECR(Double dyno2QBECR) {
        this.dyno2QBECR = dyno2QBECR;
        return this;
    }

    public PlayerBuilder setDynoSD(Double dynoSD) {
        this.dynoSD = dynoSD;
        return this;
    }

    public PlayerBuilder setDynpECR(Double dynpECR) {
        this.dynpECR = dynpECR;
        return this;
    }

    public PlayerBuilder setDynpSD(Double dynpSD) {
        this.dynpSD = dynpSD;
        return this;
    }

    public PlayerBuilder setRdpECR(Double rdpECR) {
        this.rdpECR = rdpECR;
        return this;
    }

    public PlayerBuilder setRdpSD(Double rdpSD) {
        this.rdpSD = rdpSD;
        return this;
    }

    public PlayerBuilder setDraftDetails(DraftDetails draftDetails) {
        this.draftDetails = draftDetails;
        return this;
    }

    public PlayerBuilder setPlayStats(PlayStats playStats) {
        this.playStats = playStats;
        return this;
    }

    public PlayerBuilder setPhysicalStats(PhysicalStats physicalStats) {
        this.physicalStats = physicalStats;
        return this;
    }

    public PlayerBuilder setIds(Ids ids) {
        this.ids = ids;
        return this;
    }

    public Player createPlayer() {
        return new Player(name, firstName, lastName, mergeName, pos, team, age, salaryAvg, faYear, dynoECR, dyno2QBECR, dynoSD, dynpECR, dynpSD, rdpECR, rdpSD, draftDetails, playStats, physicalStats, ids);
    }
}