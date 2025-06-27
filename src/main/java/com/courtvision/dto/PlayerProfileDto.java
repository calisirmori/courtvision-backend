package com.courtvision.dto;

import com.courtvision.model.Player;
import com.courtvision.model.SeasonalStats;

public class PlayerProfileDto {

    private Long playerId;
    private String firstName;
    private String lastName;
    private String displayFirstLast;
    private String birthDate;
    private String country;
    private String school;
    private String position;
    private String jersey;
    private String height;
    private Integer weight;
    private String draftYear;
    private String draftRound;
    private String draftNumber;
    private Integer seasonExp;

    private String season;
    private Long teamId;
    private int gp;
    private double min;
    private double fgm;
    private double fga;
    private double fg3m;
    private double fg3a;
    private double ftm;
    private double fta;
    private double oreb;
    private double dreb;
    private double reb;
    private double ast;
    private double stl;
    private double blk;
    private double tov;
    private double pf;
    private double pts;

    private int gpRank;
    private int fgmRank;
    private int fgaRank;
    private int fg3mRank;
    private int fg3aRank;
    private int fgpctRank;
    private int fg3pctRank;
    private int ptsRank;

    public PlayerProfileDto(Player player, SeasonalStats stats) {
        this.playerId = player.getPlayerId();
        this.firstName = player.getFirstName();
        this.lastName = player.getLastName();
        this.displayFirstLast =  player.getDisplayFirstLast();
        this.birthDate = player.getBirthdate();
        this.country = player.getCountry();
        this.jersey = player.getJersey();
        this.position = player.getPosition();
        this.teamId = stats.getTeamId();
        this.season = stats.getSeason();
        this.school = player.getSchool();
        this.height = player.getHeight();
        this.weight = player.getWeight();
        this.draftYear = player.getDraftYear();
        this.draftRound = player.getDraftRound();
        this.draftNumber = player.getDraftNumber();
        this.seasonExp = player.getSeasonExperience();

        this.gp = stats.getGamesPlayed();
        this.min = stats.getMinutesPerGame();
        this.fgm = stats.getTotalFieldGoalsMade();
        this.fga = stats.getTotalFieldGoalsAttempted();
        this.fg3m = stats.getTotalThreePointersMade();
        this.fg3a = stats.getTotalThreePointersAttempted();
        this.ftm = stats.getFreeThrowsMadePerGame();
        this.fta = stats.getFreeThrowsAttemptedPerGame();
        this.oreb = stats.getOffensiveReboundsPerGame();
        this.dreb = stats.getDefensiveReboundsPerGame();
        this.reb = stats.getReboundsPerGame();
        this.ast = stats.getAssistsPerGame();
        this.stl = stats.getStealsPerGame();
        this.blk = stats.getBlocksPerGame();
        this.tov = stats.getTurnoversPerGame();
        this.pf = stats.getPersonalFoulsPerGame();
        this.pts = stats.getPointsPerGame();

        this.gpRank = stats.getGamesPlayedRank();
        this.fgmRank = stats.getFieldGoalsMadeRank();
        this.fgaRank = stats.getFieldGoalsAttemptedRank();
        this.fg3mRank = stats.getThreePointersMadeRank();
        this.fg3aRank = stats.getThreePointersAttemptedRank();
        this.fgpctRank = stats.getFieldGoalPercentageRank();
        this.fg3pctRank = stats.getThreePointPercentageRank();
        this.ptsRank = stats.getPointsRank();
    }

    public Long getPlayerId() { return playerId; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getDisplayFirstLast() { return displayFirstLast; }
    public String getBirthDate() { return birthDate; }
    public String getCountry() { return country; }
    public String getSchool() { return school; }
    public String getPosition() { return position; }
    public String getJersey() { return jersey; }
    public String getHeight() { return height; }
    public Integer getWeight() { return weight; }
    public String getDraftYear() { return draftYear; }
    public String getDraftRound() { return draftRound; }
    public String getDraftNumber() { return draftNumber; }
    public Integer getSeasonExp() { return seasonExp; }

    public String getSeason() { return season; }
    public Long getTeamId() { return teamId; }
    public int getGp() { return gp; }
    public double getMin() { return min; }
    public double getFgm() { return fgm; }
    public double getFga() { return fga; }
    public double getFg3m() { return fg3m; }
    public double getFg3a() { return fg3a; }
    public double getFtm() { return ftm; }
    public double getFta() { return fta; }
    public double getOreb() { return oreb; }
    public double getDreb() { return dreb; }
    public double getReb() { return reb; }
    public double getAst() { return ast; }
    public double getStl() { return stl; }
    public double getBlk() { return blk; }
    public double getTov() { return tov; }
    public double getPf() { return pf; }
    public double getPts() { return pts; }

    public int getGpRank() { return gpRank; }
    public int getFgmRank() { return fgmRank; }
    public int getFgaRank() { return fgaRank; }
    public int getFg3mRank() { return fg3mRank; }
    public int getFg3aRank() { return fg3aRank; }
    public int getFgpctRank() { return fgpctRank; }
    public int getFg3pctRank() { return fg3pctRank; }
    public int getPtsRank() { return ptsRank; }
}