import java.util.Scanner;

public class Day15 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int[] arrays = new int[size];
		for (int i = 0; i <= size - 1; i++) {
			arrays[i] = scan.nextInt();
		}
		System.out.print(arrays);
	}
}