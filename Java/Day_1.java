/* public class Basics{
    public static void main(String [] args){
        int a = 10, b = 20;
        int result = a + b;
        System.out.println("Result is " + result);
    }
}
*/



/*import java.util.Scanner;
public class Basics{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st number: ");
        int num1 = sc.nextInt();

        System.out.println("Enter 2nd number: ");
        int num2 = sc.nextInt();

        int result = num1 / num2;
        System.out.println("Division of two numbers is " + result);
        System.out.println("result is " + (num1-num2));
    } */



    // Left Shift Operator 
/*public class Basics{
    public static void main(String [] args){
        int a = 5;
        int Left_Shift =  a << 3; 
        System.out.println(Left_Shift);
    }
}*/



    // Swapping two Numbers without third operator
 /*public class Basics {
    public static void main(String[] args) {
        int a = 3, b = 19;
        System.out.println("Before Swapping a = "+ a + " and b = " + b );
        a = a + b; 
        b  = a - b;
        a = a - b;
        System.out.println("After Swapping a = "+ a + " and b = " + b );
    }
}*/



    // Conditional Statements
 /*public class Basics{
    public static void main(String[] args) {
        int a = 10, b = 5;
        if ((a > 5 ) && (b < 10)){
            System.out.println("Hello");
        }
        else if ((a >= 10) || (b <= 10 )){
            System.out.println("Hii");
        }
        else{
            System.out.println("Hello Sir");
        }
        int num = 3;
        switch (num) {
            case 1:
                System.out.println("How are you?");
                break;

            case 2:
                System.out.println("Where are you?");
                break;

            case 3:
            System.out.println("Who are you?");
            break;

            default:
                break;
        }
    }
}*/


// Program weather character is vowel or not using if statements
/*import java.util.Scanner;
public class Basics{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter any character : ");
        String a = input.next();
        char character  = a.charAt(0);

        if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u'){
            System.out.println("Character :" +character+ "is Vowel");
        }
        else {
            System.out.println("Character :" + character + " is Consonact");
        }
    }

}*/




// program to print first 5 Natural Numbers
// Program to check given number is odd or even 






// Write a Program for question Are you come for attendance and answer it True or False
/* 
import java.util.Scanner;
public class Basics{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Are you coming for attendance only ? (True / False)");
        boolean input = scanner.nextBoolean();

        if(input){
            System.out.print("Yes, I am coming for attendance only !!");
        } else {
            System.out.print("No, I am not coming only for attendsance!!");
        }
    }
}


import java.util.Scanner;
public class Basics{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Are you a good boy?");
        String input = scanner.nextLine();

        if(input.equals("Yes")){
            System.out.print("I am a Good Boy");
        } else if (input.equals("No"))
            System.out.print("No, I am  a Superman !");
        }
    }
}






*/
/* given a month number, room type, num of rooms, total num of Stay days, calculate the amt to be paid for the stay 
 * month number ranges from 1-12
 * room type -> 1-4
 * 1) Basic -1000/Night, 2) Studio - 2000/Night, 3) Apartment - 5000/Night, 4) Individual Vill - 8000/Night
 * based on month booking discount applied are: 
 * 1-3 5%
 * 4-5 10%
 * 6-9 20%
 * 10-11 15%
 * 12 5%

import java.util.*;
import java.util.Scanner;

public class Basics{
    public static void main(String[] args) {
        //int[] Months_Arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        //int[] Room_Type_Arr = {1, 2, 3, 4};
        int Month = 0;
        int Room_Type = 0;
        int NofDays = 0;
        int Total_Num_of_Rooms = 0;
        //for (int i = 0; i < Room_Type_Arr.length; i++){
        int Discount = 0;
        int Price = 0;

        if(Month >= 1 && Month <= 12){
            if((Month >= 1 && Month <=3) || Month == 12){
                Discount = 5;
            }
            else if(Month == 4 || Month ==5) { 
                Discount = 10;  
            }else if(Month >= 6 && Month <=9){
                Discount = 20;
            }else{
                Discount = 15;
            }
        }else{
            System.out.println("Invalid Month");
        }

        if (Room_Type >= 1 && Room_Type<= 4){
            switch (Room_Type) {
                case 1:
                    Price = 1000;
                    break;
                case 2:
                    Price = 2000;
                    break;
                case 3:
                    Price = 5000;
                    break;
                case 4:
                    Price = 8000;
                    break;
                default:
                    System.out.println("Room Numbeer Not Valid");;
            }
        }

        //int Final_Price = 
    }
}
*/



// WAP to check weather the given three sides can form Triangle or not.{Sum of two sides are greater than third side}
/* 
import java.util.Scanner;
public class Basics{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Length of Three sides of a triangle : ");
        int Len1 = scanner.nextInt();
        int Len2 = scanner.nextInt();
        int Len3 = scanner.nextInt();

        if(((Len1 + Len2 ) >= Len3) && ((Len2 + Len3 ) >= Len1) && ((Len3 + Len1) >= Len2)){
            System.out.println("It Forms a triangle");
        }else{
            System.out.println("These sides does not forms Triangle");
        }
    }
}
*/


// WAP to check weather the given triangle is equilateral, Scalene or Isosceles.
/*import java.util.Scanner;

import javax.swing.JSpinner.ListEditor;
public class Basics{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Length of Three sides of a triangle : ");
        int Len1 = scanner.nextInt();
        int Len2 = scanner.nextInt();
        int Len3 = scanner.nextInt();

        if((Len1 == Len2) && (Len2 == Len3)){
            System.out.println("It is Equilateral triangle");
        }else if ((Len1 == Len2) || (Len2 == Len3) || (Len3 == Len1)){
            System.out.println("Tit is Isosceles Triangle");
        }else if((Len1 != Len2) && (Len2 != Len3)){
            System.out.println("It is Scalene Triangle");
        }
    }
}
*/



// WAP for the given date is valid or not {}



 /*  WAP for this
* 1234 => 12 => 3
* 3456 => 18 => 9 
1 => 1 */

import java.util.Scanner;
public class Day_1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int Number = scanner.nextInt();
        int Sum = 0;

        

    }          
}