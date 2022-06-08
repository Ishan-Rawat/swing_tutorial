//Basic swing tutorial
import javax.swing.JFrame;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.color.*;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.*;
public class Main {
	public static void main(String args[]) {
		// JPanel = a GUI component that serves as a container to store other components
		JPanel redPanel = new JPanel();
		redPanel.setBackground(Color.red);
		redPanel.setBounds(0, 0, 250, 250);
		//panels by default use flow layout. But we can change it to whatever we want.
		redPanel.setLayout(new BorderLayout());
		
		JPanel bluePanel = new JPanel();
		bluePanel.setBackground(Color.blue);
		bluePanel.setBounds(250, 0, 250, 250);
		
		JPanel greenPanel = new JPanel();
		greenPanel.setBackground(Color.green);
		greenPanel.setBounds(0, 250, 500, 250);
		
		// Lets create a label which we can add to a panel
		JLabel label = new JLabel();
		label.setText("Hi!");
		ImageIcon image = new ImageIcon("C:\\Users\\ishan\\Downloads\\hand2.png");
		label.setIcon(image);
		label.setVerticalTextPosition(JLabel.TOP);
		label.setHorizontalTextPosition(JLabel.CENTER);
		//after setting the layout manager of the panel to Border Layout we can again use methods like setVerticalPosition etc.
		label.setVerticalAlignment(JLabel.TOP);
		label.setHorizontalAlignment(JLabel.CENTER);
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(750, 750);
		frame.setVisible(true);
		
		redPanel.add(label);
		
		frame.add(redPanel);
		frame.add(greenPanel);
		frame.add(bluePanel);
	}
}
