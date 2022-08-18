import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main {

	public static void main(String[] args) {
		
		//JLabel to put in the panel
		
		JLabel label = new JLabel();
		label.setText("Hi");
		
		//setting format for the panel it lives in relative
		label.setVerticalAlignment(JLabel.BOTTOM);
		label.setHorizontalAlignment(JLabel.RIGHT);
		
		// JPanel = a GUI component that functions as a container to hold components
		
		//Setup a JPanel
		JPanel redPanel = new JPanel();
		redPanel.setBackground(Color.red);
		JPanel bluePanel = new JPanel();
		bluePanel.setBackground(Color.blue);
		JPanel greenPanel = new JPanel();
		greenPanel.setBackground(Color.green);
		//setting this panel only to BorderLayout
		greenPanel.setLayout(new BorderLayout());
		
		
		//because we are not using a layout manager we must setBounds
		redPanel.setBounds(0,0,250,250);
		bluePanel.setBounds(250,0,250,250);
		greenPanel.setBounds(0,250,500,250);
		
		//Set up a clean Frame
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(750,750);
		frame.setVisible(true);
		
		//add the JPanels
		frame.add(redPanel);
		frame.add(bluePanel);
		frame.add(greenPanel);
		
		//add label to panel
		// * these are in a flow layout manager. FIFO style rows
		greenPanel.add(label);
		

	}

}
