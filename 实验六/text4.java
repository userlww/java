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
	JMenuItem JMenuItem6=new JMenuItem();   //�����˵������˵����˵�����
	public text4()
	{
		  jMenu1.setText("������");
		  JMenuItem1.setText("��������");
		  JMenuItem2.setText("������");
		  JMenuItem3.setText("����");
		  JMenuItem4.setText("�������");
		  jMenu2.setText("Java����");
		  JMenuItem5.setText("������");
		  jMenu3.setText("����");
		  JMenuItem6.setText("ѡ�η���");
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
		  this.setTitle("ѡ��ϵͳ");
		  this.setSize(new Dimension(300,250));
		  this.setVisible(true);
		  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
		  public static void main(String[] args) {
		  new text4();
		  }
		  }

