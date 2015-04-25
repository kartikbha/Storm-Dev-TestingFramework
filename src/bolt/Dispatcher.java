package bolt;

import org.zeromq.ZMQ;

import bolt.Tuple;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
/**
 * 
 * 
 *  This Class is used by Test cases to deliver message to bolt as a tuple format.
 * 
 * 
 */
 
public class Dispatcher {

	public static void send(Tuple tuple) throws InterruptedException {
		final ZMQ.Context ctx = ZMQ.context(1);
		final ZMQ.Socket pub = ctx.socket(ZMQ.PUSH);
		pub.bind("tcp://localhost:6001");
		//pub.setHWM(1000000);
        //pub.setSndHWM(1000000);       
		ObjectMapper mapper = new ObjectMapper();
		String json = null;
		try {
			json = mapper.writeValueAsString(tuple);
		} catch (JsonProcessingException e) {
			
		}

		System.out.println(" sending --");
		pub.send(json);

		pub.close();

		ctx.term();

	}
}
