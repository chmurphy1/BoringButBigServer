package com.christopherwmurphy.BoringButBigBackEnd.ServiceTest;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.christopherwmurphy.BoringButBigBackEnd.entities.Exercise;
import com.christopherwmurphy.BoringButBigBackEnd.entities.ExerciseVideos;
import com.christopherwmurphy.BoringButBigBackEnd.entities.SetScheme;
import com.christopherwmurphy.BoringButBigBackEnd.services.ExerciseVideosService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ExerciseVideoServiceTest {

	@Autowired
	ExerciseVideosService evSer;
	
	@Test
	public void getVideoUrlByNegativeId() {
		ExerciseVideos vid = evSer.getVideoById(-1);
		assert(vid == null);
	}
	
	@Test 
	public void getVideoUrlByPositiveId() {
		ExerciseVideos vid = evSer.getVideoById(1);
		assert(vid != null);
	}
	
	@Test 
	public void getVideoUrlByInvalidId() {
		ExerciseVideos vid = evSer.getVideoById(1200);
		assert(vid == null);
	}
	
	@Test
	public void getAllExerciseVideos() {
		List<ExerciseVideos> vids = evSer.getAllExerciseVideos();
		assert(!vids.isEmpty() == true);
	}
	
	@Test
	public void getExerciseNotInId() {
		List<Integer> id = new ArrayList<>();
		
		id.add(new Integer(1));
		id.add(new Integer(5));
		id.add(new Integer(10));
		
		List<ExerciseVideos> list=  evSer.getExerciseVideosNotInId(id);
		assert((list != null) && (!list.isEmpty()));
	}
}
