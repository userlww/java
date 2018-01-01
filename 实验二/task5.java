import java.util.Scanner;
public class task5
{
	public static void main(String[] args){
		int n;
		System.out.println("input n:");
		Scanner in = new Scanner (System.in);
		n=in.nextInt();
		if((n%4==0&&n%100!=0)||(n%4==0&&n%400==0))
			System.out.println("是闰年");
		else
			System.out.println("非闰年");
	}
}