import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SliderDemo implements ChangeListener {
	
	JFrame frame;
	JPanel panel;
	JLabel label;
	JSlider slider;
	
	
	SliderDemo(){
		
		frame = new JFrame("Slider Demo");
		frame.setPreferredSize(new Dimension(300,300));
		panel = new JPanel();
		label = new JLabel();

		// min, max, starting point numbers args
		slider = new JSlider(0,100, 50);
		slider.setFont(new Font("MV Boli", Font.PLAIN, 15));
		slider.setPreferredSize(new Dimension(400,200));
		slider.setPaintTicks(true);
		slider.setMinorTickSpacing(10);
		slider.setPaintTrack(true);
		slider.setMajorTickSpacing(25);
		slider.setPaintLabels(true);
		
		slider.setOrientation(SwingConstants.VERTICAL);
		//slider.setOrientation(SwingConstants.HORIZONTAL);
		slider.addChangeListener(this);
		
		label.setText("°C " + slider.getValue());
		label.setFont(new Font("MV Boli", Font.PLAIN, 30));
		
		panel.add(slider);
		panel.add(label);
		frame.add(panel);
		frame.setSize(500,500);
		frame.setVisible(true);
		
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		//listens to slider to change text on window
		
		label.setText("°C " + slider.getValue());
		
	}
	

}
