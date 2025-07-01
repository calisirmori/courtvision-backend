package com.courtvision.repository;

import com.courtvision.model.ShotChart;
import com.courtvision.model.ShotChartId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShotChartRepository extends JpaRepository<ShotChart, ShotChartId> {
    List<ShotChart> findByPlayerIdAndSeason(Long playerId, String season);
}
