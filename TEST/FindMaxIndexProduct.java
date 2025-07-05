/*You are given a list of  numbers . For each element at position  (), we define  and  as:
 = closest index j such that j < i and . If no such j exists then  = 0.
 = closest index k such that k > i and . If no such k exists then  = 0.

We define  =  * . You need to find out the maximum  among all i. */
/*The first line contains an integer , the number of integers. 
The next line contains the  integers describing the list a[1..N]. */
//Find the maximum product of indices based on the given conditions.
import java.util.Scanner;
// Hackerrank Problem Link: https://www.hackerrank.com/challenges/find-the-index/product
public class FindMaxIndexProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n + 2];
        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextInt();
        }
        a[0] = Integer.MAX_VALUE;
        a[n + 1] = Integer.MAX_VALUE;

        int[] left = new int[n + 2];
        int[] right = new int[n + 2];

        for (int i = 1; i <= n; i++) {
            left[i] = 0;
            for (int j = i - 1; j >= 0; j--) {
                if (a[j] < a[i]) {
                    left[i] = j;
                    break;
                }
            }
        }

        for (int i = n; i >= 1; i--) {
            right[i] = 0;
            for (int j = i + 1; j <= n + 1; j++) {
                if (a[j] < a[i]) {
                    right[i] = j;
                    break;
                }
            }
        }

        long maxProduct = Long.MIN_VALUE;
        for (int i = 1; i <= n; i++) {
            long product = (long) left[i] * right[i];
            if (product > maxProduct) {
                maxProduct = product;
            }
        }

        System.out.println(maxProduct);
    }
}