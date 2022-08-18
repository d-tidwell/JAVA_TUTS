import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {

	public static void main(String[] args) {
		// Layout Manager - Define natural layout for components in container
		//3 Common managers
		//BorderLayout = Places components in 5 areas NORTH, SOUTH ....CENTER
		//					All extra space goes to the CENTER
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(500,500);
		
		//change layout manager (set margins on new class call)
		frame.setLayout(new BorderLayout(5,5));
		frame.setVisible(true);
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		JPanel panel5 = new JPanel();
		
		panel1.setBackground(Color.red);
		panel2.setBackground(Color.green);
		panel3.setBackground(Color.yellow);
		panel4.setBackground(Color.magenta);
		panel5.setBackground(Color.blue);
		
		panel1.setPreferredSize(new Dimension(100,100));
		panel2.setPreferredSize(new Dimension(100,100));
		panel3.setPreferredSize(new Dimension(100,100));
		panel4.setPreferredSize(new Dimension(100,100));
		panel5.setPreferredSize(new Dimension(100,100));
		
		frame.add(panel1,BorderLayout.NORTH);
		frame.add(panel2,BorderLayout.SOUTH);
		frame.add(panel3,BorderLayout.EAST);
		frame.add(panel4,BorderLayout.WEST);
		frame.add(panel5,BorderLayout.CENTER);
		
//		------------- sub Panels ---------------
		
		JPanel panel6 = new JPanel();
		JPanel panel7 = new JPanel();
		JPanel panel8 = new JPanel();
		JPanel panel9 = new JPanel();
		JPanel panel10 = new JPanel();
		
		panel6.setBackground(Color.red);
		panel7.setBackground(Color.green);
		panel8.setBackground(Color.yellow);
		panel9.setBackground(Color.magenta);
		panel10.setBackground(Color.blue);
		
		panel6.setPreferredSize(new Dimension(100,50));
		panel7.setPreferredSize(new Dimension(100,50));
		panel8.setPreferredSize(new Dimension(100,50));
		panel9.setPreferredSize(new Dimension(100,50));
		panel10.setPreferredSize(new Dimension(100,50));
		
		//changing the BorderLayout in the blue panel for sub panels
		panel5.setLayout(new BorderLayout());
		panel5.add(panel6,BorderLayout.NORTH);
		panel5.add(panel7,BorderLayout.SOUTH);
		panel5.add(panel8,BorderLayout.EAST);
		panel5.add(panel9,BorderLayout.WEST);
		panel5.add(panel10,BorderLayout.CENTER);
		
		
		
		

		
	}

}
