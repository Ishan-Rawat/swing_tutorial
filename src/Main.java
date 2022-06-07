//Basic swing tutorial
import javax.swing.JFrame;
import javax.swing.ImageIcon;

import java.awt.Color;
import java.awt.color.*;
import javax.swing.JLabel;
public class Main {
	public static void main(String args[]) {
		//JLabel = a component that provides/serves(as a) a display area for a string of text, an image, or both
		//A label is added to a frame. (A component of a JFrame?)
		//myFrame frame = new myFrame();
		
		JLabel label = new JLabel();
		label.setText("Insert some funny and witty line here");
		/*
		 * The following code doesnt work for whatever reason
		myFrame frame = new myFrame();
		frame.add(label);
		*/
		ImageIcon image = new ImageIcon("C:\\Users\\ishan\\Downloads\\reigen2.jpg");
		label.setIcon(image);
		
		//THE TEXT IN THE LABEL ALIGNS ITSELF ACCORDING TO THE IMAGE ICON
		label.setHorizontalTextPosition(JLabel.CENTER); //we can set LEFT, RIGHT and CENTER
		label.setVerticalTextPosition(JLabel.TOP); // we can set TOP, CENTER and BOTTOM
		label.setForeground(new Color(205, 155, 105)); //set the text color (why does it say foreground color??)
		label.setBackground(Color.black); //set BG color
		label.setOpaque(true); //used to display the BG color
		
		
		JFrame frame = new JFrame();
		frame.setSize(500, 500);
		frame.setVisible(true);
		frame.add(label);
		//by default it will centre the string and put it on the left side
		
	}
}
