// Name : Pushpak Kore
// Enrollment No : MITU22BTCS0614
// Date : 05/07/2025
// Queue using two stacks
// Hackerrank Problem Link : https://www.hackerrank.com/challenges/queue-using-two-stacks/problem
// Problem Statement :

/*The first line contains a single integer, , denoting the number of queries.
 Each line  of the  subsequent lines contains a single query in the form described in the problem statement above. 
 All three queries start with an integer denoting the query ,
  but only query  is followed by an additional space-separated value, , denoting the value to be enqueued.*/

import java.util.Scanner;
import java.util.Stack;

public class QueusUsingTwoStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        int q = sc.nextInt();
        
        for (int i = 0; i < q; i++) {
            int queryType = sc.nextInt();
            if (queryType == 1) {
                int value = sc.nextInt();
                stack1.push(value);
            } else if (queryType == 2) {
                if (stack2.isEmpty()) {
                    while (!stack1.isEmpty()) {
                        stack2.push(stack1.pop());
                    }
                }
                if (!stack2.isEmpty()) {
                    stack2.pop();
                }
            } else if (queryType == 3) {
                if (stack2.isEmpty()) {
                    while (!stack1.isEmpty()) {
                        stack2.push(stack1.pop());
                    }
                }
                if (!stack2.isEmpty()) {
                    System.out.println(stack2.peek());
                }
            }
        }
        sc.close();
    }
}