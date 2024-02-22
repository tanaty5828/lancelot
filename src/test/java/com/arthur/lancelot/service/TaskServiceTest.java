package com.arthur.lancelot.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@SpringBootTest
@ExtendWith(SpringExtension.class)
class TaskServiceTest {
	@Autowired
	private TaskService taskService;

	/**
	 * Method under test: {@link TaskService#plus(Integer, Integer)}
	 */
	@Test
	void testPlus() {
		// Arrange, Act and Assert
		assertEquals(84, taskService.plus(42, 42).intValue());
		assertEquals(45, taskService.plus(3, 42).intValue());
		assertEquals(43, taskService.plus(1, 42).intValue());
		assertEquals(42, taskService.plus(0, 42).intValue());
	}
}
