import java.awt.*;
import java.awt.Graphics;
import javax.swing.*;
public class text5 extends JFrame{
private static final long serialVersionUID=1L;
public void paint(Graphics g)
{
	g.drawRect(40, 50, 120,80);
	g.drawOval(40,50,120,80);
	g.drawOval(40,70,60,40);
	g.drawOval(40,80,30,20);
}
 public static void main(String[] args) {
	 text5 demo=new text5();
	 demo.setBounds(10,10,200,160);
	 demo.setVisible(true);
	 demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
 }
}
