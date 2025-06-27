package com.courtvision.dto;

public class SeasonalStatsDto {
    private String season;
    private Long playerId;
    private double pts;
    private double ast;

    public SeasonalStatsDto(String season, Long playerId, double pts, double ast) {
        this.season = season;
        this.playerId = playerId;
        this.pts = pts;
        this.ast = ast;
    }

    // Getters
    public String getSeason() {
        return season;
    }

    public Long getPlayerId() {
        return playerId;
    }

    public double getPoints() {
        return pts;
    }

    public double getAssists() {
        return ast;
    }
}
