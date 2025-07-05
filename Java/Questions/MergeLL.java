class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class MergeLL {

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

    public static MergeLL merge(MergeLL list1, MergeLL list2) {
        MergeLL mergedList = new MergeLL();
        Node curr1 = list1.head;
        Node curr2 = list2.head;

        while (curr1 != null && curr2 != null) {
            if (curr1.data < curr2.data) {
                mergedList.insert(curr1.data);
                curr1 = curr1.next;
            } else {
                mergedList.insert(curr2.data);
                curr2 = curr2.next;
            }
        }

        // Append any remaining elements from either list
        while (curr1 != null) {
            mergedList.insert(curr1.data);
            curr1 = curr1.next;
        }
        while (curr2 != null) {
            mergedList.insert(curr2.data);
            curr2 = curr2.next;
        }

        return mergedList;
    }

    public static void main(String[] args) {
        MergeLL list1 = new MergeLL();
        list1.insert(1);
        list1.insert(3);
        list1.insert(5);

        MergeLL list2 = new MergeLL();
        list2.insert(2);
        list2.insert(4);
        list2.insert(6);

        MergeLL mergedList = MergeLL.merge(list1, list2);
        mergedList.display();
    }
}
