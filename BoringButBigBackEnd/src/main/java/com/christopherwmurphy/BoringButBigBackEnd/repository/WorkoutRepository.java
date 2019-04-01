package com.christopherwmurphy.BoringButBigBackEnd.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.christopherwmurphy.BoringButBigBackEnd.entities.Workout;

@Repository
public interface WorkoutRepository extends CrudRepository<Workout, Integer>{

	public List<Workout> findByLanguage(String language);
}
