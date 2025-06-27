package com.courtvision.model;

import jakarta.persistence.*;

@Entity
@Table(name = "common_player_info", schema = "courtvision")
public class Player {

    @Id
    @Column(name = "person_id")
    private Long playerId;

    @Column(name = "display_first_last")
    private String displayFirstLast;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "birthdate")
    private String birthdate;

    @Column(name = "height")
    private String height;

    @Column(name = "weight")
    private Integer  weight;

    @Column(name = "country")
    private String country;

    @Column(name = "school")
    private String school;

    @Column(name = "season_exp")
    private Integer seasonExp;

    @Column(name = "draft_year")
    private String draftYear;

    @Column(name = "draft_round")
    private String draftRound;

    @Column(name = "draft_number")
    private String draftNumber;

    @Column(name = "position")
    private String position;

    @Column(name = "jersey")
    private String jersey;

    @Column(name = "team_name")
    private String teamName;

    // Getters
    public Long getPlayerId() {
        return playerId;
    }

    public String getDisplayFirstLast() {
        return displayFirstLast;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getBirthdate() {
        if (birthdate == null) return null;
        return birthdate.length() >= 10 ? birthdate.substring(0, 10) : birthdate;
    }

    public String getHeight() {
        return height;
    }

    public Integer getWeight() {
        return weight;
    }

    public String getCountry() {
        return country;
    }

    public String getSchool() {
        return school;
    }

    public Integer getSeasonExperience() {
        return seasonExp;
    }

    public String getDraftYear() {
        return draftYear;
    }

    public String getDraftRound() {
        return draftRound;
    }

    public String getDraftNumber() {
        return draftNumber;
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
