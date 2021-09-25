import java.util.Scanner;
public class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String name, String email , char gender){
        this.name = name;
        this.email = email;
        this.gender = gender;
    }//constructor

    public String getName(){
        return  name;
    }//public getter getName


    public String getEmail(){
      return email;
    }//public getter getEmail


    public void setEmail(String Email){
        this.email = Email;
    }//public setter setEmail


    public char getGender(){
        return gender;
    }//public getter getGender


    public String toString(){
        return  getName() + "(" +  getGender() + ") " + getEmail();
    }//public setter toString

    public static void main(String args[]){

        Author myObj = new Author("Nipun Madumal" , "Nipumadumal18@gmail.com" , 'm');
        System.out.println(myObj.name);
        System.out.println(myObj.email);
        System.out.println(myObj.gender);
        System.out.println();
        System.out.println(myObj.getName());
        myObj.setEmail("Acckiller18@gmail.com");
        System.out.println(myObj.getEmail());
        System.out.println(myObj.getGender());



    }
}
