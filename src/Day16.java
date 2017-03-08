import java.util.Scanner;

public class Day16 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		try {
			int i = Integer.parseInt(s);
			System.out.println(i);
		} catch (Exception e) {
			System.out.println("Bad String");
		}
		scan.close();
	}
}
