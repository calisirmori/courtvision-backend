package com.courtvision.controller;

import com.courtvision.dto.PlayerProfileDto;
import com.courtvision.service.PlayerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/player-profile")
public class PlayerProfileController {

    private final PlayerService playerService;

    public PlayerProfileController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @GetMapping
    public Object getPlayerProfile(
            @RequestParam(required = false) Long personId,
            @RequestParam String season
    ) {
        if (personId != null) {
            return playerService.getPlayerProfile(personId, season);
        } else {
            return playerService.getAllPlayerProfilesForSeason(season);
        }
    }


}
