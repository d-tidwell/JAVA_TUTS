import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginPage implements ActionListener {
	
	HashMap<String, String> logininfo = new HashMap<String,String>();
	JFrame frame = new JFrame();
	JButton loginButton = new JButton("Login");
	JButton resetButton = new JButton("Reset");
	JTextField userIdField = new JTextField();
	JPasswordField userPasswordField = new JPasswordField();
	JLabel userIdLabel = new JLabel("userID: ");
	JLabel passLabel = new JLabel("password: ");
	JLabel messageLabel = new JLabel("");
	
	
	LoginPage(HashMap<String, String> loginInfoOriginal){
		
		logininfo = loginInfoOriginal;
		
		
		userIdLabel.setBounds(50,100,75,25);
		passLabel.setBounds(50,150,75,25);
		messageLabel.setBounds(125,250,250,35);
		messageLabel.setFont(new Font(null,Font.ITALIC,25));
		
		userIdField.setBounds(125,100,200,25);
		userPasswordField.setBounds(125,150,200,25);
		
		loginButton.setBounds(125, 200, 100, 25);
		loginButton.addActionListener(this);
		loginButton.setFocusable(false);
		resetButton.setBounds(225, 200, 100, 25);
		resetButton.addActionListener(this);
		resetButton.setFocusable(false);

		frame.add(loginButton);
		frame.add(resetButton);
		frame.add(userPasswordField);
		frame.add(userIdField);
		frame.add(messageLabel);
		frame.add(userIdLabel);
		frame.add(passLabel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setLayout(null);
		frame.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==resetButton) {
			userIdField.setText("");
			userPasswordField.setText("");
			messageLabel.setText("");
			
			
		}
		if(e.getSource()==loginButton) {
			
			String userID = userIdField.getText();
			String password = String.valueOf(userPasswordField.getPassword());
			
			if(logininfo.containsKey(userID)) {
				if(logininfo.get(userID).equals(password)) {
					messageLabel.setForeground(Color.GREEN);
					messageLabel.setText("Login Succesful");
					frame.dispose();
					WelcomePage welcomePage = new WelcomePage(userID);
				}
				else {
					messageLabel.setForeground(Color.RED);
					messageLabel.setText("Password Invalid");
				}
			}
			else {
				messageLabel.setForeground(Color.RED);
				messageLabel.setText("User not Found");
			}
		}
		
	}

}
