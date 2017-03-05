import java.util.Scanner;

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	//Print person data
	public void printPerson(){
		System.out.println(
				"Name: " + lastName + ", " + firstName 
			+	"\nID: " + idNumber);
	}
}

class Student extends Person {
	private int[] testScores;
	
	Student(String firstName, String lastName, int id, int[] testScores) {
		super(firstName, lastName, id);
		this.testScores = testScores;
	}
	
	public String calculate(){
		String score = "";
		int total = 0;
		if(testScores != null){
			int sum = 0;
			for (int i = 0; i < testScores.length; i++) {
				sum = sum + testScores[i];
			}
			total = sum / testScores.length;
		}
		if(90 <= total && total <= 100){
			score = "O";
		} else if(80 <= total && total < 90){
			score = "E";
		} else if(70 <= total && total < 80){
			score = "A";
		} else if(55 <= total && total < 70){
			score = "P";
		} else if(40 <= total && total < 55){
			score = "D";
		} else if(total < 40){
			score = "T";
		}
		return score;
	}
}

public class Day12 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for (int i = 0; i < numScores; i++) {
			testScores[i] = scan.nextInt();
		}
		scan.close();
		
		Student student = new Student(firstName, lastName, id, testScores);
		student.printPerson();
		System.out.println("Grade: " + student.calculate());
	}
}
