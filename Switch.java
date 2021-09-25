import java.util.Scanner;

public class Switch{
    public static void main(String[] argh) {
     Scanner scan  = new Scanner(System.in);
     System.out.print("Enter the grade : ");
     String grade = scan.next();
     scan.close();

     switch(grade){
         case "A+": case "A": case "A-":
             System.out.println("You are a great student");
             break;
         case "B+": case "B": case "B-":
             System.out.println("You are a good student");
             break;
         case "C+": case "C": case "C-":
             System.out.println("You are a poor student");
             break;
         case "D+": case "D": case "D-":
             System.out.println("You are a very poor student");
             break;
         default:
             System.out.println("Failed");
             break;
     }
    }
}