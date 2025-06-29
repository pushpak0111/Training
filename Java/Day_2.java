
//------------------------ Encaptulation : Hava a class inside it we define class and Variables, So binding them via method is Encaptulation------------------- 
/*
class Human{
    private int age ;
    private String Name;

    public int get_age(){
        return age ;
    }
    public String get_Name(){
        return Name;
    }
    
    public void  setAge(int a){
        age = a;
    }
    public void setName(String n){
        Name = n;
    }
}
public class Day_2{
    public static void main(String[] args) {
        Human obj = new Human();
        obj.setAge(50);
        obj.setName("Rahul");
        System.out.println(obj.get_Name() +":"+ obj.get_age());
        
    }    
}    
*/

//------------------------------ Polymorphism : Multiple forms------------------------------
/*class Bird{
    public void Sing(){
        System.out.println("Bird is singing very good.");
    }
    public void Dance(){
        System.out.println("Birds are good at Dancing");
    }
}
class Pegion extends Bird{
    public void Sing(){
        System.err.println("Pegion is very Bad at singing");
    }
}
class Peacock extends Bird{
    public void Dance(String S){
        String Name = S;
        System.out.println(Name);
    }
}
public class Day_2{
    public static void main(String[] args) {
        Bird obj = new Bird();
        Pegion pobj = new Pegion();
        obj.Sing();
        pobj.Sing();
        Peacock P = new Peacock();
        obj.Dance();
        P.Dance("Peacock is Dancing in the Rain.");
    }
}*/

//----------------------------------------------------Inheritance--------------------------------------------------------

/*
class Mouse_1 extends Mouse{
    String Color = "Red";
    public void RightClick(){
        System.out.println("Right Click from Mouse 1");
    }
    public void LeftClick(){
        System.out.println("Left Click from mouse 1");
    }
}

class Mouse_2 extends Mouse{
    String Texture = "Matte";
    public void RightClick(){
        System.out.println("Right Click from Mouse 2");
    }
    public void LeftClick(){
        System.out.println("Left Click from Mouse 2");
    }
}

class Mouse{
     public void RightClick(){
        System.out.println("Right Click from Main Mouse");
    }
    public void LeftClick(){
        System.out.println("Left Click from Main Mouse");
    }
    public void Connect(){
        System.out.println("Connected");
    }
}

public class Main{
    public static void main(String[] args) {
        Mouse M2 = new Mouse();
        M2.LeftClick();
        M2.RightClick();
        M2.Connect();
    }

}
*/

// ----------------------- Question--------------------------Incomplete
/*
 * Input = "abc12"      Output= Invalid
 * Input = "Abc12@"     Output = Valid
 * Input = "123"      Output - Invalid
 */
 /*import java.util.Scanner;
 class Authenticator{
    private String Password;  
    public String IsValid;  
    public String get_Pass(){
        return Password;
    }
    public void Set_Pass(String P){
        Password = P;
    }
    public String Check(){
        while (Password =! i)){
            return IsValid = "In Valid";
        }
        else if (Password == "Abc12@"){
            return IsValid = "Valid";
        }
        e

    }
 }
 public class Main{
    public static void main(String [] args){

    }
 }
*/

 //-----------------------Question 2 ----------------------
 /*
  * Input : Monkey1 : Smiling 
            Monkey2 : Smiling
    Output: Safe
    Input : Monkey1 : Not Smiling 
            Monkey2 : Not Smiling
    Output: Safe
    Input : Monkey1 : Smiling 
            Monkey2 : Not Smiling
    Output: Not Safe
  */
/*import java.util.Scanner;
public class Day_2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Status of Monkey 1 : ");
        String M1 = scanner.next();
        System.out.println("Enter the Status of Monkey 2 : ");
        String M2 = scanner.next();
        if(M1.equalsIgnoreCase(M2)){
            System.out.println("You are Safe");
        }else{
            System.out.println("you are Not Safe");
        }
    }
}
    */