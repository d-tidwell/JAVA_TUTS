import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;

public class MyFrame extends JFrame {
	
	
	MyPanel panel;
	
	MyFrame(){
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		
		//allows frame to go to middle of screen
		this.setLocationRelativeTo(null);
		
		panel = new MyPanel();
		
		this.add(panel);
		this.pack();
		this.setVisible(true);
		
	}
	


}
