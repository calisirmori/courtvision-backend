package com.courtvision.service;

import com.courtvision.dto.PlayerDto;
import com.courtvision.dto.PlayerProfileDto;
import com.courtvision.model.Player;
import com.courtvision.model.SeasonalStats;
import com.courtvision.repository.PlayerRepository;
import com.courtvision.repository.SeasonalStatsRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class PlayerService {

    private final PlayerRepository playerRepository;
    private final SeasonalStatsRepository seasonalStatsRepository;

    public PlayerService(PlayerRepository playerRepository, SeasonalStatsRepository seasonalStatsRepository) {
        this.playerRepository = playerRepository;
        this.seasonalStatsRepository = seasonalStatsRepository;
    }

    public PlayerDto getPlayerProfile(Long personId) {
        Player player = playerRepository.findById(personId).orElseThrow(() ->
                new RuntimeException("Player not found")
        );
        return new PlayerDto(
                player.getDisplayFirstLast(),
                player.getPosition(),
                player.getJersey(),
                player.getTeamName()
        );
    }

    public PlayerProfileDto getPlayerProfile(Long personId, String season) {
        Player player = playerRepository.findById(personId)
                .orElseThrow(() -> new RuntimeException("Player not found"));

        SeasonalStats stats = seasonalStatsRepository.findByPlayerIdAndSeason(personId, season);

        return new PlayerProfileDto(player, stats);
    }

    public List<PlayerProfileDto> getAllPlayerProfilesForSeason(String season) {
        List<Player> players = playerRepository.findAll();
        List<Long> playerIds = players.stream().map(Player::getPlayerId).toList();

        List<SeasonalStats> statsList = seasonalStatsRepository.findAllBySeasonAndPlayerIds(season, playerIds);

        Map<Long, SeasonalStats> statsMap = statsList.stream()
                .collect(Collectors.toMap(SeasonalStats::getPlayerId, s -> s));

        List<PlayerProfileDto> profiles = new ArrayList<>();
        for (Player player : players) {
            SeasonalStats stats = statsMap.get(player.getPlayerId());
            if (stats != null) {
                profiles.add(new PlayerProfileDto(player, stats));
            }
        }
        return profiles;
    }

}
