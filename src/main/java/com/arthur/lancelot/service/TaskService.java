package com.arthur.lancelot.service;

import com.arthur.lancelot.logic.TaskLogic;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TaskService {

	private final TaskLogic taskLogic;

	public Integer plus(Integer valueA, Integer valueB) {
		return taskLogic.plus(valueA, valueB);
	}
}
