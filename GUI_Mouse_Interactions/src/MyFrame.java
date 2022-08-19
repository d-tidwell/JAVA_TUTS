import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements MouseListener{

		JLabel label;
	
	MyFrame() {
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(500,500);
		
		label = new JLabel();
		label.setBounds(0,0,100,100);
		label.setBackground(Color.red);
		label.setOpaque(true);
		
		//***WARNING CHANGE THESE TO TOGGLE BETWEEN FRAME AND LABEL
		this.addMouseListener(this);
		label.addMouseListener(this);
		
		
		
		this.add(label);
		this.setVisible(true);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
	
		System.out.println("Mouse Clicked !!!!");
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// with button down on component executed
		System.out.println("You pressed the mouse");
		label.setBackground(Color.yellow);
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("You released");
		label.setBackground(Color.blue);
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// mouse enters component
		System.out.println("You entered the component");
		label.setBackground(Color.green);
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// mouse leaves component
		System.out.println("You exited the component");
		label.setBackground(Color.orange);
		
	}

	//KEY CHARACTER VS CODE: Q /q are the same keychar regardless of case, shift has no keychar
	




}

