/*
 * Problem Summary:
 * You are given the head of a linked list and an integer k.
 * Reverse the nodes of the list k at a time, and return the modified list.
 * If the number of nodes is not a multiple of k, leave the last nodes as is.
 *
 * Example:
 * Input:
 * head = [1, 2, 3, 4, 5], k = 3
 * Output:
 * [3, 2, 1, 4, 5]
 *
 * Constraints:
 * The number of nodes in the list is n.
 * */
class Node{
    int val;
    Node next;
    
    Node(int x) {
        val = x;
        next = null;
    }
}
public class LinklistRotate {
    Node head;

    public void insert(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public Node reverseKGroup(Node head, int k) {
        if (head == null || k <= 1) return head;

        Node dummy = new Node(0);
        dummy.next = head;
        Node prevGroupEnd = dummy;

        while (true) {
            Node groupStart = prevGroupEnd.next;
            Node groupEnd = groupStart;
            for (int i = 1; i < k && groupEnd != null; i++) {
                groupEnd = groupEnd.next;
            }
            if (groupEnd == null) break; // Not enough nodes to reverse

            Node nextGroupStart = groupEnd.next;
            groupEnd.next = null; // Temporarily end the current group

            // Reverse the current group
            Node prev = null;
            Node current = groupStart;
            while (current != null) {
                Node nextNode = current.next;
                current.next = prev;
                prev = current;
                current = nextNode;
            }

            // Connect the reversed group with the previous and next groups
            prevGroupEnd.next = prev; // Connect previous group's end to new start
            groupStart.next = nextGroupStart; // Connect new end to next group's start

            // Move prevGroupEnd to the end of the newly reversed group
            prevGroupEnd = groupStart;
        }

        return dummy.next; // Return the new head of the modified list
    }
    public static void main(String[] args) {
        LinklistRotate list = new LinklistRotate();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);

        System.out.println("Original List:");
        list.display();

        int k = 3;
        Node newHead = list.reverseKGroup(list.head, k);

        System.out.println("List after reversing in groups of " + k + ":");
        LinklistRotate newList = new LinklistRotate();
        newList.head = newHead;
        newList.display();  
        
    }
    
}
