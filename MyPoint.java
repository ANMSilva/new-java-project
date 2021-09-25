import java.util.*;
public class MyPoint{
    private int x ;
    private int y ;

    public MyPoint(){
    }

    public MyPoint(int x , int y){
      this.x = x;
      this.y = y;
    }//this is a constructor

    public int getX(){
      return x;
    }//return value of x

    public void setX(int x){
      this.x = x;
    }//set value of y

    public int getY(){
        return y;
    }//return value of y

    public void setY(int y){
        this.y = y;
    }//set value of y

    public void setXY(int x ,int y){
            this.x = x*y;
    }

     public String toString(){
         return x + "," + y;
    }
    public double distance(int x , int y){
         return Math.sqrt(x*x + y*y);
    }

    public double distance(MyPoint another){
        return another.distance( x ,y);
    }


    public static void main(String args[]){
        System.out.println();
    }
}