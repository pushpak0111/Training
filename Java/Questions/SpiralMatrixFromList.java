class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
    }
}
public class SpiralMatrixFromList {
    // Fill matrix in spiral order from linked list
    public static int[][] spiralFill(Node head, int m, int n) {
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                matrix[i][j] = -1;

        int top = 0, bottom = m - 1, left = 0, right = n - 1;
        Node current = head;

        while (current != null && top <= bottom && left <= right) {
            for (int i = left; i <= right && current != null; i++) {
                matrix[top][i] = current.data;
                current = current.next;
            }
            top++;
            for (int i = top; i <= bottom && current != null; i++) {
                matrix[i][right] = current.data;
                current = current.next;
            }
            right--;
            for (int i = right; i >= left && current != null; i--) {
                matrix[bottom][i] = current.data;
                current = current.next;
            }
            bottom--;
            for (int i = bottom; i >= top && current != null; i--) {
                matrix[i][left] = current.data;
                current = current.next;
            }
            left++;
        }
        return matrix;
    }
    // Create linked list from array
    public static Node createList(int[] arr) {
        Node head = null, tail = null;
        for (int val : arr) {
            Node newNode = new Node(val);
            if (head == null) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                tail = tail.next;
            }
        }
        return head;
    }
    // Print matrix
    public static void printMatrix(int[][] mat) {
        for (int[] row : mat) {
            for (int val : row) {
                System.out.print((val == -1 ? " - " : val) + "\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int m = 3, n = 5;
        int[] data = {3, 0, 2, 6, 8, 1, 7, 9, 4, 2, 5, 5, 0, 2, 6}; // head
        Node head = createList(data);

        int[][] result = spiralFill(head, m, n);

        System.out.println("Spiral Matrix:");
        printMatrix(result);
    }
}