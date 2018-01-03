package org.infotech.workers;

import java.util.Random;

import org.infotech.resource.MyQueue;

public class Producer implements Runnable {
	private MyQueue myQueue;

	public Producer(MyQueue myQueue) {
		this.myQueue = myQueue;
	}

	public void run() {
		while (true) {
			Random random = new Random();
			int data = random.nextInt(100);
			// producer put items
			myQueue.put(data);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
