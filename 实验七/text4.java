package  µ—È∆ﬂ;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;

public class text4 extends JFrame {
	Button bt1, bt2, bt3, bt4;
	TextField l1, l2, l3;
	String str;
	double a, b, c;

	public text4() {
		Panel p = new Panel();
		l1 = new TextField();
		l2 = new TextField();
		l3 = new TextField();
		bt1 = new Button("+");
		bt1.setForeground(Color.red);
		bt2 = new Button("-");
		bt2.setForeground(Color.green);
		bt3 = new Button("*");
		bt3.setForeground(new Color(0, 100, 100));
		bt4 = new Button("/");
		bt4.setForeground(Color.blue);
		p.setLayout(new GridLayout(4, 1));
		Panel p1 = new Panel();
		p1.setLayout(new GridLayout(1, 1));
		p1.add(bt1);
		p1.add(bt2);
		p1.add(bt3);
		p1.add(bt4);
		p.add(l1);
		p.add(l2);
		p.add(p1);
		p.add(l3);
		add(p);
		myListener m = new myListener();
		bt1.addActionListener(m);
		bt2.addActionListener(m);
		bt3.addActionListener(m);
		bt4.addActionListener(m);
	}
	public static void main(String[]args){
		text4 fr=new text4();
		fr.setTitle("º∆À„∆˜");
		fr.setSize(300,200);
		fr.setLocation(300,300);
		fr.setVisible(true);}
	private class myListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e){
			if(e.getSource()==bt1)
			{
				str=new String(l1.getText());
				double a=Double.parseDouble(str.trim());
				str=new String(l2.getText());
				double b=Double.parseDouble(str.trim());
				l3.setText((c=a+b)+"");
				}
			if(e.getSource()==bt2)
			{
				str=new String(l1.getText());
				double a=Double.parseDouble(str.trim());
				str=new String(l2.getText());
				double b=Double.parseDouble(str.trim());
				l3.setText((c=a-b)+"");
				}if(e.getSource()==bt3)
				{
					str=new String(l1.getText());
					double a=Double.parseDouble(str.trim());
					str=new String(l2.getText());
					double b=Double.parseDouble(str.trim());
					l3.setText((c=a*b)+"");
					}
				if(e.getSource()==bt4)
				{
					str=new String(l1.getText());
					double a=Double.parseDouble(str.trim());
					str=new String(l2.getText());
					double b=Double.parseDouble(str.trim());
					l3.setText((c=a/b)+"");
					}
				}
		}
}