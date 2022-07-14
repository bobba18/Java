package learn.java;

public class DoublyLL {

    private Node head;
    private int size;

    public DoublyLL() {
        this.size = 0;
        this.head = null;
    }

    public void insert(int data, int index) {
        if(index == 0) {
            insertFirst(data);
            return;
        }
        if(index == size) {
            insertLast(data);
            return;
        }
        Node temp = findPosition(index);
        if(temp == null) {
            System.out.println("Does not exist");
            return;
        }

        Node node = new Node(data,temp,temp.next);
        if(node.next != null) {
            temp.next.previous = node;
        }
        temp.next = node;
    }

    public void insertFirst(int data) {
        Node node = new Node(data);
        node.next = head;
        node.previous = null;
        if(head != null) {
            head.previous = node;
        }
        head = node;
        size++;
    }

    public void insertLast(int data) {
        Node last = findLast();
        last.next = new Node(data,last,null);
        size++;
    }

    public Node findPosition(int position) {
        Node positionp = head;
        for(int i = 1; i < position - 1; i++) {
            positionp = positionp.next;
        }
        return positionp;
    }

    public Node findLast() {
        Node last = head;
        if(head == null) {
            System.out.println("No element in the list");
        }
        while(last.next != null) {
            last = last.next;
        }
        return last;
    }

    public void delete(int index) {
        if(index == 0) {
            deleteFirst();
            return;
        }
        if(index == size) {
            deleteLast();
        }
        Node temp = findPosition(index);
        Node temp2 = temp.next.next;
        temp2.previous = temp;
        temp.next = temp2;
        size--;
    }
    public void deleteFirst() {
        head.previous = null;
        head = head.next;
    }

    public void deleteLast() {
        findPosition(size + 1).next = null;
    }

    public void display() {
        Node temp = head;
        System.out.print("Head -> ");
        while(temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void displayReverse() {
        Node last = findLast();
        System.out.print("null -> ");
        while(last != null) {
            System.out.print(last.data + " -> ");
            last = last.previous;
        }
        System.out.println("head");

    }

    class Node {
        private int data;
        private Node previous;
        private Node next;

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node previous, Node next) {
            this.data = data;
            this.previous = previous;
            this.next = next;
        }
    }
}
