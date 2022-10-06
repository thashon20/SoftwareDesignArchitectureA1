import java.io.FileNotFoundException;


public class FactoryProduction extends GroceryProductFactory {

    //class that will get value corresponding to integer entered by user    
    //will output to user which factory selected
    public void getProductItem(int select) throws FileNotFoundException {

        if(select  == 1 ){  
            System.out.println("You have selected apple factory ");

            // calls factory to get information for the product factory selected
            AppleFactory.AppleFactoryP2();
        }

        else if (select==2) {
            System.out.println("You have selected banana factory ");

            // calls factory to get information for the product factory selected
            BananaFactory.BananaFactoryP2();
        }

        else if (select==3) {
            System.out.println("You have selected tomatoe factory ");

            // calls factory to get information for the product factory selected
            TomatoeFactory.TomatoeFactoryP2();
        }

        else{
            // will output this if a invalid factory number is entered 
            System.out.println("Invalid factory, please check back later for updates ");
        }  
    }
}
   

