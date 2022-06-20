package FlowLayout;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		// Flow Layout: Places components in a row, at their preferred size.
		//				If the row is too small, it uses the next row
		
		JFrame frame = new JFrame();
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout(FlowLayout.LEADING, 10, 10)); //alternatives are .CENTER(this is default) and .TRAILING
		//after that we have the Horizontal spacing and the vertical spacing arguments
		// we can do this for a panel too by writing panel.setLayout
		frame.add(new JButton("1"));
		frame.add(new JButton("2"));
		frame.add(new JButton("3"));
		frame.add(new JButton("4"));
		frame.add(new JButton("5"));
		frame.add(new JButton("6"));
		frame.add(new JButton("7"));
		frame.add(new JButton("8"));
		frame.add(new JButton("9"));
		
		frame.setVisible(true);
	}

}
