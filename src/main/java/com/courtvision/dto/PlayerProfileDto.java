package com.courtvision.dto;

public class PlayerProfileDto {

    private String fullName;
    private String position;
    private String jersey;
    private String teamName;

    public PlayerProfileDto(String fullName, String position, String jersey, String teamName) {
        this.fullName = fullName;
        this.position = position;
        this.jersey = jersey;
        this.teamName = teamName;
    }

    // Getters
    public String getFullName() {
        return fullName;
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
