package com.bolt;


import org.junit.Test;

import com.bolt.Tuple;

/**
 * Complete your test cases in this class.
 * 
 */

public class ExampleBoltTest extends Dispatcher {

	@Test
	public void exampleToSendTuple() throws InterruptedException {
		Tuple tuple = new Tuple();
		tuple.setExample2("test1");
		tuple.setExample3(new Integer(1));
		
		Dispatcher.send(tuple);
	}

}
