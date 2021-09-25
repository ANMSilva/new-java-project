import java.util.Scanner;
public class Book {
    private String name;
    private String author;
    private double price;
    private int qtyInStock;

    public Book(String name1 , String author1 ,Double price1 ){
        name = name1;
        author = author1;
        price = price1;
        //qtyInStock = qtyInStock1;
    }//1st constructor

    public Book(String name1 , String author1 ,Double price1 , int qtyInStock1  ){
        name = name1;
        author = author1;
        price = price1;
        qtyInStock = qtyInStock1;
    }//2nd constructor

    public String getName(){
        String getname = "Nipun Madumal";
        return getname;
    }//public getting getName

    public String getAuthor(){
        String getauthor = "Nipun Madumal";
        return getauthor;
    }//public getting getAuthor

    public double getPrice(){
        double getprice = 250.00;
        return getprice;
    }

    public void setPrice(double Price){
         System.out.println( Price);
    }

    public static void main(String args[]){

    }
}
