//Basic swing tutorial
import javax.swing.JFrame;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;

import java.awt.Color;
import java.awt.Font;
import java.awt.color.*;
import javax.swing.JLabel;
import javax.swing.border.*;
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
		label.setFont(new Font("MV Boli", Font.PLAIN, 25)); //set the font
		label.setIconTextGap(10); //set the gap between the image and the text
		label.setBackground(Color.black); //set BG color
		label.setOpaque(true); //used to display the BG color
		
		Border border = BorderFactory.createLineBorder(Color.green,3); // to create a border
		label.setBorder(border);
		// After setting the border we'll see that it takes up the entire frame
		
		//Next, we will set the position of the image + text combo in the label. Our default layout manager centers it vertically and puts it on the left hand side horizontally
		label.setVerticalAlignment(JLabel.CENTER);
		label.setHorizontalAlignment(JLabel.CENTER);
		
		JFrame frame = new JFrame();
		frame.setSize(500, 500);
		frame.setVisible(true);
		frame.add(label);
		//by default it will centre the string and put it on the left side. This is done by the default layout manager.
		//Using the default manager, we can use the pack() method to automatically set a size for the frame so that it accomodates all the components and not leave any extra spaces.
		frame.pack();
		
	}
}
