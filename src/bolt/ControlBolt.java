package bolt;

import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ControlBolt {

	private static LinkedBlockingQueue<String> queue = new LinkedBlockingQueue<String>();
	/**
	 * @param args
	 */
	static ObjectMapper mapper;

	public static void main(String[] args) {
		// starting listener to accept the tuples.
		startListener();
		mapper = new ObjectMapper();
		// this while loop will mimic execute method of Bolt.
		while (true) {
			Tuple tuple = receiveTuple();
			if (tuple != null) {
				// #########################################
				// start bolt logic from here
				processSubQueryCount(tuple.getReqID(),
						tuple.getTotalNoOfSubQuery());

				processChunkCountInSubQuery(tuple.getReqID(),
						tuple.getSubQueryID(), tuple.getNoOfChunkInSubQuery());

				processQueryXML(tuple.getReqID(), tuple.getSubQueryID(),
						tuple.getQueryXML());

				// ###########################################
				// end bolt logic from here
			}
		}
	}

	private static void processQueryXML(String reqID, String subQueryID,
			String queryXML) {

		if (null != subQueryID && null != queryXML) {
			String key = reqID + "-" + subQueryID;
			// save key+queryXML
			
			System.out.println(" key+queryXM --->   " + key+"  "+queryXML);

		} else if (subQueryID == null && null != queryXML) {
			// save reqID+queryXML
			System.out.println(" processQueryXML subQueryID+queryXM --->   " + subQueryID+"  "+queryXML);
		}


	}

	private static void processChunkCountInSubQuery(String reqID,
			String subQueryID, Integer noOfChunkInSubQuery) {

		if (null != subQueryID && null != noOfChunkInSubQuery) {

			// save in table key + noOfChunkInSubQuery
			String key = reqID + "-" + subQueryID;

			System.out.println(" processChunkCountInSubQuery key+noOfChunkInSubQuery --->   " + key+"  "+noOfChunkInSubQuery);
		}

	}

	private static void processSubQueryCount(String reqID,
			Integer totalNoOfSubQuery) {

		if (totalNoOfSubQuery != null) {
			// save in table reqID + totalNoOfSubQuery

			System.out.println(" processSubQueryCount reqID  totalNoOfSubQuery --->   " + reqID+"  "+totalNoOfSubQuery);
		}

	}

	private static Tuple receiveTuple() {
		String inputTupleStr = queue.poll();
		Tuple tuple = null;
		if (inputTupleStr != null) {
			// bolt logic will written below

			System.out.println(" input --->   " + inputTupleStr);

			try {
				tuple = mapper.readValue(inputTupleStr, Tuple.class);
				// System.out.println(" key    " + tuple.getKey());
			} catch (IOException e) {
				System.out.println(" exception.............  " + e);
			}

		}
		return tuple;
	}

	private static void startListener() {
		InputSpout inputSpout = new InputSpout(queue);
		Thread inputSpoutThread = new Thread(inputSpout);
		inputSpoutThread.start();
	}
}
