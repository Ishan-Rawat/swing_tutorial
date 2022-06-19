package BorderLayout;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {
	public static void main(String args[]) {
		JFrame frame = new JFrame();
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout(10,10)); // gotta write this to use BorderLayout. What does the constructor return though?
		// The args in the constructor specify 10 pixels of margin on left right and top bottom respectively.
		frame.setVisible(true);
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		JPanel panel5 = new JPanel();
		
		panel1.setBackground(Color.red);
		panel2.setBackground(Color.green);
		panel3.setBackground(Color.yellow);
		panel4.setBackground(Color.magenta);
		panel5.setBackground(Color.blue);
		
		panel1.setPreferredSize(new Dimension(100,100)); //attached to north so height will remain as specified but width will change according to the frame's dimensions
		panel2.setPreferredSize(new Dimension(100,100)); //WEST so width will remain as specified but height will change according to seize of the frame 
		panel3.setPreferredSize(new Dimension(100,100));
		panel4.setPreferredSize(new Dimension(100,100));
		panel5.setPreferredSize(new Dimension(100,100)); // CENTER so it will expand/contract on all sides according to the size of the frame
		
		//Then when adding the panels to the frame we gotta specify if it is to be aligned to the NORTH, SOUTH, EAST, WEST, CENTER
		frame.add(panel1, BorderLayout.NORTH);
		frame.add(panel2, BorderLayout.WEST);
		frame.add(panel3, BorderLayout.EAST);
		frame.add(panel4, BorderLayout.SOUTH);
		frame.add(panel5, BorderLayout.CENTER);
		
	}
}
