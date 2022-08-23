import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.Timer;

@SuppressWarnings("serial")
public class Stopwatch extends JFrame implements ActionListener{
	
	JFrame frame = new JFrame();
	JLabel timeLabel;
	JButton startButton;
	JButton resetButton;
	int elapsedTime = 0;//to test our minutes and hours without waiting
	int seconds = 0;
	int minutes = 0;
	int hours = 0;
	boolean started = false;
	String secondsString = String.format("%02d", seconds);
	String minutesString = String.format("%02d", minutes);
	String hoursString = String.format("%02d", hours);
	
	Timer timer = new Timer(1000, new ActionListener() {
		
		public void actionPerformed(ActionEvent e) {
			elapsedTime+=1000;
			hours = (elapsedTime/3600000);
			//modulus 60 to get everything 0-59 but nothing over
			minutes = (elapsedTime/60000) % 60;
			seconds = (elapsedTime/1000) % 60;
			
			secondsString = String.format("%02d", seconds);
			minutesString = String.format("%02d", minutes);
			hoursString = String.format("%02d", hours);
			timeLabel.setText(hoursString+":"+minutesString+":"+secondsString);
			
			
		}
	});
	
	Stopwatch(){
		timeLabel = new JLabel();
		timeLabel.setText(hoursString+":"+minutesString+":"+secondsString);
		timeLabel.setBounds(100,100,200,100);
		timeLabel.setFont(new Font("Verdana", Font.PLAIN,35));
		timeLabel.setBorder(BorderFactory.createBevelBorder(1));
		timeLabel.setBackground(Color.BLACK);
		timeLabel.setOpaque(true);
		timeLabel.setHorizontalAlignment(JTextField.CENTER);
		
		startButton = new JButton("Start");
		startButton.setFont(new Font("Verdana",Font.PLAIN,20));
		startButton.setBounds(100,200,100,50);
		
		startButton.setFocusable(false);
		startButton.addActionListener(this);
		
		resetButton = new JButton("Reset");
		resetButton.setFont(new Font("Verdana",Font.PLAIN,20));
		resetButton.setBounds(200,200,100,50);
		resetButton.setFocusable(false);
		resetButton.addActionListener(this);
		
		frame.add(startButton);
		frame.add(resetButton);
		frame.add(timeLabel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420, 420);
		frame.setLayout(null);
		
		
		frame.setVisible(true);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==startButton) { 
			if(started==false) {
				started=true;
				startButton.setText("Stop");
				start();
			}
			else {
				started=false;
				startButton.setText("Start");
				stop();
			}
		}
		if(e.getSource()==resetButton) {
			reset();
			
		}
	}
	void start() {
		timer.start();
		
	}
	void stop() {
		timer.stop();
		
	}
	void reset() {
		started=false;
		startButton.setText("Start");
		timer.stop();
		elapsedTime = 0;
		seconds = 0;
		minutes = 0;
		hours =  0;
		
		secondsString = String.format("%02d", seconds);
		minutesString = String.format("%02d", minutes);
		hoursString = String.format("%02d", hours);
		timeLabel.setText(hoursString+":"+minutesString+":"+secondsString);
		
		
		
	}
}
