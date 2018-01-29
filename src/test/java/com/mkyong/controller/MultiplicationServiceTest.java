package com.mkyong.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = "classpath:app-context.xml")
public class MultiplicationServiceTest {
	
	@Autowired
	private MultiplicationService multiplytestobject;

	MockMvc mockMvc ;

	@Autowired
	private WebApplicationContext wac;
	

	public void setMultiplytestobject(MultiplicationService multiplytestobject) {
		this.multiplytestobject = multiplytestobject;
	}
	
	@Before
	public void setup() {
	    this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
	}

	@Test
	public void positiveTest() throws Exception {
		System.out.println("Starting positive testing");
	mockMvc.perform(post("/multiply").param("number1","7").param("number2","7"))
	.andExpect((model().attribute("result", 49)));
	

	mockMvc.perform(post("/multiply").param("number1","-7").param("number2","-7"))
	.andExpect((model().attribute("result", 49)));
	

	mockMvc.perform(post("/multiply").param("number1","7").param("number2","-7"))
	.andExpect((model().attribute("result", -49)));

	System.out.println("End of positive testing");
	}
	

	@Test
	public void negativeTest() throws Exception {

		System.out.println("Starting negative testing");
	mockMvc.perform(post("/multiply").param("number1","8").param("number2","3"))
	.andExpect((model().attribute("error", "Enter valid numbers")));
	

	mockMvc.perform(post("/multiply").param("number1","-8").param("number2","0"))
	.andExpect((model().attribute("error", "Enter valid numbers")));

	System.out.println("End of negative testing");
	}
	
}
