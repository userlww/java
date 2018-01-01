import java.awt.*;
import javax.swing.*;
public class text3 extends JFrame {
private static final long serialVersionUID=1L;
   private JTextField Input_1=null;
   private JTextField Input_2=null;
   private JTextField Output=null;
   private JButton jButton1=null;
   private JButton jButton2=null;
   private JButton jButton3=null;
   private JButton jButton4=null;
   public  static void main(String[] args) {
	   new text3();
   }
   public text3()
   {
	   GridBagLayout layout=new GridBagLayout();
	   this.setLayout(layout);
	   Input_1=new JTextField();
	   Input_2=new JTextField();
	   jButton1=new JButton("+");
	   jButton2=new JButton("-");
	   jButton3=new JButton("*");
	   jButton4=new JButton("/");
	   jButton1.setForeground(Color.RED);
	   jButton2.setForeground(Color.GREEN);
	   jButton3.setForeground(new Color(255,0,250));
	   jButton4.setForeground(Color.BLUE);
	   Output=new JTextField();
	   this.setLayout(layout);
	   GridBagConstraints s=new GridBagConstraints();               //用来控制添加进去的租金的现实的位置
	   s.fill=GridBagConstraints.BOTH;                             //当组件所处的区域比组件本身大的时候的显示情况
	   s.anchor=GridBagConstraints.NORTHEAST;
	   s.gridx=0;
	   s.gridy=0;
	   s.gridwidth=4;
	   s.weightx=1;
	   s.weighty=1;
	   add(Input_1);
	   layout.setConstraints(Input_1, s);// 设置组件
	   add(Input_2);
	   s.weightx=1;
	   s.weighty=1;
	   s.gridy=1;
	   layout.setConstraints(Input_2, s);
	   add(jButton1);
	   s.gridy=GridBagConstraints.RELATIVE;
	   s.gridwidth=1;
	   layout.setConstraints(jButton1, s);
	   s.gridy=2;
	   s.gridx=GridBagConstraints.RELATIVE;
	   layout.setConstraints(jButton2, s);
	   add(jButton2);
	   add(jButton3);
	   layout.setConstraints(jButton3, s);
	   add(jButton4);
	   layout.setConstraints(jButton4,s);
	   s.gridy=3;
	   s.gridwidth=4;
	   add(Output);
	   layout.setConstraints(Output, s);
	   this.setVisible(true);
	   this.setSize(300,200);
	   this.setTitle("计算器");
	   this.setLocation(500,500);
	   this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }	
}

