/*package com.mkyong.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={})
@WebAppConfiguration
public class MultiplicationServiceTest {
	//Write configuration class
	@Configuration
	static class LoginControllerTestConfiguration {
	 
	
	@Bean
	public MultiplicationService loginController() {
	return new MultiplicationService();
	}
	}
	//Autowrie object
	@Autowired
	private MultiplicationService multiplytestobject;
	
	@Test
	public void testHandleMultiply() throws Exception {
	MockMvc mockMvc = MockMvcBuilders.standaloneSetup(this.multiplytestobject).build();
	mockMvc.perform(post("/multiply").param("number1","7").param("number2","7"))
	.andExpect((model().attribute("result", "49")))
	.andExpect(redirectedUrl("/index.htm"));
	}
	
}*/
