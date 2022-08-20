
public class Main {

	public static void main(String[] args) {
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
		
		//to see how many threads
		System.out.println(Thread.activeCount());
		
		//to get the name of the thread
		System.out.println(Thread.currentThread().getName());
		
		//change the thread name
		Thread.currentThread().setName("New Thread Name of Main");
		System.out.println(Thread.currentThread().getName());

						
	}

}
