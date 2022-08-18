import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Main {

	public static void main(String[] args) {
		
		ImageIcon image = new ImageIcon("logo.png"); //create an image icon for corner of screen
		ImageIcon image2 = new ImageIcon("logo_smol.png");
		
		Border border = BorderFactory.createLineBorder(Color.green,3);
		
		JLabel label = new JLabel();
		label.setText("bro, do you even code?"); //set text
		label.setIcon(image); //add image to label
		label.setHorizontalTextPosition(JLabel.CENTER);//set text of imageIcone LEFT, RIGHT, CENTER 
		label.setVerticalTextPosition(JLabel.TOP);
		label.setForeground(new Color(0xFF0000)); //set font color
		label.setFont(new Font("MV Boli", Font.PLAIN,20));//set font
		label.setIconTextGap(20);//sets label distance from image
		
		//in order to change label background color you must use both below
		label.setBackground(Color.black);
		label.setOpaque(true);
		
		label.setBorder(border);
		
		//changing label position so the border and background do not hog the screen space
		label.setVerticalAlignment(JLabel.CENTER);
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setBounds(225,200,550,400); // coordinates x, y size x, y
		
		JFrame myFrame = new JFrame(); //
		//setting up frame and components
		myFrame.setSize(550,400);
		myFrame.setLayout(null); //clears border box so you can tell the label size and placement
		myFrame.setVisible(true);
		myFrame.setTitle("Here is the title");
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setResizable(true);
		
		myFrame.add(label);
		
		
		myFrame.setIconImage(image2.getImage()); //change icon of frame
		myFrame.getContentPane().setBackground(new Color(123,33,150)); //set interior color
		
		//will pack the labels in as they fit. add all the components first then pack as the last step
		//myFrame.pack(); 
		
		System.out.println(0);

	}

}
