package com.courtvision.controller;

import com.courtvision.dto.SeasonalStatsDto;
import com.courtvision.service.SeasonalStatsService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/seasonal-stats")
public class SeasonalStatsController {
    private final SeasonalStatsService seasonalStatsService;

    public SeasonalStatsController(SeasonalStatsService seasonalStatsService) {
        this.seasonalStatsService = seasonalStatsService;
    }

    @GetMapping
    public SeasonalStatsDto getSeasonalStats(
            @RequestParam Long personId,
            @RequestParam String season
    ) {
        return seasonalStatsService.getSeasonalStats(personId, season);
    }
}
