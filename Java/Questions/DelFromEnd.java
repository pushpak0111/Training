class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class DelFromEnd {

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

    public void display() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + "->");
            curr = curr.next;
        }
        System.out.println("null");
    }

    // public void delete() {
    //     Node curr = head;
    //     while (curr.next.next != null) {
    //         curr = curr.next;
    //     }
    //     curr.next = null;
    // }

    public void deleteformend(int n){
        Node dummy = new Node(0);
        dummy.next = head;
        Node first = dummy;
        Node second = dummy;

        for(int i = 0; i <= n; i++){
            if(first != null){
                first = first.next;
            }else
                return;
        }
        while(first != null){
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
        head = dummy.next;
    }

    public static void main(String[] args) {
        DelFromEnd list = new DelFromEnd();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        System.out.print("Original Link-list: ");
        list.display();

        list.deleteformend(2);
        System.out.print("Link-list after deleting " + n + " node: ");
        list.display();
    }
}
//     list.display();