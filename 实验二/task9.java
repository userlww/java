
import java.util.Scanner;
public class task9 {
	public static void main(String[] args) {
		Scanner n= new Scanner(System.in);
		int[][] number = new int[5][5];
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				number[i][j] =n.nextInt();
			}
		}
		int min=number[0][0];
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if(number[i][j]<min){
					min=number[i][j];
				}
			}
		}
		System.out.println(min);
	}
}
