package com.arthur.lancelot.logic;

import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class TaskLogic {
	private static final double TAX_RATE = 1.1;

	public Integer plus(Integer valueA, Integer valueB) {
		log.info("inside TaskLogic");
		return valueA + valueB;
	}

	public double calculateTotalWithTax(List<Integer> numbers) {
		return numbers.stream()
				.mapToDouble(i -> i * TAX_RATE)
				.sum();
	}
}
