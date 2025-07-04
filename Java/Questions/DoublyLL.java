class Node {
    int data;
    Node prev;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class DoublyLL {
    Node head;

    public void insertAtEnd(int data) {
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
        newNode.prev = curr;
    }

    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (head != null) {
            newNode.next = head;
            head.prev = newNode;
        }
        head = newNode;
    }

    public void delete(int val) {
    if (head == null) return;

    Node curr = head;

    // Delete head node
    if (curr.data == val) {
        head = curr.next;
        if (head != null) head.prev = null;
        return;
    }

    while (curr != null && curr.data != val) {
        curr = curr.next;
    }

    // Not found
    if (curr == null) return;

    // Adjust links
    if (curr.prev != null)
        curr.prev.next = curr.next;

    if (curr.next != null)
        curr.next.prev = curr.prev;
}


    public void displayForward() {
        Node curr = head;
        System.out.print("Forward: ");
        while (curr != null) {
            System.out.print(curr.data + " <-> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public void displayBackward() {
        Node curr = head;
        if (curr == null) {
            System.out.println("Reverse: null");
            return;
        }

        // Go to last node
        while (curr.next != null)
            curr = curr.next;
        System.out.print("Reverse: ");
        while (curr != null) {
            System.out.print(curr.data + " <-> ");
            curr = curr.prev;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DoublyLL dll = new DoublyLL();
        dll.insertAtEnd(10);
        dll.insertAtEnd(20);
        dll.insertAtEnd(30);
        dll.insertAtBeginning(5);
        dll.displayForward();
        dll.displayBackward();
        dll.delete(20);
        dll.displayForward();
    }
}
