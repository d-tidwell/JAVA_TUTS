import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener{
	
	
	//JComboBox must be passed by referrence so you must use Wrapper Class
	// of the primitive data types
	
	JComboBox comboBox;
	
	MyFrame(){
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		String[] animals = {"dog","cat","bird"};
		
		comboBox = new JComboBox(animals);
		comboBox.addActionListener(this);
		//also comboBox .getItemCount(), .addItem("horse"),
		// .insertItemAt(item, index), .setSelectedIndex(0)
		// .removeItem("cat")
		// .removeItemAt(0) by index removal
		// 
		
		this.add(comboBox);
		this.pack();
		this.setVisible(true);
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == comboBox) {
			//returns item from list
			//System.out.println(comboBox.getSelectedItem());
			//returns index
			System.out.println(comboBox.getSelectedIndex());
			
			
			
		}
		
	}

}
