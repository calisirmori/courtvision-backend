package com.courtvision.dto;

public class TeamGameSummaryDto {
    private String gameId;
    private String gameDate;
    private long teamIdHome;
    private long teamIdAway;
    private Long winningTeamId;

    public TeamGameSummaryDto(String gameId, String gameDate, long teamIdHome, long teamIdAway, Long winningTeamId) {
        this.gameId = gameId;
        this.gameDate = gameDate;
        this.teamIdHome = teamIdHome;
        this.teamIdAway = teamIdAway;
        this.winningTeamId = winningTeamId;
    }

    public String getGameId() { return gameId; }
    public String getGameDate() { return gameDate; }
    public long getTeamIdHome() { return teamIdHome; }
    public long getTeamIdAway() { return teamIdAway; }
    public Long getWinningTeamId() { return winningTeamId; }
}