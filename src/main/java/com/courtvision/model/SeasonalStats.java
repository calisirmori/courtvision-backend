package com.courtvision.model;

import jakarta.persistence.*;

@Entity
@Table(name = "player_season_stats", schema = "courtvision")
@IdClass(SeasonalStatsId.class)
public class SeasonalStats {

    @Id
    @Column(name = "player_id")
    private Long playerId;

    @Id
    @Column(name = "season")
    private String season;

    @Column(name = "pts")
    private int points;

    @Column(name = "ast")
    private int assists;

    //getters/setters

    public Long getPlayerId() {
        return playerId;
    }

    public String getSeason() {
        return season;
    }

    public int getPoints() {
        return points;
    }

    public int getAssists() {
        return assists;
    }
}