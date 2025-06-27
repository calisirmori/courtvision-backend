package com.courtvision.dto;

public class SeasonalStatsDto {
    private String season;
    private Long playerId;
    private int pts;
    private int ast;

    public SeasonalStatsDto(String season, Long playerId, int pts, int ast) {
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

    public int getPoints() {
        return pts;
    }

    public int getAssists() {
        return ast;
    }
}
