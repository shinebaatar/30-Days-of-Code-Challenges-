import java.util.Scanner;

public class Day9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ans;
		int n = sc.nextInt();
		ans = factorial(n);
		System.out.println(ans);
		sc.close();
	}

	public static int factorial(int n) {
		if (n == 1) {
			return 1;
		} else {
			return (n * factorial(n - 1));
		}
	}
}
