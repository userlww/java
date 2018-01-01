import java.util.Scanner;
public class task3{
	public static void main(String[] args){
		int i,j,k,num;
		System.out.println("input n:");
		Scanner in = new Scanner (System.in);
		num=in.nextInt();
			for(i=1;i<=num;i++){
				for(j=num-i+1;j>=1;j--){
					System.out.print(" ");
					
				}
				for(k=1;k<=i;k++){
					System.out.print("*"+" ");
				}
				System.out.println();
				
		}
	}
}