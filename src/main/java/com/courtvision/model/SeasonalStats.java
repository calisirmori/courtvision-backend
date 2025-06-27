package com.courtvision.model;

import jakarta.persistence.*;

@Entity
@Table(name = "player_season_stats", schema = "courtvision")
@IdClass(SeasonalStatsId.class)
public class SeasonalStats {

    @Id
    @Column(name = "player_id")
    private Long playerId;

    @Id
    @Column(name = "season")
    private String season;

    @Column(name = "team_id")
    private Long teamId;

    @Column(name = "age")
    private int age;

    @Column(name = "gp")
    private int gp;


    @Column(name = "min")
    private double min;

    @Column(name = "fgm")
    private double fgm;

    @Column(name = "fga")
    private double fga;

    @Column(name = "fg3m")
    private double fg3m;

    @Column(name = "fg3a")
    private double fg3a;

    @Column(name = "ftm")
    private double ftm;

    @Column(name = "fta")
    private double fta;

    @Column(name = "oreb")
    private double oreb;

    @Column(name = "dreb")
    private double dreb;

    @Column(name = "reb")
    private double reb;

    @Column(name = "ast")
    private int ast;

    @Column(name = "stl")
    private int stl;

    @Column(name = "blk")
    private int blk;

    @Column(name = "tov")
    private int tov;

    @Column(name = "pf")
    private int pf;

    @Column(name = "pts")
    private int pts;

    @Column(name = "min_rank")
    private int minRank;

    @Column(name = "gp_rank")
    private int gpRank;

    @Column(name = "fgm_rank")
    private int fgmRank;

    @Column(name = "fga_rank")
    private int fgaRank;

    @Column(name = "fg3m_rank")
    private int fg3mRank;

    @Column(name = "fg3a_rank")
    private int fg3aRank;

    @Column(name = "fg_pct_rank")
    private int fgpctRank;

    @Column(name = "fg3_pct_rank")
    private int fg3pctRank;

    @Column(name = "pts_rank")
    private int ptsRank;



    //getters
    public Long getPlayerId() {
        return playerId;
    }

    public String getSeason() {
        return season;
    }

    public Long getTeamId() {
        return teamId;
    }

    public int getAge() {
        return age;
    }

    public int getGamesPlayed() {
        return gp;
    }

    public double getMinutesPerGame() {
        return gp > 0 ? Math.round(min / gp * 10.0) / 10.0 : 0;
    }

    public double getFieldGoalsMadePerGame() {
        return gp > 0 ? Math.round(fgm / gp * 10.0) / 10.0 : 0;
    }

    public double getFieldGoalsAttemptedPerGame() {
        return gp > 0 ? Math.round(fga / gp * 10.0) / 10.0 : 0;
    }

    public double getThreePointersMadePerGame() {
        return gp > 0 ? Math.round(fg3m / gp * 10.0) / 10.0 : 0;
    }

    public double getThreePointersAttemptedPerGame() {
        return gp > 0 ? Math.round(fg3a / gp * 10.0) / 10.0 : 0;
    }

    public double getFreeThrowsMadePerGame() {
        return gp > 0 ? Math.round(ftm / gp * 10.0) / 10.0 : 0;
    }

    public double getFreeThrowsAttemptedPerGame() {
        return gp > 0 ? Math.round(fta / gp * 10.0) / 10.0 : 0;
    }

    public double getOffensiveReboundsPerGame() {
        return gp > 0 ? Math.round(oreb / gp * 10.0) / 10.0 : 0;
    }

    public double getDefensiveReboundsPerGame() {
        return gp > 0 ? Math.round(dreb / gp * 10.0) / 10.0 : 0;
    }

    public double getReboundsPerGame() {
        return gp > 0 ? Math.round(reb / gp * 10.0) / 10.0 : 0;
    }

    public double getAssistsPerGame() {
        return gp > 0 ? Math.round((double) ast / gp * 10.0) / 10.0 : 0;
    }

    public double getStealsPerGame() {
        return gp > 0 ? Math.round((double) stl / gp * 10.0) / 10.0 : 0;
    }

    public double getBlocksPerGame() {
        return gp > 0 ? Math.round((double) blk / gp * 10.0) / 10.0 : 0;
    }

    public double getTurnoversPerGame() {
        return gp > 0 ? Math.round((double) tov / gp * 10.0) / 10.0 : 0;
    }

    public double getPersonalFoulsPerGame() {
        return gp > 0 ? Math.round((double) pf / gp * 10.0) / 10.0 : 0;
    }

    public double getPointsPerGame() {
        return gp > 0 ? Math.round((double) pts / gp * 10.0) / 10.0 : 0;
    }

    public double getTotalFieldGoalsMade() {
        return fgm;
    }

    //totals
    public double getTotalFieldGoalsAttempted() {
        return fga;
    }

    public double getTotalThreePointersMade() {
        return fg3m;
    }

    public double getTotalThreePointersAttempted() {
        return fg3a;
    }

    // Rank getters
    public int getMinutesRank() {
        return minRank;
    }

    public int getGamesPlayedRank() {
        return gpRank;
    }

    public int getFieldGoalsMadeRank() {
        return fgmRank;
    }

    public int getFieldGoalsAttemptedRank() {
        return fgaRank;
    }

    public int getThreePointersMadeRank() {
        return fg3mRank;
    }

    public int getThreePointersAttemptedRank() {
        return fg3aRank;
    }

    public int getFieldGoalPercentageRank() {
        return fgpctRank;
    }

    public int getThreePointPercentageRank() {
        return fg3pctRank;
    }

    public int getPointsRank() {
        return ptsRank; // You might want to rename this to ptsRank to match intent
    }
}