import java.util.Scanner;

abstract class Book {
	String title;
	String author;
	
	Book(String title, String author){
		this.title = title;
		this.author = author;
	}
	
	abstract void display();
}

class MyBook extends Book {

	String title = "";
	String author = "";
	int price = 0;
	
	MyBook(String title, String author, int price) {
		super(title, author);
		this.title = title;
		this.author = author;
		this.price = price;
	}

	@Override
	void display() {
		System.out.println("Title: " + title
						+ 	"\nAuthor: " + author 
						+   "\nPrice: " + price);
		
	}
	
}

public class Day13 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String title = scan.nextLine();
		String author = scan.nextLine();
		int price = scan.nextInt();
		scan.close();
		
		Book book = new MyBook(title, author, price);
		book.display();
	}
}
