import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class myFrame extends JFrame{
	myFrame(){
		//JFrame jframe = new JFrame(); //create a JFrame instance // this line is apparently not required when your class extends JFrame class
		this.setSize(500, 500); //sets size(x,y) for the window 
		this.setTitle("Bruh moment"); //sets title of window
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);// sets if window can be resized
		this.setVisible(true); //makes the window visible
		
		//for setting the logo on top of the window
		ImageIcon image = new ImageIcon("C:\\Users\\ishan\\eclipse-workspace\\Swing Tutorial\\src\\logo.png"); //gotta create an image icon first this way
		this.setIconImage(image.getImage()); //sets the image icon as the icon for the window
		
		//for setting the background color of the window
		this.getContentPane().setBackground(new Color(205, 105, 255)); //you can also provide a hex value as an argument
	}
}
