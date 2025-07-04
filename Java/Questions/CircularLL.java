// This code defines a basic structure for a Circular Linked List in Java.
// It includes a Node class and a CircularLL class that can be

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class CircularLL {
    Node head = null;
    Node tail = null;

    public void InsertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head; // Point to itself
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head; // Circular link
        }
    }

    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node curr = head;
        do {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        } while (curr != head);
        System.out.println("(head)");
    }

    public static void main(String[] args) {
        CircularLL cll = new CircularLL();
        cll.InsertAtEnd(10);
        cll.InsertAtEnd(20);
        cll.InsertAtEnd(30);
        cll.display();  
    }

}
