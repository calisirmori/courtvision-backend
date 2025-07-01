package com.courtvision.model;

import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class ShotChartId implements Serializable {

    private String gameId;
    private Integer gameEventId;

    public ShotChartId() {}

    public ShotChartId(String gameId, Integer gameEventId) {
        this.gameId = gameId;
        this.gameEventId = gameEventId;
    }

    public String getGameId() {
        return gameId;
    }

    public Integer getGameEventId() {
        return gameEventId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ShotChartId)) return false;
        ShotChartId that = (ShotChartId) o;
        return Objects.equals(gameId, that.gameId) && Objects.equals(gameEventId, that.gameEventId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gameId, gameEventId);
    }
}
