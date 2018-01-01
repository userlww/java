import java.awt.*;
import javax.swing.*;
public class text2_2 extends JFrame{
	private static final long serialVersionUID=4545;
	private JLabel label=null;
	public static void main(String[] args)
	{
		new text2_2();
	}
    public text2_2()
    {
    	this.setSize(100,100);
    	label=new JLabel("有标签的窗口");
    	this.setLayout(new FlowLayout());
    	add(label);
    	this.setLocation(300,300);
    	this.setVisible(true);
    	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
