import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

public class Main {

	public static void main(String[] args) {
		// JLayeredPane = Swing container that provides a 
//						  third dimension for positioning components
		
		JLabel label1 = new JLabel();
		label1.setOpaque(true);
		label1.setBackground(Color.RED);
		label1.setBounds(50,50,200,200);
		
		JLabel label2 = new JLabel();
		label2.setOpaque(true);
		label2.setBackground(Color.BLUE);
		label2.setBounds(100,100,200,200);
		
		JLabel label3 = new JLabel();
		label3.setOpaque(true);
		label3.setBackground(Color.GREEN);
		label3.setBounds(150,150,200,200);
		
		JLayeredPane layeredPane = new JLayeredPane();
		//set left right width height bounds
		layeredPane.setBounds(0,0,500,500);
		
		//add labels to stack by referencing pane area 
		// Default M P M Drag or by integer.valueOf( and pick a number)
		// higher is closer to front
		layeredPane.add(label1, JLayeredPane.DEFAULT_LAYER);
		layeredPane.add(label2, Integer.valueOf(2));
		layeredPane.add(label3, Integer.valueOf(0));

		JFrame frame = new JFrame("JLayeredPane");
		frame.add(layeredPane);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Change Layout and pass in Leading side they are justified to
		//next to args are padding to buttons from each other
		frame.setLayout(null);
		frame.setSize(500,500);
		frame.setVisible(true);

	}

}
