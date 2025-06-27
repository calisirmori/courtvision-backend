package com.courtvision.service;

import com.courtvision.dto.SeasonalStatsDto;
import com.courtvision.model.SeasonalStats;
import com.courtvision.repository.SeasonalStatsRepository;
import org.springframework.stereotype.Service;

@Service
public class SeasonalStatsService {

    private final SeasonalStatsRepository seasonalStatsRepository;

    public SeasonalStatsService(SeasonalStatsRepository seasonalStatsRepository) {
        this.seasonalStatsRepository = seasonalStatsRepository;
    }

    public SeasonalStatsDto getSeasonalStats(Long id, String season) {
        SeasonalStats seasonalStats = seasonalStatsRepository.findByPlayerIdAndSeason(id, season);

        return new SeasonalStatsDto(
                seasonalStats.getSeason(),
                seasonalStats.getPlayerId(),
                seasonalStats.getPoints(),
                seasonalStats.getAssists()
        );
    }
}
