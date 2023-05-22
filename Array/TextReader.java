package Array;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TextReader {
   public static void main(String[] args) {
      String filename = "Array\\copy\\sample.txt"; // replace with the name of your text file
      try {
         BufferedReader reader = new BufferedReader(new FileReader(filename));
         String line = reader.readLine();
         while (line != null) {
            System.out.println(line);
            line = reader.readLine();
         }
         reader.close();
      } catch (IOException e) {
         System.out.println("Error reading file: " + e.getMessage());
      }
   }
}
