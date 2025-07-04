class Node {
    int data;
    Node next;

    Node(int val) {
        data = val;
        next = null;
    }
}

public class LinkList {
    Node head;

    public void insert(int val) {
        Node newNode = new Node(val);
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

    public void display() {
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data + "->");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkList list = new LinkList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);

        System.out.println("Link List is: ");
        list.display();

    }
}
