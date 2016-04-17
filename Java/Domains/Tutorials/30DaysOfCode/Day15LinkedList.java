
import java.util.*;

/**
 * See <a href="https://www.hackerrank.com/challenges/30-linked-list">Day 15: Linked List</a>
 * @author Brian Yeicol Restrepo Tangarife
 */
public class Day15LinkedList {

	/**
	 * @param args the command line arguments
	 */
	public static void display(Node head) {
		Node start = head;
		while (start != null) {
			System.out.print(start.data + " ");
			start = start.next;
		}
	}

	public static Node insert(Node node, int data) {
		Node current = new Node(data);
		Node head;

		if (node == null) {
			return current;
		} else {
			head = node;
			while (node.next != null) {
				node = node.next;
			}
			node.next = current;
		}
		return head;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Node head = null;
		int N = sc.nextInt();
		while (N-- > 0) {
			int ele = sc.nextInt();
			head = insert(head, ele);
		}
		display(head);

	}
}

class Node {

	int data;
	Node next;

	Node(int d) {
		data = d;
		next = null;
	}
}
