package com.courtvision.repository;

import com.courtvision.dto.TeamGameSummaryDto;
import com.courtvision.model.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeamGameSummaryRepository extends JpaRepository<Game, String> {

    @Query("""
        SELECT new com.courtvision.dto.TeamGameSummaryDto(
          g.gameId,
          g.gameDate,
          g.teamIdHome,
          g.teamIdAway,
          CASE 
            WHEN g.wlHome = 'W' THEN g.teamIdHome
            WHEN g.wlHome = 'L' THEN g.teamIdAway
            ELSE null
          END
        )
        FROM Game g
        WHERE g.season = :season
          AND (g.teamIdHome = :teamId OR g.teamIdAway = :teamId)
    """)
    List<TeamGameSummaryDto> findGameSummariesByTeamAndSeason(
            @Param("season") String season,
            @Param("teamId") long teamId
    );
}
