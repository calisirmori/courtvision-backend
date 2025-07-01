package com.courtvision.service;

import com.courtvision.dto.ShotChartDto;
import com.courtvision.model.ShotChart;
import com.courtvision.repository.ShotChartRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ShotChartService {

    private final ShotChartRepository shotChartRepository;

    public ShotChartService(ShotChartRepository shotChartRepository) {
        this.shotChartRepository = shotChartRepository;
    }

    public List<ShotChartDto> getShotsByPlayerAndSeason(Long playerId, String season) {
        List<ShotChart> shots = shotChartRepository.findByPlayerIdAndSeason(playerId, season);

        return shots.stream()
                .map(shot -> new ShotChartDto(
                        shot.getId(),
                        shot.getTeamId(),
                        shot.getPlayerId(),
                        shot.getPeriod(),
                        shot.getMinutesRemaining(),
                        shot.getSecondsRemaining(),
                        shot.getEventType(),
                        shot.getActionType(),
                        shot.getShotType(),
                        shot.getShotZoneBasic(),
                        shot.getShotZoneArea(),
                        shot.getShotZoneRange(),
                        shot.getShotDistance(),
                        shot.getLocX(),
                        shot.getLocY(),
                        shot.getShotAttemptedFlag(),
                        shot.getShotMadeFlag(),
                        shot.getSeason()
                ))
                .collect(Collectors.toList());
    }
}
