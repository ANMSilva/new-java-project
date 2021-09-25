import java.util.Scanner;
public class ifElseIf {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        scan.close();
        if(x > 0){
            System.out.println("Positive Number");
        }else if(x < 0){
            System.out.println("Negative Number");
        }else{
            System.out.println("Zero");
        }

    }
}
