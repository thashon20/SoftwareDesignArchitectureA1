import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class BananaFactory extends FactoryProduction{

    public static void BananaFactoryP2 () throws FileNotFoundException {
        // Open the file.
        FileReader fr = new FileReader("datalist.txt");
        String line="";
        int s=2;
        try (Scanner inFile = new Scanner(fr)) {

            while (s>0){
                line = inFile.nextLine();
                s--;
            }
            System.out.println(line);
      
      
      
      
        }
        
      
          }
      
}
