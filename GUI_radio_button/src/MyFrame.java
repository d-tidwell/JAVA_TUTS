import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class MyFrame extends JFrame implements ActionListener{
	
	
	JRadioButton pizzaButton;
	JRadioButton hamburgerButton;
	JRadioButton hotdogButton;
	
	ImageIcon pizzaIcon;
	ImageIcon hamburgerIcon;
	ImageIcon hotdogIcon;
	
	
	MyFrame(){
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		pizzaIcon = new ImageIcon("pizza.png");
		hamburgerIcon = new ImageIcon("hamburger.png");
		hotdogIcon = new ImageIcon("hotdog.png");
		
		
		pizzaButton = new JRadioButton("pizza");
		hamburgerButton = new JRadioButton("hamburger");
		hotdogButton = new JRadioButton("hotdog");
		
		ButtonGroup group = new ButtonGroup();
		group.add(hamburgerButton);
		group.add(pizzaButton);
		group.add(hotdogButton);
		
		pizzaButton.addActionListener(this);
		hamburgerButton.addActionListener(this);
		hotdogButton.addActionListener(this);
		
		pizzaButton.setIcon(pizzaIcon);
		hamburgerButton.setIcon(hamburgerIcon);
		hotdogButton.setIcon(hotdogIcon);
		
		this.add(hamburgerButton);
		this.add(pizzaButton);
		this.add(hotdogButton);
		this.pack();
		this.setVisible(true);
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == pizzaButton) {
			System.out.println("You ordered Pizza");
			
		}
		if(e.getSource() == hamburgerButton) {
			System.out.println("You ordered a Hamburger");
					
				}
		if(e.getSource() == hotdogButton) {
			System.out.println("You ordered a Hotdog");
			
		}
	}

}
