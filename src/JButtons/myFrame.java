package JButtons;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class myFrame extends JFrame implements ActionListener{
	JButton button;
	myFrame(){
		//creating a button
		button = new JButton();
		button.setBounds(100, 100, 250, 100);
		button.addActionListener(this); //the logic here is that this class implements the ActionListener class, so ...
		button.setText("Lol this is a button");
		button.setFocusable(false); // gets rid of the box around the text
		ImageIcon image = new ImageIcon("C:\\Users\\ishan\\Downloads\\hand3.png");
		button.setIcon(image);
		button.setHorizontalTextPosition(JButton.CENTER);
		button.setVerticalTextPosition(JButton.BOTTOM);
		button.setFont(new Font("Comic Sans", Font.BOLD, 25));
		button.setIconTextGap(-10);
		button.setBackground(Color.LIGHT_GRAY);
		button.setBorder(BorderFactory.createEtchedBorder());
		
		//creating a frame
		this.setSize(500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.add(button);
		this.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
			System.out.println("Button clicked!");
			//you can also disable the button. Setting this property here will make it so that button will be disabled after its been clicked once.
			button.setEnabled(false);
		}
	}
}
