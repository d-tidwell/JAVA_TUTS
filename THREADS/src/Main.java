
public class Main {

	public static void main(String[] args) throws InterruptedException {
		//Threads =		thread of execution in a program (virtual cpu)
//						the JVM allows an application to have multiple threads
//						running concurrently
//						Each thread can execute parts of your code in parallel with the 
//						main thread
//						Each thread has its own priority
//						Threads with high priority are executed in preference compared
//						to threads with lower priority
//						
//						The JVM continues to execute threads until either of the following
//						1. The exit method of class Runtime has been called
//						2. All user threads have died
//						
//						When a JVM starts up, there is a thread which calls the main method
//						This thread is called "main" (the one above)
		
//		//to see how many threads
		System.out.println(Thread.activeCount());
		
		//to get the name of the thread
		System.out.println(Thread.currentThread().getName());
		
		//change the thread name
		Thread.currentThread().setName("New Thread Name of Main");
		System.out.println(Thread.currentThread().getName());
		
		//get and set the priority of a Thread
		Thread.currentThread().setPriority(1);
		System.out.println(
				"New Thread priority is "+Thread.currentThread().getPriority());
		
		//check if thread is still alive
		System.out.println(
				"Thread is still alive= "+Thread.currentThread().isAlive());
		
//		Sleep thread for a period between calls
		
		for (int i=3; i > 0; i--) {
			System.out.println(i);
			//1000 milliseconds = 1 sec
			// must declare or try catch the Interrupted Execution error
			Thread.sleep(1000);
		}
		System.out.println("Thread sleep test complete");
		
		
		MyThread thread2 = new MyThread();
		
		//set to daemon thread **user thread by default
		thread2.setDaemon(true);
//		thread2.setDaemon(false);
		
		//to start a new thread use start and it will call run in the class function
		thread2.start();
		System.out.println("Is thread2 alive? "+thread2.isAlive());
		System.out.println(thread2.getName());
		thread2.setName("Sidekick thread(2)");
		System.out.println(thread2.getName());
		thread2.setPriority(10);
		System.out.println("Currently Active Threads: "+Thread.activeCount());
		
		//There are two types of threads
//		1.daemon threads=		Low Priority threads for things like garbage
//								collection that run in background
//		2.user threads=			JVM terminates itself when all user threads are 
//								deactivated or complete execution
//		***By default a new Thread is a user thread***
//			so you must change this after instantiated
		
	}

}
