package com.fs.fantasy_stats.player;

import jakarta.persistence.*;
import java.util.List;
import java.util.ArrayList;

@Entity
@Table(name = "players")
public class Player {

    @Id
    @Column(name = "player_id", unique = true)
    String playerId;
    String name;
    String position;
    Integer jerseyNumber;
    Integer teamId;
    String school;
    String height;
    Integer weight;
    String birthDate;
    Integer age;
    String experience;
    Boolean isFreeAgent;
    String lastGamePlayed;
    String espnHeadShotUrl;

    // Relationships to stat entities
    @OneToMany(mappedBy = "player", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<RushingStats> rushingStats = new ArrayList<>();

    @OneToMany(mappedBy = "player", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<PassingStats> passingStats = new ArrayList<>();

    @OneToMany(mappedBy = "player", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<ReceivingStats> receivingStats = new ArrayList<>();

    @OneToMany(mappedBy = "player", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<PlayerStats> playerStats = new ArrayList<>();

    @OneToMany(mappedBy = "player", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<PlayerInjury> injuries = new ArrayList<>();

    public Player(){}

    public String getEspnHeadShotUrl() {
        return espnHeadShotUrl;
    }

    public void setEspnHeadShotUrl(String espnHeadShotUrl) {
        this.espnHeadShotUrl = espnHeadShotUrl;
    }

    public String getLastGamePlayed() {
        return lastGamePlayed;
    }

    public void setLastGamePlayed(String lastGamePlayed) {
        this.lastGamePlayed = lastGamePlayed;
    }

    public Boolean isFreeAgent() {
        return isFreeAgent;
    }

    public void setFreeAgent(Boolean freeAgent) {
        isFreeAgent = freeAgent;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public Integer getTeam() {
        return teamId;
    }

    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }

    public Integer getJerseyNumber() {
        return jerseyNumber;
    }

    public void setJerseyNumber(Integer jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }

    public String getPos() {
        return position;
    }

    public void setPos(String position) {
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlayerId() {
        return playerId;
    }

    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }

    public Player(String playerId, String name, String position, Integer jerseyNumber, Integer teamId, String school, String height, Integer weight, String birthDate, Integer age, String experience, Boolean isFreeAgent, String lastGamePlayed, String espnHeadShotUrl) {
        this.playerId = playerId;
        this.name = name;
        this.position = position;
        this.jerseyNumber = jerseyNumber;
        this.teamId = teamId;
        this.school = school;
        this.height = height;
        this.weight = weight;
        this.birthDate = birthDate;
        this.age = age;
        this.experience = experience;
        this.isFreeAgent = isFreeAgent;
        this.lastGamePlayed = lastGamePlayed;
        this.espnHeadShotUrl = espnHeadShotUrl;
    }

    // Getters and setters for relationships
    public List<RushingStats> getRushingStats() {
        return rushingStats;
    }

    public void setRushingStats(List<RushingStats> rushingStats) {
        this.rushingStats = rushingStats;
    }

    public List<PassingStats> getPassingStats() {
        return passingStats;
    }

    public void setPassingStats(List<PassingStats> passingStats) {
        this.passingStats = passingStats;
    }

    public List<ReceivingStats> getReceivingStats() {
        return receivingStats;
    }

    public void setReceivingStats(List<ReceivingStats> receivingStats) {
        this.receivingStats = receivingStats;
    }

    public List<PlayerStats> getPlayerStats() {
        return playerStats;
    }

    public void setPlayerStats(List<PlayerStats> playerStats) {
        this.playerStats = playerStats;
    }

    public List<PlayerInjury> getInjuries() {
        return injuries;
    }

    public void setInjuries(List<PlayerInjury> injuries) {
        this.injuries = injuries;
    }

    // Convenience methods for adding stats
    public void addRushingStats(RushingStats rushingStats) {
        this.rushingStats.add(rushingStats);
        rushingStats.setPlayer(this);
    }

    public void addPassingStats(PassingStats passingStats) {
        this.passingStats.add(passingStats);
        passingStats.setPlayer(this);
    }

    public void addReceivingStats(ReceivingStats receivingStats) {
        this.receivingStats.add(receivingStats);
        receivingStats.setPlayer(this);
    }

    public void addPlayerStats(PlayerStats playerStats) {
        this.playerStats.add(playerStats);
        playerStats.setPlayer(this);
    }

    public void addInjury(PlayerInjury injury) {
        this.injuries.add(injury);
        injury.setPlayer(this);
    }
}