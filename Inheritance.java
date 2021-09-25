class Inheritance{//this is child class
    protected String brand = "MSI";//The code is accessible in the same package and subclasses.If it was set to private, the inheri class would not be able to access it.
    public void honk(){
        System.out.println("i have not a better idea about this");
    }
}//if we write above class as "final class Inheritance", other classes cant inherit data from this class.

class  inheri extends Inheritance {//this is super class
    private String modelName = "MSI gf63";//The code is only accessible within the declared class
    public static void main(String args[]){
        inheri newObj = new inheri();//because of class inheri extends inheritance we can call the child class
        Inheritance newObj2 = new Inheritance();
        newObj.honk();

        System.out.println( newObj.brand + " --> " + newObj.modelName);
        System.out.println( newObj2.brand);

    }
}

//private attributes can be access in same declared class. in above child class if we use private we cant access that class. Instead of we have used protected.
//It is useful for code reusability: reuse attributes and methods of an existing class when you create a new class.
