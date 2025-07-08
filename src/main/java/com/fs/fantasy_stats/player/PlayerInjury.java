package com.fs.fantasy_stats.player;

import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "player_injuries")
public class PlayerInjury {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "player_id", referencedColumnName = "player_id")
    @JsonIgnore
    private Player player;

    private Integer injuryDate;
    private Integer returnDate;
    
    @Column(length = 400)
    private String description;
    private String designation;

    // Default constructor
    public PlayerInjury() {}

    // Constructor with all fields except id
    public PlayerInjury(Player player, Integer injuryDate, Integer returnDate, String description, String designation) {
        this.player = player;
        this.injuryDate = injuryDate;
        this.returnDate = returnDate;
        this.description = description;
        this.designation = designation;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Integer getInjuryDate() {
        return injuryDate;
    }

    public void setInjuryDate(Integer injuryDate) {
        this.injuryDate = injuryDate;
    }

    public Integer getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Integer returnDate) {
        this.returnDate = returnDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
} 