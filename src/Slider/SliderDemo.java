package Slider;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class SliderDemo implements ChangeListener{
	JFrame frame; 
	JPanel panel; 
	JLabel label;
	JSlider slider;
	
	SliderDemo(){
		frame = new JFrame();
		panel = new JPanel();
		label = new JLabel();
		slider = new JSlider(0, 100, 50); //args are: smallest value of slider, largest value, starting value
		
		slider.setPreferredSize(new Dimension(400, 200)); //height and width
		slider.setPaintTicks(true); // dunno what this does
		slider.setMinorTickSpacing(10); //sets the small markings
		
		slider.setPaintTrack(true); //dunno why this was required
		slider.setMajorTickSpacing(25);
		
		slider.setPaintLabels(true); // to add labels to the ticks
		slider.setFont(new Font("Helvetica", Font.PLAIN, 15));
		
		// slider.setOrientation(SwingConstants.VERTICAL); //to make the slider vertical
		
		panel.add(slider);
		panel.add(label);
		frame.add(panel);
		frame.setSize(420,420);
		frame.setVisible(true);
	}
	
	public void stateChanged(ChangeEvent e) {
		
	}
}
