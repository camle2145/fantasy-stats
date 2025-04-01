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