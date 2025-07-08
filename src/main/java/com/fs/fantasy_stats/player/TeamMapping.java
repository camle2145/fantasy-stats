package com.fs.fantasy_stats.player;

import java.util.HashMap;
import java.util.Map;

public class TeamMapping {
    
    private static final Map<Integer, String> TEAM_NAMES = new HashMap<>();
    
    static {
        // NFL Team mappings
        TEAM_NAMES.put(1, "Arizona Cardinals");
        TEAM_NAMES.put(2, "Atlanta Falcons");
        TEAM_NAMES.put(3, "Baltimore Ravens");
        TEAM_NAMES.put(4, "Buffalo Bills");
        TEAM_NAMES.put(5, "Carolina Panthers");
        TEAM_NAMES.put(6, "Chicago Bears");
        TEAM_NAMES.put(7, "Cincinnati Bengals");
        TEAM_NAMES.put(8, "Cleveland Browns");
        TEAM_NAMES.put(9, "Dallas Cowboys");
        TEAM_NAMES.put(10, "Denver Broncos");
        TEAM_NAMES.put(11, "Detroit Lions");
        TEAM_NAMES.put(12, "Green Bay Packers");
        TEAM_NAMES.put(13, "Houston Texans");
        TEAM_NAMES.put(14, "Indianapolis Colts");
        TEAM_NAMES.put(15, "Jacksonville Jaguars");
        TEAM_NAMES.put(16, "Kansas City Chiefs");
        TEAM_NAMES.put(17, "Las Vegas Raiders");
        TEAM_NAMES.put(18, "Los Angeles Chargers");
        TEAM_NAMES.put(19, "Los Angeles Rams");
        TEAM_NAMES.put(20, "Miami Dolphins");
        TEAM_NAMES.put(21, "Minnesota Vikings");
        TEAM_NAMES.put(22, "New England Patriots");
        TEAM_NAMES.put(23, "New Orleans Saints");
        TEAM_NAMES.put(24, "New York Giants");
        TEAM_NAMES.put(25, "New York Jets");
        TEAM_NAMES.put(26, "Philadelphia Eagles");
        TEAM_NAMES.put(27, "Pittsburgh Steelers");
        TEAM_NAMES.put(28, "San Francisco 49ers");
        TEAM_NAMES.put(29, "Seattle Seahawks");
        TEAM_NAMES.put(30, "Tampa Bay Buccaneers");
        TEAM_NAMES.put(31, "Tennessee Titans");
        TEAM_NAMES.put(32, "Washington Commanders");
    }
    
    public static String getTeamName(int teamId) {
        return TEAM_NAMES.getOrDefault(teamId, "Unknown Team (" + teamId + ")");
    }
    
    public static Map<Integer, String> getAllTeams() {
        return new HashMap<>(TEAM_NAMES);
    }
    
    public static Integer getTeamIdByName(String teamName) {
        for (Map.Entry<Integer, String> entry : TEAM_NAMES.entrySet()) {
            if (entry.getValue().equalsIgnoreCase(teamName)) {
                return entry.getKey();
            }
        }
        return null;
    }
} 