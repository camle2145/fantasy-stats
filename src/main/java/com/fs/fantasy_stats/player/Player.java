package com.fs.fantasy_stats.player;

import jakarta.persistence.*;

@Entity
@Table(name = "player_statistics")
public class Player {
    @Id
    @Column(name = "name", unique = true)
    private String name;
    private String firstName;
    private String lastName;
    private String mergeName;
    private String pos;
    private String team;
    private Double age;
    private Double salaryAvg;
    private Integer faYear;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMergeName() {
        return mergeName;
    }

    public void setMergeName(String mergeName) {
        this.mergeName = mergeName;
    }

    public String getPos() {
        return pos;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public Double getAge() {
        return age;
    }

    public void setAge(Double age) {
        this.age = age;
    }

    public Double getSalaryAvg() {
        return salaryAvg;
    }

    public void setSalaryAvg(Double salaryAvg) {
        this.salaryAvg = salaryAvg;
    }

    public Integer getFaYear() {
        return faYear;
    }

    public void setFaYear(Integer faYear) {
        this.faYear = faYear;
    }

    public Double getDynoECR() {
        return dynoECR;
    }

    public void setDynoECR(Double dynoECR) {
        this.dynoECR = dynoECR;
    }

    public Double getDyno2QBECR() {
        return dyno2QBECR;
    }

    public void setDyno2QBECR(Double dyno2QBECR) {
        this.dyno2QBECR = dyno2QBECR;
    }

    public Double getDynoSD() {
        return dynoSD;
    }

    public void setDynoSD(Double dynoSD) {
        this.dynoSD = dynoSD;
    }

    public Double getDynpECR() {
        return dynpECR;
    }

    public void setDynpECR(Double dynpECR) {
        this.dynpECR = dynpECR;
    }

    public Double getDynpSD() {
        return dynpSD;
    }

    public void setDynpSD(Double dynpSD) {
        this.dynpSD = dynpSD;
    }

    public Double getRdpECR() {
        return rdpECR;
    }

    public void setRdpECR(Double rdpECR) {
        this.rdpECR = rdpECR;
    }

    public Double getRdpSD() {
        return rdpSD;
    }

    public void setRdpSD(Double rdpSD) {
        this.rdpSD = rdpSD;
    }

    public DraftDetails getDraftDetails() {
        return draftDetails;
    }

    public void setDraftDetails(DraftDetails draftDetails) {
        this.draftDetails = draftDetails;
    }

    public PlayStats getPlayStats() {
        return playStats;
    }

    public void setPlayStats(PlayStats playStats) {
        this.playStats = playStats;
    }

    public PhysicalStats getPhysicalStats() {
        return physicalStats;
    }

    public void setPhysicalStats(PhysicalStats physicalStats) {
        this.physicalStats = physicalStats;
    }

    public Ids getIds() {
        return ids;
    }

    public void setIds(Ids ids) {
        this.ids = ids;
    }

    private Double dynoECR;
    private Double dyno2QBECR;
    private Double dynoSD;
    private Double dynpECR;
    private Double dynpSD;
    private Double rdpECR;
    private Double rdpSD;

    @Embedded
    private DraftDetails draftDetails;

    @Embedded
    private PlayStats playStats;

    @Embedded
    private PhysicalStats physicalStats;

    @Embedded
    private Ids ids;


    public Player() {
    }

    public Player(String name, String firstName, String lastName,
                  String mergeName, String pos, String team, Double age,
                  Double salaryAvg, Integer faYear, Double dynoECR,
                  Double dyno2QBECR, Double dynoSD, Double dynpECR,
                  Double dynpSD, Double rdpECR, Double rdpSD,
                  DraftDetails draftDetails, PlayStats playStats,
                  PhysicalStats physicalStats, Ids ids) {
        this.name = name;
        this.firstName = firstName;
        this.lastName = lastName;
        this.mergeName = mergeName;
        this.pos = pos;
        this.team = team;
        this.age = age;
        this.salaryAvg = salaryAvg;
        this.faYear = faYear;
        this.dynoECR = dynoECR;
        this.dyno2QBECR = dyno2QBECR;
        this.dynoSD = dynoSD;
        this.dynpECR = dynpECR;
        this.dynpSD = dynpSD;
        this.rdpECR = rdpECR;
        this.rdpSD = rdpSD;
        this.draftDetails = draftDetails;
        this.playStats = playStats;
        this.physicalStats = physicalStats;
        this.ids = ids;
    }
}