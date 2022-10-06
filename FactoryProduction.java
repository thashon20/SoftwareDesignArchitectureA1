import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FactoryProduction extends GroceryProductFactory {

    public void getProductItem(int select) throws FileNotFoundException {
        if(select  == 1 ){  
            System.out.println("You have selected apple factory ");
            AppleFactory.AppleFactoryP2();

        }

   
        else if (select==2) {
            System.out.println("You have selected banana factory ");
            BananaFactory.BananaFactoryP2();
        }
        else if (select==3) {
            System.out.println("You have selected vegetable factory ");
        }
        else{
            System.out.println("Invalid factory, please check back later for updates ");
        }


        
    }

    

    /**public int getProductItem() throws FileNotFoundException {
           // Open the file.
           FileReader fr = new FileReader("datalist.txt");
           Scanner inFile = new Scanner(fr);
           String line="";
           int s=0;

        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter factory item ( 1= apple, 2=banana, 3=vegetable): ");
            s = input.nextInt();
            if(s == 1 ){
               
                System.out.println("You have selected apple factory ");
                // Read the first line from the file.
                line = inFile.nextLine();
                // Display the line.
                System.out.println(line);
                
            } 
            else if (s==2) {
                System.out.println("You have selected banana factory ");
                while (s>0){
                    line = inFile.nextLine();
                    s--;
                }
                System.out.println(line);
            }
            else if (s==3) {
                System.out.println("You have selected vegetable factory ");
                while (s>0){
                    line = inFile.nextLine();
                    s--;
                }
                System.out.println(line);
            }
            else{
                System.out.println("Invalid factory, please check back later for updates ");
            }
        }
         // Close the file.
         inFile.close();
    }
    */

    }
   

