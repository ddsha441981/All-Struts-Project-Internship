package Threading;

public class ThreadTest extends Thread {

	ThreadTest(String g)
	{
		super(g);
	}
		public void run()
		{
			for (int i = 0; i < 10; i++) {
				
				System.out.println(Thread.currentThread().getName()+ " I =" + i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
	
	
	public static void main(String[] args) {
		
		ThreadTest th1 = new ThreadTest("First");
		ThreadTest th2 = new ThreadTest("Second");
		th1.start();
		th2.start();
	}
}
