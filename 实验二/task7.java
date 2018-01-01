import java.util.Scanner;
public class task7 {
	public static void main(String[] args) {
		int[] number= new int[10];
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			number[i] = scanner.nextInt();
		}
		int min = number[0];
		for (int i = 0; i < 10; i++) {
			if (number[i] < min) {
				min = number[i];
			}
		}
		System.out.println(min);
	}
}

