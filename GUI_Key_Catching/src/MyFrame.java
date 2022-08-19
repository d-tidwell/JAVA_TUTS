import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements KeyListener{
	
	JLabel label;
	ImageIcon icon;
	
	MyFrame() {
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(500,500);
		
		icon = new ImageIcon("spaceship.png");
		
		label = new JLabel();
		label.setBounds(0,0,100,100);
		label.setIcon(icon);
//		label.setBackground(Color.black);
//		label.setOpaque(true);
		
		this.getContentPane().setBackground(Color.black);;
		this.add(label);
		this.addKeyListener(this);
		this.setVisible(true);
	}

	//KEY CHARACTER VS CODE: Q /q are the same keychar regardless of case, shift has no keychar
	
	@Override
	public void keyTyped(KeyEvent e) {
		// keyTyped = Invoke when a key is typed. Uses KeyChar, char output
		//System.out.println("You typed key char: " + e.getKeyChar());
		switch(e.getKeyChar()) {
		case 'a':label.setLocation(label.getX()-10, label.getY());
			break;
		case 'w':label.setLocation(label.getX(), label.getY()-10);
			break;
		case 's':label.setLocation(label.getX(), label.getY()+10);
			break;
		case 'd':label.setLocation(label.getX()+10, label.getY());
			break;
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// keyPressed = Invoke when a physical key is pressed down Uses KeyCode, int ouput, returns actual physical key number
		//System.out.println("You pressed key code: " + e.getKeyCode());
		switch(e.getKeyCode()) {
		case 37:label.setLocation(label.getX()-10, label.getY());
			break;
		case 38:label.setLocation(label.getX(), label.getY()-10);
			break;
		case 39:label.setLocation(label.getX()+10, label.getY());
			break;
		case 40:label.setLocation(label.getX(), label.getY()+10);
			break;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// keyReleased = called whenever a button is released
		System.out.println("You released key char: " + e.getKeyChar());
		
	}



}

