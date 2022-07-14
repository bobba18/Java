//package learn.java;
//
//public class SinglyLinkedList {
//    private Node head;
//    private Node tail;
//    private int size;
//
//    public SinglyLinkedList() {
//        this.head = null;
//        this.tail = null;
//        this.size = 0;
//    }
//
//    public void insert(int data, int position) {
//        if(position == 0) {
//            insertFirst(data);
//        } else if (position == size) {
//            insertLast(data);
//        } else {
//            Node node = new Node(data);
//            Node temp = findPreviousNode(position);
//            // 4 | 8        9 | 2
//            //      8 | 9
//            node.next = temp.next;
//            temp.next = node;
//        }
//
//        if(size == 0) {
//            tail = head;
//        }
//        size++;
//    }
//
//    private void insertFirst(int data) {
//        Node node = new Node(data);
//        // head --> null <-- tail
//        // head --> 4 | null <- head <- tail
//        node.next = head;
//        head = node;
//    }
//
//    private void insertLast(int data) {
//        Node node = new Node(data);
//        // head -> 4 | null <- tail
//        // head -> 4 | 8 -> 8 | null <- tail
//        tail.next = node;
//        tail = node;
//    }
//
//    private Node findPreviousNode(int position) {
//        Node temp = head;
//        int count = 1;
//        while(count < position - 1) {
//            temp = temp.next;
//            count++;
//        }
//        return temp;
//    }
//
//    public void delete(int position) {
//        if(position == 0) {
//            deleteFirst();
//        } else if(position == size) {
//            deleteLast();
//        } else {
//            // 4 | 9       9 | 2
//            //      8 | 9
//            Node temp = findPreviousNode(position);
//            temp.next = temp.next.next;
//
//        }
//        size--;
//    }
//
//    private void deleteFirst() {
//        // head -> 4 | 8    8 | 9   9 | 7 <- tail
//        // 4 | 8 head -> 8 | 9   9 | 7 <- tail
//        head = head.next;
//    }
//
//    private void deleteLast() {
//        // head -> 4 | 8    8 | 9   9 | 7 <- tail
//        // head -> 4 | 8    8 | 9 <- tail  9 | 7
//        tail = findPreviousNode(size);
//        tail.next = null;
//    }
//
//    public void display() {
//        Node temp = head;
//        while(temp != null) {
//            System.out.print(temp.data + "->");
//            temp = temp.next;
//        }
//        System.out.println();
//    }
//
//}
//
//class Node {
//    public int data;
//    public Node next;
//
//    public Node(int data) {
//        this.data = data;
//    }
//}