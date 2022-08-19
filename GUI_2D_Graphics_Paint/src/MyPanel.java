import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class MyPanel extends JPanel {
	
	Image img;
	
	MyPanel() {
		
		//instantiate image and create image out of image icon
		img = new ImageIcon("sky.jpg").getImage();
		this.setPreferredSize(new Dimension(500,500));
		
	}
	public void paint(Graphics g) {
		
		//they will be layered in the order linearly programmed
		
		//casting the standard g Graphics object to updated child class of Graphics2D
		Graphics2D g2d = (Graphics2D) g;
		
		//add image to graphic (background if the size of window)
		g2d.drawImage(img, 0, 0, null);
		
		//change stroke
		g2d.setStroke(new BasicStroke(5));
		
		//change color
		g2d.setPaint(Color.BLUE);
		
		//draw line
		g2d.drawLine(0,0,500,500);
		
		//draw rectangle
		g2d.drawRect(0, 0, 100, 200);
		
		//change color of next object
		g2d.setPaint(Color.pink);
		
		//to draw a filled rectangle
		g2d.fillRect(250, 250, 100, 200);
		
		g2d.setPaint(Color.CYAN);
		
		//circle is drawOval or fillOval
		g2d.drawOval(250, 350, 100, 100);
		
		//draw arcs
		g2d.setPaint(Color.MAGENTA);
		g2d.drawArc(250, 0, 100, 100, 0, 180);
		
		//to draw a triangle
		int[] xPoints = {150,250,350};
		int[] yPoints = {300, 150, 300};
		g2d.setPaint(Color.yellow);
		g2d.drawPolygon(xPoints, yPoints, 3);
		g2d.fillPolygon(xPoints, yPoints, 3);
		
		//draw a string of text
		g2d.setPaint(Color.red);
		g2d.setFont(new Font("Ink Free",Font.BOLD, 50));
		g2d.drawString("You are a winner", 50, 50);
		
		
		
		
		
	}
}
