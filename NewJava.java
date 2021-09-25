import java.util.Scanner;//import scanner
public class NewJava {
    final int x = 10;
    int y ;
    String fname = "Nipun";
    String lname = "Madumal";

    static int staticMethod(int a){//static method and can be call directly
        return 2*a;//return value
    }

    public int publicMethod(int b){//public method and can't be call directly.Declare an object call method via object.
        return 2*b;//return value
    }
    public static void main(String [] args){

        NewJava newObj = new NewJava();//create new object called newObj

        Scanner scan = new Scanner(System.in);//initialize scanner
        newObj.y = scan.nextInt();//get user inputs
        scan.close();//close scanner

        //newObj.x = 30;
        //in this case we can't assign 30 to x due to x has been initialized as a final value.
        System.out.println(newObj.x);//print value of x
        System.out.println(newObj.y);//print value of y
        System.out.println("Hello my name is " +newObj.fname + " " + newObj.lname);//string concatenate using objects30

        System.out.println(staticMethod(10));//static method
        System.out.println(newObj.publicMethod(20));//public method
    }
}
