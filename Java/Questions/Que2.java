/*
Q4. Arun is studying in the eighth grade, and he is working on some tasks to find the sequence. 
In the sequence, the nth term is equal to the number of times `n` appears in the sequence.

For example:
If the input is 5, then the output will be: 1 2 2 3 3

Explanation:
Since the first term is 1, there is no change;
The second term is 2, so 2 appears twice;
The third term is 2, so 3 appears twice.

Input Format:
The input N should be a positive integer.

Output Format:
The sequence of the Nᵗʰ term is equal to the number of `n` times that appear.

Constraints:
0 <= N <= 100

Sample Input 1:
3
Sample Output 1:
1 2 2

Sample Input 2:
8
Sample Output 2:
1 2 2 3 3 4 4 4
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Que2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the k value: ");
        int n = sc.nextInt();
        

        ArrayList<Integer> sequence = new ArrayList<>();
        sequence.add(1); // Start with the first term as 1
        
        int i = 2;
        while (sequence.size() < n) {
            int freq = sequence.get(i - 2); // Get the frequency of the previous term
            for (int j = 0; j < freq && sequence.size() < n; j++) {
                sequence.add(i); // Add the current term i, freq times
            }
            i++; // Move to the next term
        }
        for (int num : sequence) {
            System.out.print(num + " ");
        
        }
    }
}

