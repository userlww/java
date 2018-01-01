import javax.swing.*;
import java.awt.*;
public class text1 extends JFrame{
	private static final long serialVersionUID=1l;
    private JButton jButton=null;
    public static void main(String[] args)
    {
    	int i=0;
    	new text1();
    	new text1(i);
    	new text1(i,i);
    }
    public text1()
    {
    	this.setLayout(new FlowLayout());
    	this.setSize(400,250);
    	jButton=new JButton("Folwlayout 布局");
    	add(jButton);
    	this.setTitle("了解布局");
    	this.setVisible(true);
    	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public text1(int i)
    {
    	this.setLayout(new BorderLayout());
    	this.setSize(400,250);
    	jButton=new JButton("BorderLayout 布局");
    	add(jButton);
    	this.setTitle("了解布局");
    	this.setLocation(400,0);
    	this.setVisible(true);
    	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public text1(int i,int j) {
    	this.setLayout(new GridLayout(3,3));
    	this.setSize(400,250);
    	jButton=new JButton("GridLayout 布局");
    	add(jButton);
    			this.setTitle("了解布局");
    			this.setLocation(800,0);
    			this.setVisible(true);
    			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
