import java.util.List;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class OperationsLL {

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
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    boolean search(int element) { // Searches for an element in the linked list
        Node curr = head;
        boolean ref = false;
        while (curr != null) {
            if (element == curr.data) {
                ref = true;
            }
            curr = curr.next;
        }
        return ref;
    }

    int length() { // Returns the length of the linked list
        Node curr = head;
        int count = 0;
        while (curr != null) {
            count++;
            curr = curr.next;
        }
        return count;
    }

    void Middle() { // return th middle node

        Node curr = head;
        int length = length() / 2;

        while (length > 0) {
            curr = curr.next;
            length--;
        }
        System.out.println(curr.data);
    }

    void Middle2() { // Middle element without using length
        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        System.out.println(slow.data);
    }

    void MergeLL(Node list1, Node list2) {
        Node temp = new Node(0);
        Node ref = temp;
        while (list1 != null && list2 != null) {
            if (list1.data < list2.data) {
                ref.next = list1;
                list1 = list1.next;
            } else {
                ref.next = list2;
                list2 = list2.next;
            }
            ref = ref.next;
        }
        this.head = temp.next;
    }

    // Que. Input l1 = [2, 4, 3] l2 = [5, 6, 4] Output = [7, 0, 8]
    // Explanation : 342 + 465 = 807

    // public static Node Addition(Node list1, Node list2 ){
    //         int sum ;
    //         int carry = 0;
    //         Node temp = new Node(-1);
    //         Node ref = temp;
    //         while( list1!= null && list2!= null){
    //             if(list1 != null){
    //                 val1 = list1.data;
    //             }else{
    //                 val2 = 0;
    //             }
    //                 val1 = list1.data;
    //                 val2 = list2.data;
    //                 sum = val1 + val2 + carry;
    //                 carry = sum % 10;
    //                 ref.next = new Node(sum % 10);
    //                 list1 = list1.next;
    //                 list2 = list2.next;
    //         }
    //         return temp.next;   
    //     }

    public static Node Addition(Node list1, Node list2) {
        int sum;
        int carry = 0;
        Node temp = new Node(-1);
        Node ref = temp;

        while (list1 != null || list2 != null || carry != 0) {
            int val1 = (list1 != null) ? list1.data : 0;
            int val2 = (list2 != null) ? list2.data : 0;

            sum = val1 + val2 + carry;
            carry = sum / 10; // Update carry for next iteration
            ref.next = new Node(sum % 10); // Create a new node with the unit place
            ref = ref.next; // Move to the next node

            if (list1 != null) list1 = list1.next; // Move to the next node in list1
            if (list2 != null) list2 = list2.next; // Move to the next node in list2
        }
        return temp.next; // Return the head of the new linked list
    }

    public static void main(String[] args) {
        OperationsLL list1 = new OperationsLL();
        OperationsLL list2 = new OperationsLL();
        OperationsLL list3 = new OperationsLL();

        list1.insert(2);
        list1.insert(4);
        list1.insert(3);
        // list1.insert(7);
        // list1.insert(9);

        list2.insert(5);
        list2.insert(6);
        list2.insert(4);
        // list2.insert(8);
        // list2.insert(10);

        list3.MergeLL(list1.head, list2.head);
        // list3.display();

        list3.head = Addition(list1.head, list2.head);
        list3.display();

    }
}
