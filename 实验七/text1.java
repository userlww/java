import java.awt.*; 
import java.awt.event.*;   
import javax.swing.JFrame; 
class text1 extends JFrame implements ActionListener   
{  
static TextField t=new TextField("����û�����أ�",12); 
static int i=0;                 
public static void main(String args[]){ 
text1 f=new text1(); 
f.setLayout(new FlowLayout()); 
f.setTitle("Press Me"); 
Button b=new Button(" Press Me "); 
b.addActionListener(f);   
f.add(t);    
f.add(b); 
f.setLocation(300, 300); 
f.setSize(170,100);     
f.setVisible(true);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
} 
public void actionPerformed(ActionEvent e)  {  
 i++; 
if(i==3)
{
	t.setText("��������3��");
	} 
else if(i>6) {t.setText("������Ҫ�ٵ���");} 
} 
}
