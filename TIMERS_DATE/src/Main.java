import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class Main {

	public static void main(String[] args) {
		// Timer = 			A facility for threads to schedule
//							tasks for future execution in a 
//							background thread (java.util.Timer)
							
		// TimerTask =		A task that can be scheduled for one-time
//							or repeated execution by a Timer
//							contains .run()(must be implemented)
		
		Timer timer = new Timer();
		
		TimerTask task = new TimerTask() {
			
			int counter = 10;

			@Override
			public void run() {
				// when timer hits a predetermined point executes 
				// this function if linked
				if(counter > 0) {
					System.out.println(counter+ " seconds");
					counter --;
				}
				else {
					System.out.println("Happy New Year!");
					timer.cancel();
				}
//				System.out.println("Task is complete");
				
			}
			
		};
		
		//timer can be a date in the future using the 
		// calendar class
//		Calendar date = Calendar.getInstance();
//		date.set(Calendar.YEAR, 2022);
//		date.set(Calendar.MONTH,Calendar.AUGUST);
//		date.set(Calendar.DAY_OF_MONTH, 20);
//		//in military time24
//		date.set(Calendar.HOUR_OF_DAY, 9);
//		date.set(Calendar.MINUTE, 51);
//		date.set(Calendar.SECOND, 0);
//		date.set(Calendar.MILLISECOND, 0);
//		
//		timer.schedule(task, date.getTime());
		
		//to delay to a certain day
		//timer.scheduleAtFixedRate(task, date.getTime(), 1000);
		
		//second argument is millisecond delay
//		timer.schedule(task, 300);
		
		//scheduled at fixed rate method (countdown timer)
		// 3 args task, delay of first instance, how often repeat
		// 
		timer.scheduleAtFixedRate(task, 0, 1000);

	}

}
