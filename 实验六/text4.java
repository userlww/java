import java.awt.*;
import javax.swing.*;
public class text4 extends JFrame{
	private static final long serialVersionUID=546;
	JMenuBar jMenuBar1=new JMenuBar();
	JMenu jMenu1=new JMenu();
	JMenu jMenu2=new JMenu();
	JMenu jMenu3=new JMenu();
	JMenuItem JMenuItem1=new JMenuItem();
	JMenuItem JMenuItem2=new JMenuItem();
	JMenuItem JMenuItem3=new JMenuItem();
	JMenuItem JMenuItem4=new JMenuItem();
	JMenuItem JMenuItem5=new JMenuItem();
	JMenuItem JMenuItem6=new JMenuItem();   //建立菜单条、菜单、菜单对象
	public text4()
	{
		  jMenu1.setText("文体类");
		  JMenuItem1.setText("艺术欣赏");
		  JMenuItem2.setText("健美操");
		  JMenuItem3.setText("篮球");
		  JMenuItem4.setText("计算机类");
		  jMenu2.setText("Java语言");
		  JMenuItem5.setText("网络编程");
		  jMenu3.setText("帮助");
		  JMenuItem6.setText("选课方法");
		  this.setJMenuBar(jMenuBar1);
		  jMenuBar1.add(jMenu1);
		  jMenu1.add(JMenuItem1);
		  jMenu1.add(JMenuItem2);
		  jMenu1.add(JMenuItem3);
		  jMenuBar1.add(jMenu2);
		  jMenu2.add(JMenuItem4);
		  jMenu2.add(JMenuItem5);
		  jMenuBar1.add(jMenu3);
		  jMenu3.add(JMenuItem6);
		  this.setTitle("选课系统");
		  this.setSize(new Dimension(300,250));
		  this.setVisible(true);
		  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
		  public static void main(String[] args) {
		  new text4();
		  }
		  }

