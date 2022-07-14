package learn.java;

public class Test {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.insert(1,0);
        list.insert(2,1);
        list.insert(3,2);
        list.insert(4,3);
        list.insert(8,4);
        list.insert(7,3);
        list.display();
        list.delete(3);
        list.delete(0);
        list.delete(4);
        list.display();
    }


}
