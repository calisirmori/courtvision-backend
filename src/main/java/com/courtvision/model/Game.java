package com.courtvision.model;

import jakarta.persistence.*;

@Entity
@Table(name = "game", schema = "courtvision")
public class Game {

    @Id
    @Column(name = "game_id", length = 10)
    private String gameId;

    @Column(name = "game_date")
    private String gameDate;

    @Column(name = "team_id_home")
    private long teamIdHome;

    @Column(name = "team_id_away")
    private long teamIdAway;

    @Column(name = "wl_home")
    private String wlHome;

    @Column(name = "season")
    private String season;

    // Getters only

    public String getGameId() {
        return gameId;
    }

    public String getGameDate() {
        return gameDate;
    }

    public long getTeamIdHome() {
        return teamIdHome;
    }

    public long getTeamIdAway() {
        return teamIdAway;
    }

    public String getWlHome() {
        return wlHome;
    }

    public String getSeason() {
        return season;
    }
}
