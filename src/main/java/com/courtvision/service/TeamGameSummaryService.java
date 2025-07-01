package com.courtvision.service;

import com.courtvision.dto.TeamGameSummaryDto;
import com.courtvision.repository.TeamGameSummaryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamGameSummaryService {

    private final TeamGameSummaryRepository teamGameSummaryRepository;

    public TeamGameSummaryService(TeamGameSummaryRepository teamGameSummaryRepository) {
        this.teamGameSummaryRepository = teamGameSummaryRepository;
    }

    public List<TeamGameSummaryDto> getGameSummariesByTeamAndSeason(String season, long teamId) {
        return teamGameSummaryRepository.findGameSummariesByTeamAndSeason(season, teamId);
    }
}
