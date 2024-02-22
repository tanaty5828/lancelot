package com.arthur.lancelot.service;

import com.arthur.lancelot.logic.TaskLogic;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TaskService {

	private final TaskLogic taskLogic;

	public Integer plus(Integer valueA, Integer valueB) {
		return taskLogic.plus(valueA, valueB);
	}

	public Double calculateConsumptionTax(String pricesString) {
		List<Integer> numberList = Arrays.stream(pricesString.split(","))
				.map(Integer::parseInt)
				.collect(Collectors.toList());

		return taskLogic.calculateTotalWithTax(numberList);
	}
}
