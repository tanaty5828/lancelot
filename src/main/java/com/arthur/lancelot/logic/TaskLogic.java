package com.arthur.lancelot.logic;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class TaskLogic {

	public Integer plus(Integer valueA, Integer valueB) {
		log.info("inside TaskLogic");
		return valueA + valueB;
	}
}
