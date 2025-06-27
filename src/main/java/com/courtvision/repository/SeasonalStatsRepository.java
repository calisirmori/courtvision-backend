package com.courtvision.repository;

import com.courtvision.model.SeasonalStats;
import com.courtvision.model.SeasonalStatsId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SeasonalStatsRepository extends JpaRepository<SeasonalStats, SeasonalStatsId> {
    SeasonalStats findByPlayerIdAndSeason(Long playerId, String season);

    @Query("SELECT s FROM SeasonalStats s WHERE s.season = :season AND s.playerId IN :playerIds")
    List<SeasonalStats> findAllBySeasonAndPlayerIds(@Param("season") String season, @Param("playerIds") List<Long> playerIds);
}
