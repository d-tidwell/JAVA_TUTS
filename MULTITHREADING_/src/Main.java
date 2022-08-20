
public class Main {

	public static void main(String[] args) throws InterruptedException {
		// Multithreading = 	Process of using multiple threads
//								simultaneously to better utilize cpu
//								one exception in a thread will not
//								effect other threads
//								Useful in multi-player gaming,
//								multiple clients etc
		//We'll create two separate threads
		
		MyThread thread1 = new MyThread();
		
		//alternate method to make a new thread
		//use the runnable interface to inherit or extend class
		MyRunnable runnable1 = new MyRunnable();
		Thread thread2 = new Thread(runnable1);
		
		//*** if this thread is set to daemon the program will exit
		//when there are no user threads left ***
		//thread1.setDaemon(true);
			
		thread1.start();
		
		//.join waits until thread that called it dies before it continues
		//.join also accepts a millisecond delay before it continues to 
		//execute the main method
		thread1.join(3000);
		
		thread2.start();
		
		//to test independence of threads 1/0 throws error but the 
		//threads continue
		System.out.println(1/0);
		
	}

}
