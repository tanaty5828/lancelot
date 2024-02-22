package com.arthur.lancelot.controller;

import com.arthur.lancelot.logic.TaskLogic;
import com.arthur.lancelot.service.TaskService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@ContextConfiguration(classes = {TaskController.class, TaskService.class, TaskLogic.class})
@ExtendWith(SpringExtension.class)
class TaskControllerTest {
	@Autowired
	private TaskController taskController;

	/**
	 * Method under test: {@link TaskController#plus(Integer, Integer)}
	 */
	@Test
	void testPlus() throws Exception {
		// Arrange
		MockHttpServletRequestBuilder getResult = MockMvcRequestBuilders.get("/plus");
		MockHttpServletRequestBuilder paramResult = getResult.param("a", String.valueOf(1));
		MockHttpServletRequestBuilder requestBuilder = paramResult.param("b", String.valueOf(1));

		// Act and Assert
		MockMvcBuilders.standaloneSetup(taskController)
				.build()
				.perform(requestBuilder)
				.andExpect(MockMvcResultMatchers.status().isOk())
				.andExpect(MockMvcResultMatchers.content().contentType("text/plain;charset=ISO-8859-1"))
				.andExpect(MockMvcResultMatchers.content().string("2"));
	}

	/**
	 * Method under test: {@link TaskController#plus(Integer, Integer)}
	 */
	@Test
	void testPlus2() throws Exception {
		// Arrange
		MockHttpServletRequestBuilder getResult = MockMvcRequestBuilders.get("/plus", "Uri Variables");
		MockHttpServletRequestBuilder paramResult = getResult.param("a", String.valueOf(1));
		MockHttpServletRequestBuilder requestBuilder = paramResult.param("b", String.valueOf(1));

		// Act and Assert
		MockMvcBuilders.standaloneSetup(taskController)
				.build()
				.perform(requestBuilder)
				.andExpect(MockMvcResultMatchers.status().isOk())
				.andExpect(MockMvcResultMatchers.content().contentType("text/plain;charset=ISO-8859-1"))
				.andExpect(MockMvcResultMatchers.content().string("2"));
	}
}
