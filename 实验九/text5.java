import java.awt.*;
import java.awt.event.*;
public class text5 extends Frame implements ActionListener,Runnable 
{
	static Label l1; 
	static Label l2;
	static Button btn1;
	static Button btn2;
	static boolean bool; 
	public static int a=10;
	public static int b=200;
	public text5(String name)
	{
		super(name);
		}
	public text5()
	{
		super();
		}   
	public void sz(){ 
		this.setLayout(null);
		this.setBounds(200,200,300,150);
		l1=new Label("�����Ʊ�ǩ");
		l1.setBounds(10,30,80,20);
		l2=new Label("�����Ʊ�ǩ");  
		l2.setBounds(200,60,80,20);
		btn1=new Button("������");   
		btn1.setBounds(50,100,80,20);
		btn2=new Button("������");  
		btn2.setBounds(150,100,80,20);
		add(l1);
		add(l2);
		add(btn1);
		add(btn2);
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		}
	public static void main(String args[]) 
	{
       text5 yd=new text5("�ƶ���ǩ");
       yd.sz();
       yd.setVisible(true); 
       }
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==btn1)
		{
			Thread t1=new Thread(new text5());
			bool=true;
			t1.start();
			}
		if(e.getSource()==btn2){
			Thread t2=new Thread(new text5());
			bool=false;
			t2.start();
			} 
		}
	public void run()
	{
		if(bool)
		{
			for(int i=0;i<=10;i++)
			{
				try{   
					l1.setBounds(a,30,80,20);
					a=a+10;
					Thread.sleep(1000);
					}
				catch(Exception e)  
				{ 
					System.out.println(e.toString());
					}
				}
			}
		else{
			for(int i=0;i<=10;i++)
			{
				try
				{
					l2.setBounds(b,60,80,20); 
          		b=b-10;
		Thread.sleep(1000);
		}catch(Exception e)   
				{ System.out.println(e.toString());
				}
				}
			}
		}
	}  