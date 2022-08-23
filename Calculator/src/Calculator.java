import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener {
	
	JFrame frame;
	JTextField textField;
	JButton[] numberButtons = new JButton[10];
	JButton[] functionButtons = new JButton[9];
	JButton addButt, subButt, mulButt,divButt, decButt;
	JButton equButt, delButt, clrButt, negButt;
	
	JPanel panel;
	Font myFont = new Font("Ink Free",Font.BOLD,30);
	
	double num1 = 0;
	double num2 = 0;
	double result;
	char operator;
	
	Calculator(){
		
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setTitle("Calculonorator");
		frame.setSize(420,550);
		
		textField = new JTextField();
		textField.setBounds(50,25,300,50);
		textField.setFont(myFont);
		//set a restriction so you cannot type over text field
		textField.setEditable(false);
		
		addButt = new JButton("+");
		subButt = new JButton("-");
		mulButt = new JButton("*");
		divButt = new JButton("/");
		decButt = new JButton(".");
		equButt = new JButton("=");
		delButt = new JButton("del");
		clrButt = new JButton("clr");
		negButt = new JButton("neg");
		functionButtons[0] = addButt;
		functionButtons[1] = subButt;
		functionButtons[2] = mulButt;
		functionButtons[3] = divButt;
		functionButtons[4] = decButt;
		functionButtons[5] = equButt;
		functionButtons[6] = delButt;
		functionButtons[7] = clrButt;
		functionButtons[8] = negButt;
		
		for(int i =0; i < 9; i++) {
			functionButtons[i].addActionListener(this);
			functionButtons[i].setFont(myFont);
			functionButtons[i].setFocusable(false);
		}
		
		for(int i =0; i < 10; i++) {
			numberButtons[i] = new JButton(String.valueOf(i));
			numberButtons[i].addActionListener(this);
			numberButtons[i].setFont(myFont);
			numberButtons[i].setFocusable(false);
		}
		delButt.setBounds(150,430,100,50);
		clrButt.setBounds(250,430,100,50);
		negButt.setBounds(50,430,100,50);
		
		panel = new JPanel();
		panel.setBounds(50,100,300,300);
		panel.setLayout(new GridLayout(4,4,10,10));
		panel.setBackground(Color.gray);
		panel.add(numberButtons[1]);
		panel.add(numberButtons[2]);
		panel.add(numberButtons[3]);
		panel.add(addButt);
		panel.add(numberButtons[4]);
		panel.add(numberButtons[5]);
		panel.add(numberButtons[6]);
		panel.add(subButt);
		panel.add(numberButtons[7]);
		panel.add(numberButtons[8]);
		panel.add(numberButtons[9]);
		panel.add(mulButt);
		panel.add(decButt);
		panel.add(numberButtons[0]);
		panel.add(equButt);
		panel.add(divButt);
		
		
		frame.add(panel);
		frame.add(delButt);
		frame.add(clrButt);
		frame.add(negButt);
		frame.add(textField);
		frame.setVisible(true);
		
		
		
		
	}
	

	public static void main(String[] args) {
		// Simple Calculator
		Calculator calc = new Calculator();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		for(int i =0; i < 10; i++) {
			if(e.getSource()==numberButtons[i]) {
				textField.setText(textField.getText().concat(String.valueOf(i)));
			}
		}
		if(e.getSource()==decButt) {
			textField.setText(textField.getText().concat("."));
		}
		if(e.getSource()==addButt) {
			num1 = Double.parseDouble(textField.getText());
			operator = '+';
			textField.setText("");
		}
		if(e.getSource()==subButt) {
			num1 = Double.parseDouble(textField.getText());
			operator = '-';
			textField.setText("");
		}
		if(e.getSource()==mulButt) {
			num1 = Double.parseDouble(textField.getText());
			operator = '*';
			textField.setText("");
		}
		if(e.getSource()==divButt) {
			num1 = Double.parseDouble(textField.getText());
			operator = '/';
			textField.setText("");
		}
		if(e.getSource()==clrButt) {
			textField.setText("");
		}
		if(e.getSource()==negButt) {
			double temp = Double.parseDouble(textField.getText());
			temp*=-1;
			textField.setText(String.valueOf(temp));
		}
		if(e.getSource()==delButt) {
			String string = textField.getText();
			textField.setText("");
			for(int i=0; i<string.length()-1;i++) {
				textField.setText(textField.getText()+string.charAt(i));
			}
		}
		if(e.getSource()==equButt) {
			num2 = Double.parseDouble(textField.getText());
			switch(operator) {
			case'+':
				result=num1+num2;
				break;
			case'-':
				result=num1-num2;
				break;
			case'*':
				result=num1*num2;
				break;
			case'/':
				result=num1/num2;
				break;
			}
			textField.setText(String.valueOf(result));
			num1=result;
		}
		
	}

}
