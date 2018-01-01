public class text3 extends Thread{
	private int m;
	private int n; 
	public text3(int m,int n){
		this.m=m;
		this.n=n;  
		} 
	public void run()
	{
		if(m==1)
		{
			try{
				for(int i=1;i<=n;i++ )
				{ 
					System.out.println(i);
					Thread.sleep(1000);
					}                     
				} 
			catch(Exception e)
			{ 
				System.out.println(e.toString());
			}   
			}    
		if(m==2)
		{
			try{
				for(char a=65;a<=n;a++) 
				{
					System.out.println(a);
					Thread.sleep(2000);
					}     
				}
			catch(Exception e)
			{
				System.out.println(e.toString());
				}
			} 
		if(m==3)
		{
			try{
				for(char h=72;h<=n;h++)
				{
					System.out.println(h);
					Thread.sleep(3000);
					}  
				}
			catch(Exception e)  
			{
				System.out.println(e.toString());
				}
			}
		}
	public static void main(String args[]) 
	{      Thread A1=new text3(1,10);
	       Thread A2=new text3(2,69);
	       Thread A3=new text3(3,75);
	       A1.setPriority(4);
	       A2.setPriority(6);
	       A3.setPriority(8);    
	       A1.start();
	       A2.start();
	       A3.start();  
	} 
	}       