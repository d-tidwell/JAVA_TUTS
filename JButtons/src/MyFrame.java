import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//add this to the extends
//implements ActionListener

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements ActionListener {
	
	//must declare outside the constructor to set in scope
	JButton button;
	JLabel label;
	
	MyFrame(){
		
		ImageIcon icon = new ImageIcon("logo_smol.png");
		ImageIcon icon2 = new ImageIcon("dead-emoji-icon.png");
		
		label = new JLabel();
		label.setIcon(icon2);
		label.setBounds(250,350,150,150);
		label.setVisible(false);
		
		
		
		button = new JButton();
		button.setBounds(200,100,250,250 );
		button.setText("I'm a button");
		button.setFocusable(false);
		button.setIcon(icon);
		button.setHorizontalTextPosition(JButton.CENTER);
		button.setVerticalTextPosition(JButton.BOTTOM);
		button.setFont(new Font("Comic Sans",Font.BOLD,25));
		button.setForeground(Color.cyan);
		button.setBackground(Color.LIGHT_GRAY);
		button.setBorder(BorderFactory.createEtchedBorder());
		
		//needed to actually call actionPerformed
		button.addActionListener(this);
		//lambda to replace the actionPerformed method
//		button.addActionListener(e -> System.out.println("lambda"));
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(750,750);
		this.setVisible(true);
		this.add(button);
		this.add(label);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
			System.out.println("Fired");
			label.setVisible(true);
			
		}
	}

}
