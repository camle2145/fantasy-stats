package com.fs.fantasy_stats.player;

import java.util.List;

/**
 * Data Transfer Object for Player with their associated stats
 * Used to return comprehensive player information including all stat types
 */
public class PlayerWithStatsDTO {
    
    // Player basic information
    private String playerId;
    private String name;
    private String position;
    private Integer jerseyNumber;
    private Integer teamId;
    private String teamName;
    private String school;
    private String height;
    private Integer weight;
    private String birthDate;
    private Integer age;
    private String experience;
    private Boolean isFreeAgent;
    private String lastGamePlayed;
    private String espnHeadShotUrl;
    
    // Stats collections
    private List<RushingStats> rushingStats;
    private List<PassingStats> passingStats;
    private List<ReceivingStats> receivingStats;
    private List<PlayerStats> playerStats;
    private List<PlayerInjury> injuries;
    
    // Default constructor
    public PlayerWithStatsDTO() {}
    
    // Constructor from Player entity
    public PlayerWithStatsDTO(Player player) {
        this.playerId = player.getPlayerId();
        this.name = player.getName();
        this.position = player.getPos();
        this.jerseyNumber = player.getJerseyNumber();
        this.teamId = player.getTeam();
        this.teamName = TeamMapping.getTeamName(player.getTeam());
        this.school = player.getSchool();
        this.height = player.getHeight();
        this.weight = player.getWeight();
        this.birthDate = player.getBirthDate();
        this.age = player.getAge();
        this.experience = player.getExperience();
        this.isFreeAgent = player.isFreeAgent();
        this.lastGamePlayed = player.getLastGamePlayed();
        this.espnHeadShotUrl = player.getEspnHeadShotUrl();
        
        // Copy stats collections
        this.rushingStats = player.getRushingStats();
        this.passingStats = player.getPassingStats();
        this.receivingStats = player.getReceivingStats();
        this.playerStats = player.getPlayerStats();
        this.injuries = player.getInjuries();
    }
    
    // Getters and Setters
    public String getPlayerId() {
        return playerId;
    }
    
    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getPosition() {
        return position;
    }
    
    public void setPosition(String position) {
        this.position = position;
    }
    
    public Integer getJerseyNumber() {
        return jerseyNumber;
    }
    
    public void setJerseyNumber(Integer jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }
    
    public Integer getTeamId() {
        return teamId;
    }
    
    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }
    
    public String getTeamName() {
        return teamName;
    }
    
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }
    
    public String getSchool() {
        return school;
    }
    
    public void setSchool(String school) {
        this.school = school;
    }
    
    public String getHeight() {
        return height;
    }
    
    public void setHeight(String height) {
        this.height = height;
    }
    
    public Integer getWeight() {
        return weight;
    }
    
    public void setWeight(Integer weight) {
        this.weight = weight;
    }
    
    public String getBirthDate() {
        return birthDate;
    }
    
    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }
    
    public Integer getAge() {
        return age;
    }
    
    public void setAge(Integer age) {
        this.age = age;
    }
    
    public String getExperience() {
        return experience;
    }
    
    public void setExperience(String experience) {
        this.experience = experience;
    }
    
    public Boolean isFreeAgent() {
        return isFreeAgent;
    }
    
    public void setFreeAgent(Boolean freeAgent) {
        isFreeAgent = freeAgent;
    }
    
    public String getLastGamePlayed() {
        return lastGamePlayed;
    }
    
    public void setLastGamePlayed(String lastGamePlayed) {
        this.lastGamePlayed = lastGamePlayed;
    }
    
    public String getEspnHeadShotUrl() {
        return espnHeadShotUrl;
    }
    
    public void setEspnHeadShotUrl(String espnHeadShotUrl) {
        this.espnHeadShotUrl = espnHeadShotUrl;
    }
    
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
} 