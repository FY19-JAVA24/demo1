package high;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Consumer implements Runnable {

	private final BlockingQueue queue;
	Consumer(BlockingQueue q) {
		queue = q;
	}

	public  void run() {
		//synchronized(this){
		try {
			while (true) {
				consume(queue.take());
				try {
					System.out.println("消费者线程名字"+Thread.currentThread().getName());
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
		}
	//}

	void  consume(Object x) {
		System.out.println("开始消费----------->" +x);

	}

	public static void main(String[] args) throws InterruptedException {
		BlockingQueue q = new LinkedBlockingQueue();
		Producer p = new Producer(q);
		new Thread(p).start();
		Thread.sleep(1000);
		Consumer c1 = new Consumer(q);
		Thread c1thread=new Thread(c1);
		c1thread.start();
		//c1thread.join();
		Thread.sleep(1000);
		Consumer c2 = new Consumer(q);
		new Thread(c2).start();
		Consumer c3 = new Consumer(q);
		new Thread(c3).start();
	}

}
