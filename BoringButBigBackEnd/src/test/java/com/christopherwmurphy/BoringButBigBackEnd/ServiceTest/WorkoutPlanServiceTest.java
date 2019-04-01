package com.christopherwmurphy.BoringButBigBackEnd.ServiceTest;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.christopherwmurphy.BoringButBigBackEnd.entities.Workout;
import com.christopherwmurphy.BoringButBigBackEnd.entities.WorkoutPlan;
import com.christopherwmurphy.BoringButBigBackEnd.services.WorkoutPlanService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WorkoutPlanServiceTest {

	@Autowired
	WorkoutPlanService wps;
	
	@Test
	public void getWorkoutPlanByPositiveId() {
		List<WorkoutPlan> wp = wps.getWorkoutPlanById(1);
		assert((wp != null) && (!wp.isEmpty()));
	}
	
	@Test
	public void getWorkoutPlanByNegativeId() {
		List<WorkoutPlan> wp = wps.getWorkoutPlanById(-1);
		assert(wp == null);
	}
	
	@Test
	public void getWorkoutPlanByInvalidId() {
		List<WorkoutPlan> wp = wps.getWorkoutPlanById(100);
		assert(wp.isEmpty());
	}
	
	@Test
	public void getAllWorkoutPlans() {
		List<WorkoutPlan> w = wps.getAllWorkoutPlans();
		assert(!w.isEmpty() == true);
	}
}
