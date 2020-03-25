package high;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {
	private final BlockingQueue queue;
    private static int count=1;
	Producer(BlockingQueue q) {
		queue = q;
	}

	@Override
	public  void run() {
		//synchronized(this){
		try {
			while (true) {
				if(count>20){
					break;
				}
				System.out.println("生产----------------------"+count);
				queue.put(count);
//				
				try {
					//System.out.println("生产者线程名字"+Thread.currentThread().getName());
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				count++;
				
				
			}
		} catch (InterruptedException ex) {
			ex.printStackTrace();

		}
		//}
		
	}

	/*Object produce() {
		String a="咖啡";
		count++;
		System.out.println("生产产品------------------------------------------->"+count);
		return a;
		
	}*/

}
