package ʵ���;
import java.io.*;
public class text1
{
	public static void main(String[] args)
	{
		try{
			int b=getnum();
			System.out.println(b);
			}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
			}  
		}  
	static int getnum() throws IOException
	{
		int i= (int)(Math.random()*100);
		if(i>60){  
			IOException a=new IOException("���������60");
			throw a; 
			}  
		else return i;  
		} 
	}         