package com.christopherwmurphy.BoringButBigBackEnd.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.christopherwmurphy.BoringButBigBackEnd.entities.SetScheme;

@Repository
public interface SetSchemeRepository extends CrudRepository<SetScheme, Integer>{
	public SetScheme findById(int setId);
	public List<SetScheme> findBySetIdNotIn(List<Integer> setId);
}
