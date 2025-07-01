package com.courtvision.dto;

import com.courtvision.model.ShotChartId;

public class ShotChartDto {
    private final ShotChartId id;
    private final Long teamId;
    private final Long playerId;
    private final Integer period;
    private final Integer minutesRemaining;
    private final Integer secondsRemaining;
    private final String eventType;
    private final String actionType;
    private final String shotType;
    private final String shotZoneBasic;
    private final String shotZoneArea;
    private final String shotZoneRange;
    private final Integer shotDistance;
    private final Integer locX;
    private final Integer locY;
    private final Integer shotAttemptedFlag;
    private final Integer shotMadeFlag;
    private final String season;

    public ShotChartDto(
            ShotChartId id,
            Long teamId,
            Long playerId,
            Integer period,
            Integer minutesRemaining,
            Integer secondsRemaining,
            String eventType,
            String actionType,
            String shotType,
            String shotZoneBasic,
            String shotZoneArea,
            String shotZoneRange,
            Integer shotDistance,
            Integer locX,
            Integer locY,
            Integer shotAttemptedFlag,
            Integer shotMadeFlag,
            String season
    ) {
        this.id = id;
        this.teamId = teamId;
        this.playerId = playerId;
        this.period = period;
        this.minutesRemaining = minutesRemaining;
        this.secondsRemaining = secondsRemaining;
        this.eventType = eventType;
        this.actionType = actionType;
        this.shotType = shotType;
        this.shotZoneBasic = shotZoneBasic;
        this.shotZoneArea = shotZoneArea;
        this.shotZoneRange = shotZoneRange;
        this.shotDistance = shotDistance;
        this.locX = locX;
        this.locY = locY;
        this.shotAttemptedFlag = shotAttemptedFlag;
        this.shotMadeFlag = shotMadeFlag;
        this.season = season;
    }

    public ShotChartId getId() { return id; }
    public Long getTeamId() { return teamId; }
    public Long getPlayerId() { return playerId; }
    public Integer getPeriod() { return period; }
    public Integer getMinutesRemaining() { return minutesRemaining; }
    public Integer getSecondsRemaining() { return secondsRemaining; }
    public String getEventType() { return eventType; }
    public String getActionType() { return actionType; }
    public String getShotType() { return shotType; }
    public String getShotZoneBasic() { return shotZoneBasic; }
    public String getShotZoneArea() { return shotZoneArea; }
    public String getShotZoneRange() { return shotZoneRange; }
    public Integer getShotDistance() { return shotDistance; }
    public Integer getLocX() { return locX; }
    public Integer getLocY() { return locY; }
    public Integer getShotAttemptedFlag() { return shotAttemptedFlag; }
    public Integer getShotMadeFlag() { return shotMadeFlag; }
    public String getSeason() { return season; }
}
