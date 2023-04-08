package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.DailyReport;

@Repository
public interface DailyRepostRepository extends JpaRepository<DailyReport, Integer>{

	@SuppressWarnings("unchecked")
	public DailyReport save(DailyReport dailyReport);

}
