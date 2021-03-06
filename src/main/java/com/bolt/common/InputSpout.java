package com.bolt.common;

import java.util.concurrent.LinkedBlockingQueue;

import org.zeromq.ZMQ;

/**
 * This class run thread to accept input tuples. there is no Need of any kind of
 * edits in this class to use this framework
 * 
 */

public class InputSpout implements Runnable {

	private static LinkedBlockingQueue<String> queue;

	InputSpout(LinkedBlockingQueue<String> queue) {
		InputSpout.queue = queue;
	}

	public void run() {
		System.out.println(" READING THREAD STARTED    ");
		final ZMQ.Context ctx = ZMQ.context(1);
		final ZMQ.Socket sub = ctx.socket(ZMQ.SUB);

		sub.connect("tcp://localhost:6001");
		sub.subscribe("".getBytes());

		while (true) {
			String msg = sub.recvStr(2000);
			queue.offer(msg);
		}

	}

	public static LinkedBlockingQueue<String> getQueue() {
		return queue;
	}

	public static void setQueue(LinkedBlockingQueue<String> queue) {
		InputSpout.queue = queue;
	}

}
