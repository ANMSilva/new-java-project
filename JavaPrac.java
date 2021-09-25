public class JavaPrac {
    //this is encapsulation
    private int x;//private variables can be only assigned or updated by using get and set methods.
    private int y;

    public int getX(){
        return x;
    }//return x value
    public void setX(int a){
        this.x = a;
    }//set x value

    public int getY(){
        return y;
    }//return y value
    public void setY(int b){
        this.y = b;
    }//set y  value



    public static void main(String args[]){
        JavaPrac NewObj = new JavaPrac();
        NewObj.setX(10);
        System.out.println(NewObj.getX());
        NewObj.setY(20);
        System.out.println(NewObj.getY());
    }
}
//Why Encapsulation?
        //Better control of class attributes and methods
        //Class attributes can be made read-only (if you only use the get method), or write-only (if you only use the set method)
        //Flexible: the programmer can change one part of the code without affecting other parts
        //Increased security of data