import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JProgressBar;
public class ProgressBarDemo {
	
	JFrame frame;
	JProgressBar bar;
	
	ProgressBarDemo() {
		
		frame = new JFrame();
		bar = new JProgressBar(0,100);
		
		bar.setValue(0);
		bar.setBounds(0,0,500,50);
		bar.setStringPainted(true);
		bar.setFont(new Font("MV Boli", Font.BOLD, 25));
		bar.setForeground(Color.RED);
		bar.setBackground(Color.BLACK);
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setLayout(null);
		
		frame.add(bar);
		frame.setVisible(true);
		
		fill();
		
		
		
		
		
	}
	public void fill() {
		int counter = 0;
		while(counter <= 100) {
			bar.setValue(counter);
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			counter +=1;
		}
		bar.setString("You have been satisfied");
	}
}
