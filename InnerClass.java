class OuterClass{//this is the outer class
    int x = 10;
    class InnerClass{//this is the inner class
        int y = 20;
    }
}
public class InnerClass {
    public static void main(String args[]){
        OuterClass OuterNewObj = new OuterClass();//create an object using outer class
        OuterClass.InnerClass innerNewObj = OuterNewObj.new InnerClass();//create an object using inner class
        System.out.println("Outer X = " + OuterNewObj.x + "\nInner Y = " + innerNewObj.y );
    }
}
