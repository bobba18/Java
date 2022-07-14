package learn.java;

public class DoublyLinkedList {
    private Node head;
    private int size;

    public DoublyLinkedList() {
        this.head = null;
        this.size = 0;
    }

    public void insert(int data, int position) {
        if(position == 0) {
            insertFirst(data);
        } else if (position == size) {
            insertLast(data);
        } else {
            // head -> head | 4 | 5                  4 | 5 | 6    5 | 6 | 8    6 | 8 | 9 -> null
            //                      null | 21 | null
            Node temp = findPreviousNode(position);
            Node node = new Node(data,temp,temp.next);
            temp.next = node;
        }
        size++;
    }

    private void insertFirst(int data) {
        // head -> null
        // head -> head | 4 | null
        head = new Node(data,head,null);
    }

    private void insertLast(int data) {
        // head -> head | 4 | 5   4 | 5 | 6    5 | 6 | 7   -> null
        // head -> head | 4 | 5   4 | 5 | 6    5 | 6 | 8   6 | 8 | 9 -> null
        Node temp = findPreviousNode(size + 1);
        temp.next = new Node(data, temp, null);
    }

    private Node findPreviousNode(int position) {
        Node temp = head;
        int count = 1;
        while(count < position - 1) {
            temp = temp.next;
            count++;
        }
        return temp;
    }

    public void delete(int position) {
        if (position == 0) {
            deleteFirst();
        } else if (position == size) {
            deleteLast();
        } else {
            // head -> head | 4 | 5   4 | 5 | 6    5 | 6 | 8   6 | 8 | 9 -> null
            // head -> head | 4 | 5   4 | 5 | 8                5 | 8 | 9 -> null
            Node temp = findPreviousNode(position);
            temp.next = temp.next.next;
            temp.next.previous = temp;
        }
        size--;
    }

    private void deleteFirst() {
        // head -> head | 4 | 5   4 | 5 | 6    5 | 6 | 8   6 | 8 | 9 -> null
        // head ->             head | 5 | 6    5 | 6 | 8   6 | 8 | 9 -> null
        head = head.next;
    }

    private void deleteLast() {
        Node temp = findPreviousNode(size);
        // head -> head | 4 | 5   4 | 5 | 6    5 | 6 | 8   6 | 8 | 9 -> null
        // head -> head | 4 | 5   4 | 5 | 6    5 | 6 | 8             -> null
        temp.next = null;
    }

    public void display() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println();
    }
}

class Node {
    // previous | data | next
    public int data;
    public Node previous;
    public Node next;

    public Node(int data) {
        this.data = data;
        this.previous = null;
        this.next = null;
    }

    public Node(int data, Node previous, Node next) {
        this.data = data;
        this.previous = previous;
        this.next = next;
    }

}