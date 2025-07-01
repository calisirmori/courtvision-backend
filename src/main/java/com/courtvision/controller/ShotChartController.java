package com.courtvision.controller;

import com.courtvision.dto.ShotChartDto;
import com.courtvision.model.ShotChart;
import com.courtvision.service.ShotChartService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/shot-chart")
public class ShotChartController {

    private final ShotChartService shotChartService;

    public ShotChartController(ShotChartService shotChartService) {
        this.shotChartService = shotChartService;
    }

    @GetMapping
    public List<ShotChartDto> getShotsByPlayerAndSeason(
            @RequestParam Long playerId,
            @RequestParam String season
    ) {
        return shotChartService.getShotsByPlayerAndSeason(playerId, season);
    }
}
