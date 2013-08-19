
import java.awt.*;
import java.awt.image.BufferedImage;

import javax.swing.*;




public class Invaders extends JFrame{
	
	public static int Width =  800;
	public static int Height = 500;
	Image background = null;
	Graphics mains ;
	BufferedImage bg;
	JPanel panel;
	
	public Invaders(){
	
	super("Land Invaders");
	background = new javax.swing.ImageIcon("bgimage.jpg").getImage();
	
	bg = new BufferedImage(Width, Height, BufferedImage.TYPE_INT_RGB);
	
	mains = bg.createGraphics();
	
	setBackground(Color.black);
	setVisible(true);
	setSize(Width,Height);
	
	
	
}




public void paint(Graphics g){

   g.drawImage(background,0,0,this);
}


	public static void main(String []args) {
    Invaders invader = new Invaders();
}
	

}
