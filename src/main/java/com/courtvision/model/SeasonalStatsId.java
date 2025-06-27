package com.courtvision.model;

import jakarta.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class SeasonalStatsId implements Serializable {

    private Long playerId;
    private String season;

    public SeasonalStatsId() {}

    public SeasonalStatsId(Long playerId, String season) {
        this.playerId = playerId;
        this.season = season;
    }

    public Long getPlayerId() {
        return playerId;
    }

    public String getSeason() {
        return season;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SeasonalStatsId)) return false;
        SeasonalStatsId that = (SeasonalStatsId) o;
        return Objects.equals(playerId, that.playerId) &&
                Objects.equals(season, that.season);
    }

    @Override
    public int hashCode() {
        return Objects.hash(playerId, season);
    }
}