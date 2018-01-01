import java.time.LocalDateTime;
import java.util.Random;
import java.util.Scanner;
public class task4{
    public static void main(String arg[]){
	 int i=0;
	 int n=0;
	 int m=0;
	 int a,b,s,c,d,e,sum;
	 System.out.println("请计算如下等式:");
	 while(i<10){   
	     LocalDateTime time=LocalDateTime.now();
		 a=(int)(Math.random()*50);
		 e=time.getHour();
		 c=time.getMinute();
		 d=time.getSecond();
		 System.out.println("当前时间为："+e+":"+c+":"+d);
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
			 System.out.println("结果正确。");
			  i++;
			  m++;
		  }
		 else{
		       System.out.println("结果错误。");
		        i++;
			   n++;
	    }
	  }
	 System.out.println("答题结束。");
	 System.out.println("正确答题个数m="+m+"。");
	 System.out.println("答错题的个数n="+n+"。");
    }
 }
