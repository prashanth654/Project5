package com.basic;

import org.apache.log4j.Logger;

public class EvenOrOdd {

	public static Logger logger = Logger.getLogger(EvenOrOdd.class);

	public String isEvenOrOdd(int num) {
		String status;
		if (num % 2 == 0) {
			status = "Even";
			logger.info("the given number is"+num+" :"+status);
		} else {
			status = "Odd";
			logger.info("the given number is"+num+" :"+status);
		}
		return status;
	}

}
