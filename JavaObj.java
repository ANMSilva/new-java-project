public class JavaObj {

    int age;
    String name ;
    String id;
    public JavaObj(int a , String b ,String ID){
        age = a;
        name = b;
        id = ID;
    }
    public static void main(String args[]){
      JavaObj myObj = new JavaObj(23 , "Nipun" , "981371631V");
      System.out.println("Hello my name is " + myObj.name + ". My age is " + myObj.age + "and my id is " + myObj.id);
    }
}