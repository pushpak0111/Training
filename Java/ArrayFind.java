// Printing 2nd and 3rd largest elements in an array by taking array as input
import java.util.Scanner;

public class ArrayFind {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
    // for (int i = 0; i < n; i++) {
    //         for (int j = i + 1; j < n; j++) {
    //             if (arr[i] < arr[j]) {
    //                 int temp = arr[i];
    //                 arr[i] = arr[j];
    //                 arr[j] = temp;
    //             }
    //         }
    //     }
    //     System.out.println("The 2nd largest element is: " + arr[1]);
    //     System.out.println("The 3rd largest element is: " + arr[2]);
    // } 
        int first = arr[0], second = 0;
        for(int i = 0; i< n; i++){
            if(arr[i] > first){
                second = first;
                first = arr[i];
            }else if (arr[i] > second && arr[i] != first ){
                second = arr[i];
            }
        }
        System.out.println(second);
    }
}
