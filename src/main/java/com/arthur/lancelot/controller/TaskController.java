package com.arthur.lancelot.controller;

import com.arthur.lancelot.service.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@EnableConfigurationProperties
class TaskController {

	private final TaskService taskService;

	@RequestMapping("/")
	String debug() {
		return "Hello world!";
	}

	@RequestMapping("/hello")
	String hello(@RequestParam(value = "name", required = false, defaultValue = "John due") String name) {
		return "Hello " + name + "!";
	}

	@RequestMapping("plus")
	String plus(@RequestParam(value = "a", required = true) Integer valueA,
			@RequestParam(value = "b", required = true) Integer valueB) {

		return taskService.plus(valueA, valueB).toString();
	}

	@RequestMapping("consumptionTax")
	Double calculateConsumptionTax(@RequestParam(value = "prices") String prices) {
		return taskService.calculateConsumptionTax(prices);
	}
}
