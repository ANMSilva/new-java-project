import java.util.Scanner;
public class CodeForKids {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String weather = scan.next();
        scan.close();
        if(weather.equals("Raining")){
            System.out.println("I am staying home");
        }else{
            System.out.println("I am going to out for walk");
        }

    }
}
