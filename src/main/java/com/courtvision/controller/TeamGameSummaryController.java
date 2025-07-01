package com.courtvision.controller;

import com.courtvision.dto.TeamGameSummaryDto;
import com.courtvision.service.TeamGameSummaryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/game-summary")
public class TeamGameSummaryController {

    private final TeamGameSummaryService teamGameSummaryService;

    public TeamGameSummaryController(TeamGameSummaryService teamGameSummaryService) {
        this.teamGameSummaryService = teamGameSummaryService;
    }

    @GetMapping
    public List<TeamGameSummaryDto> getGameSummaries(
            @RequestParam("season") String season,
            @RequestParam("teamId") long teamId
    ) {
        return teamGameSummaryService.getGameSummariesByTeamAndSeason(season, teamId);
    }
}
