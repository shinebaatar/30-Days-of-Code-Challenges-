import java.util.Scanner;

class Node {
	int data;
	Node next;
	Node(int d){
		data = d;
		next = null;
	}
}

public class Day15 {
	public static Node insert(Node head, int data){
		Node node = new Node(data);

		if(head == null){
			head = node;
			return head;
		}
		
		Node temp = head;
		while(temp.next != null){
			temp = temp.next;
		}
		
		temp.next = node;
		
		return head;
	}
	
	public static void display(Node head){
		Node start = head;
		while(start != null){
			System.out.println(start.data + " ");
			start = start.next;
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Node head = null;
		int N = scan.nextInt();
		
		while(N-- >0){
			int ele = scan.nextInt();
			head = insert(head, ele);
		}
		
		display(head);
		scan.close();
;	}
}