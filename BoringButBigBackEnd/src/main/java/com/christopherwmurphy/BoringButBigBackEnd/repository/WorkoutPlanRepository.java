package com.christopherwmurphy.BoringButBigBackEnd.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.christopherwmurphy.BoringButBigBackEnd.entities.WorkoutPlan;
import com.christopherwmurphy.BoringButBigBackEnd.entities.keys.WorkoutPlanPk;

@Repository
public interface WorkoutPlanRepository extends CrudRepository<WorkoutPlan, WorkoutPlanPk>{
	public List<WorkoutPlan> findByIdWorkoutId(int workoutId);
}
