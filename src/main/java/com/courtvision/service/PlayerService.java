package com.courtvision.service;

import com.courtvision.dto.PlayerProfileDto;
import com.courtvision.model.Player;
import com.courtvision.repository.PlayerRepository;
import org.springframework.stereotype.Service;

@Service
public class PlayerService {

    private final PlayerRepository playerRepository;

    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    public PlayerProfileDto getPlayerProfile(Long id) {
        Player player = playerRepository.findById(id).orElseThrow(() ->
                new RuntimeException("Player not found")
        );
        return new PlayerProfileDto(
                player.getDisplayName(),
                player.getPosition(),
                player.getJersey(),
                player.getTeamName()
        );
    }
}
