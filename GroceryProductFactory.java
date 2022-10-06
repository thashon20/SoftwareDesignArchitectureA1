import java.io.FileNotFoundException;
import java.util.Scanner;

public class GroceryProductFactory   {
    public static void main (String Args[]) throws FileNotFoundException{

    // creates new product objects that will select a factory
    FactoryProduction product1 = new FactoryProduction(); 
    FactoryProduction product2 = new FactoryProduction();
    FactoryProduction product3 = new FactoryProduction();
   
    // creates scanner for input for selection
    try (Scanner input = new Scanner(System.in)) {
    
    //initialize the selection variables for each product object
    int selection = 0;
    int selection2 = 0;
    int selection3 = 0;

    // receive user input for which grocery item and factory to select 
    System.out.print("Enter grocery item ( 1= apple, 2=banana, 3=tomatoe): ");
        // check to make sure input is integer receive input based on integer entered and corresponding factory 
        if (input.hasNextInt()) {
            selection = input.nextInt();
        }
    // will process user input based on what kind of item factory they want 
    product1.getProductItem(selection); 


        System.out.print("Enter grocery item ( 1= apple, 2=banana, 3=tomatoe ): ");
        if (input.hasNextInt()) {
            selection2 = input.nextInt();
         }
    // will process user input based on what kind of item factory they want     
    product2.getProductItem(selection2); 


        System.out.print("Enter grocery item ( 1= apple, 2=banana, 3=tomatoe ): ");
        if (input.hasNextInt()) {
        selection3 = input.nextInt();
        }
    // will process user input based on what kind of item factory they want     
    product3.getProductItem(selection3); // will process user input based on what kind of item factory they want 
    }
  }
}

