import java.util.Scanner;

class Difference {
	private int[] elements;
	public int maximumDifference;
	
	public Difference(int[] value) {
		this.elements = value;
	}
	
	public void computeDifference(){
		int max = 0;
		if(elements != null){
			for (int i = 0; i < elements.length; i++) {
				max = Math.max(max, elements[i]);
			}
			
			for (int i = 0; i < elements.length; i++) {
				maximumDifference = Math.max(maximumDifference, max - elements[i]);
			}
		}
	}
}

public class Day14 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int[] value = new int[size];
		for (int i = 0; i < size; i++) {
			value[i] = scan.nextInt();
		}
		scan.close();
		
		Difference difference = new Difference(value);
		difference.computeDifference();
		System.out.println(difference.maximumDifference);
	}
}
