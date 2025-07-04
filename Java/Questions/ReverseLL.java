import java.util.*;
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class ReverseLL {

    Node head;

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
    }

    public void reverse(){
        Node prev = null;
        Node curr = head;
        Node next = null;
        while (curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    public void display(){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data+ " -> ");
            curr = curr.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        ReverseLL list = new ReverseLL();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);
        list.insert(60);

        System.out.println("Original list : ");
        list.display();

        list.reverse();
        System.out.println("\n"+ "Reversed List");
        list.display();
   }
}

