import java.util.Scanner;

public class Day6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int index = scan.nextInt();
		scan.nextLine();
		for (int i = 0; i < index; i++) {
			String string = scan.nextLine();
			char[] charArray = string.toCharArray();

			for (int y = 0; y < charArray.length; y++) {
				if (y % 2 == 0) {
					System.out.print(charArray[y]);
				}
			}
			System.out.print(" ");

			for (int j = 0; j < charArray.length; j++) {
				if (j % 2 != 0) {
					System.out.print(charArray[j]);
				}
			}

			System.out.println();
		}
		scan.close();
	}
}
