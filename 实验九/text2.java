public class text2 extends Thread
{ 
	private int a;
	private int b;
	private String name;
	public text2 (String m,int a,int b)
	{ 
		this.name=m;
		this.a=a;
		this.b=b; 
		}  
	public void run()
	{ 
		if(a==1)
		{
			try
			{ 
			for(int i=0;i<=b;i++)
			{       
				System.out.println(name+": "+ i); 
				Thread.sleep(1000); 
				}                   
			} catch(Exception e)  
			{ 
				System.out.println(e.toString());
				}  
			}
		if(a==3){ 
			try{
				for(char c=97;(c-97)<=b;c++) 
				{
					System.out.println(name+"£º"+c);
					Thread.sleep(3000);
					}    }catch(Exception e)  
			{ 
						System.out.println(e.toString());
						} 
			} 
		}  
	public static void main(String args[])   {
		Thread timer1=new text2("first",1,10);
		Thread timer2=new text2("second",3,5);
		timer1.start();
		timer2.start();
		}
	}   