package com.courtvision.repository;

import com.courtvision.model.SeasonalStats;
import com.courtvision.model.SeasonalStatsId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeasonalStatsRepository extends JpaRepository<SeasonalStats, SeasonalStatsId> {
    SeasonalStats findByPlayerIdAndSeason(Long playerId, String season);
}