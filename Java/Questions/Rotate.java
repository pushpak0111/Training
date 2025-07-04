
// rotate the given array ky integer k without using functions
import java.util.Scanner;
import java.util.Arrays;

public class Rotate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        System.out.println("Enter the elements of the array:");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the k value: ");
        int k = sc.nextInt();

        // int arr[] = {1, 2, 3, 4, 5, 6, 7}; // Example array
        // int k = 3; // Number of positions to rotate
        int[] rotated = new int[n];

        for (int i = 0; i < n; i++) {
            rotated[i] = arr[(i + k) % n];
        }

        // Print the rotated array
        for (int i = 0; i < n; i++) {
            System.out.print(rotated[i] + " ");
        }
    }
}