package Threading;

public class ThreadInterface implements Runnable {

 
	public void run() {
		
		for (int i = 0; i < 10; i++) {
			
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + i);
		
		}
		
	}
	public static void main(String[] args) {
		ThreadInterface th1 = new ThreadInterface();
		Thread t1 = new Thread(th1,"FIrst");
		t1.start();
		ThreadInterface th2 = new ThreadInterface();
		Thread t2 = new Thread(th2,"Second");
		t2.start();
	
		
	}
	
}
