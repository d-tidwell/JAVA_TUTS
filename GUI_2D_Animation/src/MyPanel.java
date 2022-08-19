import java.awt.*;

import java.awt.event.*;

import javax.swing.*;

public class MyPanel extends JPanel implements ActionListener{
	
	final int PANEL_WIDTH = 675;
	final int PANEL_HEIGHT = 600;
	Image enemy;
	Image background;
	Timer timer;
	int xVelocity = 1;
	int yVelocity = 1;
	int x = 0;
	int y = 0;
	
	MyPanel() {
		
		this.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
		this.setBackground(Color.black);
		
		enemy = new ImageIcon("enemy.png").getImage();
		
		background = new ImageIcon("space.jpg").getImage();
		
		timer = new Timer(10, this);
		timer.start();
		

	}
	
	public void paint(Graphics g) {
		
		super.paint(g); //paint background first
		
		Graphics2D g2d = (Graphics2D) g;
		
		g2d.drawImage(background, 0, 0,null);
		g2d.drawImage(enemy, x, y,null);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(x >= PANEL_WIDTH - enemy.getWidth(null) || x<0) {
			xVelocity = xVelocity * -1;
		}
		x = x + xVelocity;
		if(y >= PANEL_HEIGHT - enemy.getHeight(null) || y<0) {
			yVelocity = yVelocity * -1;
		}
		y = y + yVelocity;
		
		repaint();
		
	}
}
