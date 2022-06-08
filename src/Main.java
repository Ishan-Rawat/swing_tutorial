//Basic swing tutorial
import javax.swing.JFrame;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;

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
		
		JPanel bluePanel = new JPanel();
		bluePanel.setBackground(Color.blue);
		bluePanel.setBounds(250, 0, 250, 250);
		
		JPanel greenPanel = new JPanel();
		greenPanel.setBackground(Color.green);
		greenPanel.setBounds(0, 250, 500, 250);
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(750, 750);
		frame.setVisible(true);
		
		frame.add(redPanel);
		frame.add(greenPanel);
		frame.add(bluePanel);
	}
}
