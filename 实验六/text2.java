import java.awt.*;
import javax.swing.*;
public class text2 extends JFrame{
private static final long serialVersionUID=4545;
public static void main(String[] args)
{
	JFrame f=new JFrame();
	Container c=f.getContentPane();
	c.setLayout(new FlowLayout());
	JLabel label=new JLabel("有标签的窗口");
	c.add(label);
	f.setSize(160,100);
	f.setVisible(true);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
