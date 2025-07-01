package com.courtvision.model;

import jakarta.persistence.*;

@Entity
@Table(name = "shot_chart", schema = "courtvision")
public class ShotChart {

    @EmbeddedId
    private ShotChartId id;

    @Column(name = "team_id")
    private Long teamId;

    @Column(name = "player_id")
    private Long playerId;

    private Integer period;

    @Column(name = "minutes_remaining")
    private Integer minutesRemaining;

    @Column(name = "seconds_remaining")
    private Integer secondsRemaining;

    @Column(name = "event_type")
    private String eventType;

    @Column(name = "action_type")
    private String actionType;

    @Column(name = "shot_type")
    private String shotType;

    @Column(name = "shot_zone_basic")
    private String shotZoneBasic;

    @Column(name = "shot_zone_area")
    private String shotZoneArea;

    @Column(name = "shot_zone_range")
    private String shotZoneRange;

    @Column(name = "shot_distance")
    private Integer shotDistance;

    @Column(name = "loc_x")
    private Integer locX;

    @Column(name = "loc_y")
    private Integer locY;

    @Column(name = "shot_attempted_flag")
    private Integer shotAttemptedFlag;

    @Column(name = "shot_made_flag")
    private Integer shotMadeFlag;

    private String season;

    public ShotChartId getId() {
        return id;
    }

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
