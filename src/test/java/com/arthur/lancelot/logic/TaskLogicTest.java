package com.arthur.lancelot.logic;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = {TaskLogic.class})
@ExtendWith(SpringExtension.class)
class TaskLogicTest {
	@Autowired
	private TaskLogic taskLogic;

	/**
	 * Method under test: {@link TaskLogic#plus(Integer, Integer)}
	 */
	@Test
	void testPlus() {
		// Arrange, Act and Assert
		assertEquals(84, taskLogic.plus(42, 42).intValue());
		assertEquals(45, taskLogic.plus(3, 42).intValue());
		assertEquals(43, taskLogic.plus(1, 42).intValue());
		assertEquals(42, taskLogic.plus(0, 42).intValue());
	}
}
