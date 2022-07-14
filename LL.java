package learn.java;

public class LL {
	private Node head;
	private Node tail;
	private int size;

	public LL() {
		this.head = null;
		this.tail = null;
		this.size = 0;
	}

	public void createNodeAtLeft(int data) {
		Node node = new Node(data);
		node.next = head;
		head = node;
		if(tail == null) {
			tail = head;
		}
		size++;

	}

	public void insertNodeAtMiddle(int data, int position) {
		Node temp = head;
		for(int i = 0; i < position - 2; i++) {
			temp = temp.next;
		}
		temp.next = new Node(data,temp.next);
		size++;
	}

	public void createNodeAtRight(int data) {
		Node node = new Node(data);
		tail.next = node;
		tail = node;
		size++;
	}

	public void deleteNodeAtLeft() {
		head = head.next;
		size--;
	}

	public void deleteNodeAtRight() {
		Node temp = head;
		for(int i = 0; i < size - 2; i++) {
			temp = temp.next;
		}
		tail = temp;
		temp.next = null;
		size--;
	}

	public void deleteNodeAtMiddle(int position) {
		Node temp = head;
		for(int i = 0; i < position - 2; i++) {
			temp = temp.next;
		}
		Node temp2 = temp.next;
		temp.next = temp2.next;
		size--;
	}

	public void printList() {
		Node temp = head;
		for(int i = 0; i < size; i++) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.println("null");
	}

	public class Node {
		private int data;
		private Node next;

		public Node(int data) {
			this.data = data;
		}
		public Node(int data, Node next) {
			this.data = data;
			this.next = next;
		}
	}
}




