import java.time.LocalDateTime;
import java.util.Random;
import java.util.Scanner;
public class task4{
    public static void main(String arg[]){
	 int i=0;
	 int n=0;
	 int m=0;
	 int a,b,s,c,d,e,sum;
	 System.out.println("��������µ�ʽ:");
	 while(i<10){   
	     LocalDateTime time=LocalDateTime.now();
		 a=(int)(Math.random()*50);
		 e=time.getHour();
		 c=time.getMinute();
		 d=time.getSecond();
		 System.out.println("��ǰʱ��Ϊ��"+e+":"+c+":"+d);
		 if(c<=50&&d>50){
			 b=c;
		 }
		 else if(c>50&&d<=50){
			 b=d;
		 }
		 else {
			    if(d%2==0){b=c;}
			    else{b=d;}
			    }
		 sum=a+b;
		 System.out.println(a+"+"+b+"=");
		 Scanner sc=new Scanner(System.in);
		 s=sc.nextInt();
		 if(s==sum){
			 System.out.println("�����ȷ��");
			  i++;
			  m++;
		  }
		 else{
		       System.out.println("�������");
		        i++;
			   n++;
	    }
	  }
	 System.out.println("���������");
	 System.out.println("��ȷ�������m="+m+"��");
	 System.out.println("�����ĸ���n="+n+"��");
    }
 }
