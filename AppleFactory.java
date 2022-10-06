import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class AppleFactory extends FactoryProduction {

    public static void AppleFactoryP2 () throws FileNotFoundException {
  // Open the file.
  FileReader fr = new FileReader("datalist.txt");
  String line="";

  try (Scanner inFile = new Scanner(fr)) {

       // Read the first line from the file.
       line = inFile.nextLine();
       // Display the line.
       System.out.println(line);



  }
  

    }


}
