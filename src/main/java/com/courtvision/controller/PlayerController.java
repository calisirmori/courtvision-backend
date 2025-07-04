package com.courtvision.controller;

import com.courtvision.dto.PlayerDto;
import com.courtvision.dto.PlayerProfileDto;
import com.courtvision.service.PlayerService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/players")
public class PlayerController {

    private final PlayerService playerService;

    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @GetMapping("/{playerId}")
    public PlayerDto getPlayerProfile(@PathVariable Long playerId) {
        return playerService.getPlayerProfile(playerId);
    }
}
