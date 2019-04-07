package com.christopherwmurphy.BoringButBigBackEnd.repository;

import java.util.List;
import java.util.Set;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.christopherwmurphy.BoringButBigBackEnd.entities.Exercise;

@Repository
public interface ExerciseRepository extends CrudRepository<Exercise, Integer>{
	public Exercise findById(int id);
	public List<Exercise> findByLanguage(String lang);
	public List<Exercise> findByIdNotIn(Set<Integer> id);
}
