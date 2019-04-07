package com.christopherwmurphy.BoringButBigBackEnd.repository;

import java.util.List;
import java.util.Set;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.christopherwmurphy.BoringButBigBackEnd.entities.Workout;

@Repository
public interface WorkoutRepository extends CrudRepository<Workout, Integer>{

	public List<Workout> findByLanguage(String language);
	public List<Workout> findByWorkoutIdNotIn(Set<Integer> id);
}
