package bolt.test;

import org.junit.Test;

import bolt.Dispatcher;
import bolt.Tuple;

public class ControlBoltJunitTest {

	@Test
	public void sendReqID_TotalNumberSubQuery() throws InterruptedException {
		Tuple tuple = new Tuple();
		tuple.setReqID("123");
		tuple.setTotalNoOfSubQuery(3);
		Dispatcher.send(tuple);
	}

	@Test
	public void sendNoOfChunkInSubQuery() throws InterruptedException {
		Tuple tuple = new Tuple();
		// 123-1
		tuple.setReqID("123");
		tuple.setNoOfChunkInSubQuery(5);
		tuple.setSubQueryID("1");
		Dispatcher.send(tuple);

		// 123-2
		tuple = new Tuple();
		tuple.setReqID("123");
		tuple.setNoOfChunkInSubQuery(2);
		tuple.setSubQueryID("2");
		Dispatcher.send(tuple);

		// 123-3
		tuple = new Tuple();
		tuple.setReqID("123");
		tuple.setNoOfChunkInSubQuery(2);
		tuple.setSubQueryID("3");
		Dispatcher.send(tuple);
	}

	@Test
	public void sendQueryXML() throws InterruptedException {
		Tuple tuple = new Tuple();
		// 123-1
		tuple.setReqID("123");
		tuple.setQueryXML("<xml> main xml </xml>");
		Dispatcher.send(tuple);

		// 123-2
		tuple = new Tuple();
		tuple.setReqID("123");
		tuple.setSubQueryID("2");
		tuple.setQueryXML("<xml> xml for subquery 2 </xml>");
		Dispatcher.send(tuple);

		// 123-3
		tuple = new Tuple();
		tuple.setReqID("123");
		tuple.setQueryXML("<xml> xml for subquery 3 </xml>");
		tuple.setSubQueryID("3");
		Dispatcher.send(tuple);
	}
}
