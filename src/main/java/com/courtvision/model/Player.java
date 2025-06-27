package com.courtvision.model;

import jakarta.persistence.*;

@Entity
@Table(name = "common_player_info", schema = "courtvision")
public class Player {

    @Id
    @Column(name = "person_id")
    private Long id;

    @Column(name = "display_first_last")
    private String displayName;

    @Column(name = "position")
    private String position;

    @Column(name = "jersey")
    private String jersey;

    @Column(name = "team_name")
    private String teamName;

    // Getters
    public Long getId() {
        return id;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getPosition() {
        return position;
    }

    public String getJersey() {
        return jersey;
    }

    public String getTeamName() {
        return teamName;
    }
}
