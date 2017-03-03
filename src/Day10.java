import java.util.Scanner;

public class Day10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();

		String value = Integer.toBinaryString(a);
		int max = 0;
		int total = 0;

		for (int i = 0; i < value.length(); i++) {
			if (value.charAt(i) == '1') {
				max++;
				total = Math.max(total, max);
			} else {
				max = 0;
			}
		}
		System.out.println(total);
		scan.close();
	}
}
