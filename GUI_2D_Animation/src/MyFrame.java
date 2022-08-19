import java.awt.Dimension;

import javax.swing.JFrame;

public class MyFrame extends JFrame {
	
	MyPanel panel;
	
	MyFrame() {
		
		panel = new MyPanel();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//paint on panel instead of on frame
		this.add(panel);
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}

}
