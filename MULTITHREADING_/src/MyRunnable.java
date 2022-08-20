
public class MyRunnable implements Runnable {

	@Override
	public void run() {
		// Second thread to count up against thread1
		for(int i = 0; i <= 10; i++) {
			System.out.println("Thread 2: "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Thread 2 has finished!!");
		
	}
	

}
