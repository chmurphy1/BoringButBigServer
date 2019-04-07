package com.christopherwmurphy.BoringButBigBackEnd.ServiceTest;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.christopherwmurphy.BoringButBigBackEnd.entities.Exercise;
import com.christopherwmurphy.BoringButBigBackEnd.services.ExerciseService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ExerciseServiceTest {

	@Autowired
	ExerciseService eSer;
	
	@Test
	public void getExerciseByPositiveId() {
		Exercise ex = eSer.getExerciseById(2);
		assert((ex != null) && ("Squat".equals(ex.getName())));
	}	
	
	@Test
	public void getExerciseByNegativeId() {
		Exercise ex = eSer.getExerciseById(-1);
		assert(ex == null);
	}
	
	@Test
	public void getExerciseByInvalidId() {
		Exercise ex = eSer.getExerciseById(100000);
		assert(ex == null);
	}
	
	@Test
	public void getAllExercises() {
		List<Exercise> ex = eSer.getAllExercises();
		assert(ex != null);
	}
	
	@Test
	public void getExerciseByLang() {
		List<Exercise> ex = eSer.getExersizeByLang("en");
		assert((ex != null) && (!ex.isEmpty()));
	}
	
	@Test
	public void getExerciseByInvalidLang() {
		List<Exercise> ex = eSer.getExersizeByLang("abc");
		assert((ex != null) && (ex.isEmpty()));
	}
	
	@Test
	public void getExerciseNotInId() {
		Set<Integer> id = new HashSet<>();
		
		id.add(new Integer(1));
		id.add(new Integer(5));
		id.add(new Integer(10));
		
		List<Exercise> list= eSer.getExerciseNotInId(id);
		assert((list != null) && (!list.isEmpty()));
	}
}
