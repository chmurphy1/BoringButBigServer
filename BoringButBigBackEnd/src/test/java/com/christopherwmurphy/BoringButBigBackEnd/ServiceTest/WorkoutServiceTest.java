package com.christopherwmurphy.BoringButBigBackEnd.ServiceTest;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.christopherwmurphy.BoringButBigBackEnd.entities.ExerciseVideos;
import com.christopherwmurphy.BoringButBigBackEnd.entities.Workout;
import com.christopherwmurphy.BoringButBigBackEnd.services.WorkoutService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WorkoutServiceTest {
	
	@Autowired
	private WorkoutService wService;
	
	@Test
	public void WorkoutLanguageDoesNotExist() {
		List<Workout> ws = wService.getWorkoutByLanguage("us");
		assert(ws.isEmpty() == true);
	}
	
	@Test
	public void WorkoutLanguageDoesExist() {
		List<Workout> ws = wService.getWorkoutByLanguage("en");
		assert(!ws.isEmpty() == true);
	}
	
	@Test
	public void WorkoutLanguageIsNull() {
		List<Workout> ws = wService.getWorkoutByLanguage(null);
		assert(ws.isEmpty() == true);
	}
	
	@Test
	public void getAllWorkouts() {
		List<Workout> w = wService.getAllWorkouts();
		assert(!w.isEmpty() == true);
	}
}
