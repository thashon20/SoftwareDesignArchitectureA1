import java.io.FileNotFoundException;
import java.util.Scanner;

public class GroceryProductFactory   {
    public static void main (String Args[]) throws FileNotFoundException{

    FactoryProduction product1 = new FactoryProduction();
    FactoryProduction product2 = new FactoryProduction();
   
    try (Scanner input = new Scanner(System.in)) {       
    int selection = 0;
    int selection2 = 0;

        System.out.print("Enter grocery item ( 1= apple, 2=banana): ");
        if (input.hasNextInt()) {

   selection = input.nextInt();
}

    product1.getProductItem(selection); // ask user what kind of item factory they want 
   // input.close();
    


    
        

        System.out.print("Enter grocery item ( 1= apple, 2=banana): ");
       

        if (input.hasNextInt()) {

            selection2 = input.nextInt();
         }
         

    
    product2.getProductItem(selection2); // ask user what kind of item factory they want 
   // input2.close();
    }
}

    // select value betweeen 1 and 2
    // 1 = apples 2= bananas
    // this class used to make different product type factories
    // this is abstract factory class  
    // should create object here and later be defined and set in subclass 
    // subclass should be able to redefine and instantiate in subclass 

   /**  public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter grocery item ( 1= apple, 2=banana): ");
            int s = input.nextInt();
            if(s == 1 ){
                System.out.println("You have selected apple factory ");
            } 
            else if (s==2) {
                System.out.println("You have selected banana factory ");
            }
            else{
                System.out.println("Invalid factory, please check back later for updates ");
            }
        }
    }
    */
// THIS IS A TEST COMMIT 


// get value of number to represent which grocery product 
// go into class to get price from database related to which product 
// then output price of grocery product selected 
// will be used to get price based on info in data file 
// should redefine object and instantiate here to get price 
 

}

