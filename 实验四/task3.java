import java.util.System;
import java.util.Scanner;

class Matrix
{
	int m,n;
	int[][] ma=new int[10][10];
	Matrix(int a,int b)
	{
		m=a;
		n=b;
	}
	Matrix cheng(Matrix a)
	{
		int sum=0;
		Matrix s=new Matrix(m,a.n);
		for(int i=0;i<m;i++)
		{
			for(int k=0;k<a.n;k++)
			{
				sum=0;
			for(int j=0;j<n;j++)	
			{
				sum=sum+this.ma[i][j]*a.ma[j][k];
			}
			s.ma[i][k]=sum;
			}
		}
		return s;
	}
	void print(Matrix a)
	{
		for(int i=0;i<a.m;i++)
		{
			for(int j=0;j<a.n;j++)
				System.out.print(a.ma[i][j]+" ");
			System.out.println();
		}
	}
}
public class task3 {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int[][] x=new int[10][10];
		int m=s.nextInt();
		int n=s.nextInt();
		Matrix y1=new Matrix(m,n);
		int q=s.nextInt();
		int w=s.nextInt();
		Matrix y2=new Matrix(q,w);
		Matrix y3=new Matrix(m,w);
		for(int i=0;i<m;i++)
			for(int j=0;j<n;j++)
				y1.ma[i][j]=s.nextInt();
		for(int i=0;i<q;i++)
			for(int j=0;j<w;j++)
				y2.ma[i][j]=s.nextInt();
		y3=y1.cheng(y2);
		y1.print(y3);
		
	}

}
