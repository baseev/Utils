package com.baseev.coding.lang.threads;

class Producer 
	extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Producer : " + i);
			//Thread.yield();
		}
	}
}

class Consumer 
	extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Consumer : " + i);
			//Thread.yield();
		}
	}
}


public class Yield {

	public static void main(String[] args) throws InterruptedException {
		Producer producer = new Producer();
		Consumer consumer = new Consumer();
		
		producer.setPriority(Thread.MIN_PRIORITY);
		consumer.setPriority(Thread.MAX_PRIORITY);
		
		producer.start();
		//producer.join();
		consumer.start();
		//consumer.join();		
	}

}
