import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FactoryProduction {
    
    public static void main(String[] args) throws IOException
    {
        // Open the file.
        FileReader fr = new FileReader("datalist.txt");
        Scanner inFile = new Scanner(fr);
        
        String line;
        
        // Read the first line from the file.
        line = inFile.nextLine();
        // Display the line.
        System.out.println(line);

        // Read second line from the file.
        line = inFile.nextLine();
        // Display the line.
        System.out.println(line);

        // Close the file.
        inFile.close();
    }
   
}
