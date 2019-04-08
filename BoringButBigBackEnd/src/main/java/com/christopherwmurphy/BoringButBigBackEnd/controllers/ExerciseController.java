package com.christopherwmurphy.BoringButBigBackEnd.controllers;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.christopherwmurphy.BoringButBigBackEnd.entities.Exercise;
import com.christopherwmurphy.BoringButBigBackEnd.entities.ExerciseSteps;
import com.christopherwmurphy.BoringButBigBackEnd.entities.ExerciseVideos;
import com.christopherwmurphy.BoringButBigBackEnd.entities.Workout;
import com.christopherwmurphy.BoringButBigBackEnd.entities.keys.ExerciseStepsPk;
import com.christopherwmurphy.BoringButBigBackEnd.services.ExerciseService;
import com.christopherwmurphy.BoringButBigBackEnd.services.ExerciseStepsService;
import com.christopherwmurphy.BoringButBigBackEnd.services.ExerciseVideosService;

@RestController
public class ExerciseController {
	
	@Autowired
	ExerciseService es;
	
	@Autowired 
	ExerciseVideosService evs;
	
	@Autowired
	ExerciseStepsService ess; 
	
	@RequestMapping("/ExerciseId")
	public Exercise getExerciseById(@RequestParam(value="id")int id) {
		return es.getExerciseById(id);
	}
	
	@RequestMapping("/ExerciseAll")
	public List<Exercise> getAllExercises() {
		return es.getAllExercises();
	}
	
	@RequestMapping("/ExerciseLang")
	public List<Exercise> getExercisesByLang(@RequestParam(value="language")String lang) {
		return es.getExersizeByLang(lang);
	}
	
	@RequestMapping("/ExerciseVideosAll")
	public List<ExerciseVideos> getAllExerciseVideos(){
		return evs.getAllExerciseVideos();
	}
	
	@RequestMapping("/ExerciseVideoId")
	public ExerciseVideos getExerciseVideobyId(@RequestParam(value="id")int id){
		return evs.getVideoById(id);
	}
	
	@RequestMapping("/ExerciseStepsAll")
	public List<ExerciseSteps> getAllExerciseSteps(){
		return ess.getAllExerciseSteps();
	}
	
	@RequestMapping("/ExerciseSteps")
	public List<ExerciseSteps> getExerciseStepsByIdAndLanguage(@RequestParam(value="id") int id){
		return ess.getExerciseStepsByStepId(id);
	}
	
	@RequestMapping("/ExerciseByIdNotInList")
	public List<Exercise> getExercisesByIdNotInList(@RequestParam(value="id") Set<Integer> id){
		return es.getExerciseNotInId(id);
	}
	
	@RequestMapping("/ExerciseVideosByIdNotInList")
	public List<ExerciseVideos> getExercisesVideosByIdNotInList(@RequestParam(value="id") Set<Integer> id){
		return evs.getExerciseVideosNotInId(id);
	}
	
	@GetMapping("/ExerciseStepsByIdNotInList")
	public List<ExerciseSteps> getExercisesStepsByIdNotInList(@RequestParam(value="id") List<ExerciseStepsPk> id){
		return ess.getStepsNotInList(id);
	}
}
