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
import com.christopherwmurphy.BoringButBigBackEnd.entities.SetScheme;
import com.christopherwmurphy.BoringButBigBackEnd.services.SetSchemeService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SetSchemeServiceTest {

	@Autowired
	SetSchemeService ssSer;
	
	@Test
	public void getSetSchemeByNegativeId() {
		SetScheme scheme = ssSer.getSetSchemeById(-1);
		assert(scheme == null);
	}
	
	@Test
	public void getSetSchemeByPositiveId() {
		SetScheme scheme = ssSer.getSetSchemeById(3);
		assert(scheme != null);
	}
	
	@Test
	public void getSchemeByInvalidId() {
		SetScheme scheme = ssSer.getSetSchemeById(3000);
		assert(scheme == null);
	}
	
	@Test
	public void getAllSchemes() {
		List<SetScheme> schemes = ssSer.getAllSetSchemes();
		assert(!schemes.isEmpty() == true);
	}
	
	@Test
	public void getAllSchemesNotInList() {
		Set<Integer> id = new HashSet();
		
		id.add(new Integer(1));
		id.add(new Integer(5));
		id.add(new Integer(10));
		
		List<SetScheme> list= ssSer.getExerciseNotInId(id);
		assert((list != null) && (!list.isEmpty()));
	}
}
