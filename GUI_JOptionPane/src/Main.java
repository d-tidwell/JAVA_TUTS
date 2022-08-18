import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// JOptionPane = pop up a standard dialog box that prompts users for value
		
		JOptionPane.showMessageDialog(null, "This is some useless info", "Title", JOptionPane.PLAIN_MESSAGE);
		//info message
		JOptionPane.showMessageDialog(null, "This is some more useless info", "Title", JOptionPane.INFORMATION_MESSAGE);

		//question message
		JOptionPane.showMessageDialog(null, "This is some question", "Title", JOptionPane.QUESTION_MESSAGE);

		//warning message
		
		JOptionPane.showMessageDialog(null, "This is some warning", "Title", JOptionPane.WARNING_MESSAGE);

		//error message
		JOptionPane.showMessageDialog(null, "This is some error", "Title", JOptionPane.ERROR_MESSAGE);
		
		
		// Show confirm Yes=0 No=1 Cancel=2 X=-1
		JOptionPane.showConfirmDialog(null, "Do you agree? ", "Title", JOptionPane.YES_NO_CANCEL_OPTION);
		
		//Show input
		String name = JOptionPane.showInputDialog("What is your name?");
		System.out.println("Hello " + name);
		
		//Customized
		String[] responses = {"No you're awesome!","Buck up little camper","HOO-YAH"};
		
		ImageIcon icon = new ImageIcon("logo_smol.png");
		JOptionPane.showOptionDialog(null,"You are awesome", 
					"Secret Message", 
					JOptionPane.YES_NO_CANCEL_OPTION, 
					JOptionPane.INFORMATION_MESSAGE, 
					icon, responses, 0);
		
	}

}
