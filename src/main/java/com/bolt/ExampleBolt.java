package com.bolt;

import java.util.Map;

import com.bolt.common.CommonListner;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * 
 * This class mimic the bolt logic. you can write business logic in execute
 * method.
 * 
 */

public class ExampleBolt extends CommonListner {

	public static void main(String[] args) {
		// starting listener to accept the tuples.
		startListener();
		ObjectMapper mapper = new ObjectMapper();
		// this while loop will mimic execute method of Bolt.
		while (true) {
			Tuple tuple = receiveTuple(mapper);
			if (tuple != null) {
				// #########################################
				// start bolt logic from here
				execute(tuple);
				// ###########################################
				// end bolt logic from here
			}
		}
	}

	/**
	 * Entire business logic will be written in below method. This execute method
	 * run forever, no need to start or stop this class.
	 * 
	 */
	private static void execute(Tuple tuple) {

		// read tuple and write business logic here.
		// you will be able to get tuple here which you are expected to receive
		// from test cases.

		Map<String, String> example1 = tuple.getExample1();

		String example2 = tuple.getExample2();

		Integer example3 = tuple.getExample3();
		
		
		System.out.println("example tuple received "+example2);
		

	}

}
