package com.christopherwmurphy.BoringButBigBackEnd.ServiceTest;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.christopherwmurphy.BoringButBigBackEnd.entities.ExerciseSteps;
import com.christopherwmurphy.BoringButBigBackEnd.entities.keys.ExerciseStepsPk;
import com.christopherwmurphy.BoringButBigBackEnd.services.ExerciseStepsService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ExerciseStepsServiceTest {

	@Autowired
	ExerciseStepsService ess;
	
	@Test
	public void findStepsByPositiveId() {
		List<ExerciseSteps> steps = ess.getExerciseStepsByStepId(1);
		assert((steps!=null) && (!steps.isEmpty()));
	}
	
	@Test
	public void findStepsByNegativeId() {
		List<ExerciseSteps> steps = ess.getExerciseStepsByStepId(-1);
		assert(steps==null);
	}
	
	@Test
	public void findStepsByInvalidId() {
		List<ExerciseSteps> steps = ess.getExerciseStepsByStepId(1564);
		assert(steps.isEmpty()==true);
	}	
	
	@Test
	public void findStepsNotInId() {
		List<ExerciseStepsPk> pk =  new ArrayList();
		
		pk.add(new ExerciseStepsPk(new Integer(1), new Integer(3)));
		pk.add(new ExerciseStepsPk(new Integer(1), new Integer(4)));
		
		List<ExerciseSteps> steps = ess.getStepsNotInList(pk);
		assert(steps != null && !steps.isEmpty());
	}
}
