package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class ControllerTest {

	private Controller controller;
	
	
	@BeforeEach
	public void init() { 
		controller = new Controller();
	}
	 
	
	@Test
	void testGetMessage() {
		assertNotNull(controller);  
		assertNotNull(controller.getMessage());  
	}
}
