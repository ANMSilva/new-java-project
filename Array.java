public class Array {
    public static void main(String[] args){
        String[] names;//array declaration.
        names = new String[]{"Nipun" , "Eranga" , "Erangi"};
        int[] numbers = new int[]{1,2,3,4,5,6,7,8,9,10};


        for(int i = 0 ; i < names.length ; i++){
                System.out.println(names[i]);
        }


        int i = 0;
        //in while loop condition will be checked at the first place.
        while( i < numbers.length){
            System.out.print(numbers[i] + " ");
            i++;
        }
        System.out.println("");

        int j = 0;
        do{
            System.out.print(numbers[j] + " ");
            j++;
        }while( j < numbers.length);//in do while loop code will be executed at least one time due to condition will be checked after execution.

        System.out.println("");

        for(String name : names){
            System.out.print(name + " ");
        }System.out.print("");
        for(int num : numbers){
            System.out.println(num + " ");
        }

    }
}
