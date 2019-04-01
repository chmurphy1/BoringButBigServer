package com.christopherwmurphy.BoringButBigBackEnd.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.christopherwmurphy.BoringButBigBackEnd.entities.SetScheme;
import com.christopherwmurphy.BoringButBigBackEnd.entities.Workout;
import com.christopherwmurphy.BoringButBigBackEnd.entities.WorkoutPlan;
import com.christopherwmurphy.BoringButBigBackEnd.services.SetSchemeService;
import com.christopherwmurphy.BoringButBigBackEnd.services.WorkoutPlanService;
import com.christopherwmurphy.BoringButBigBackEnd.services.WorkoutService;

@RestController
public class WorkoutController {

	@Autowired
	WorkoutService ws;
	
	@Autowired
	WorkoutPlanService wps;
	
	@Autowired
	SetSchemeService sss;
	
	@RequestMapping("/WorkoutByLang")
	public List<Workout> getWorkoutsByLanguage(@RequestParam(value="language") String lang){
		return ws.getWorkoutByLanguage(lang);
	}
	
	@RequestMapping("/WorkoutAll")
	public List<Workout> getAllWorkouts(){
		return ws.getAllWorkouts();
	}
	
	@RequestMapping("/WorkoutPlansAll")
	public List<WorkoutPlan> getAllWorkoutPlans(){
		return wps.getAllWorkoutPlans();
	}
	
	@RequestMapping("/WorkoutPlansById")
	public List<WorkoutPlan> getWorkoutPlansById(@RequestParam(value="id") int id){
		return wps.getWorkoutPlanById(id);
	}
	
	@RequestMapping("/SetSchemeAll")
	public List<SetScheme> getAllSetSchemes(){
		return sss.getAllSetSchemes();
	}
	
	@RequestMapping("/SetSchemeById")
	public SetScheme getSetSchemesById(@RequestParam(value="id") int id){
		return sss.getSetSchemeById(id);
	}
}
