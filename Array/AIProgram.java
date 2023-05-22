package Array;

import java.util.Scanner;

public class AIProgram {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Hello, what is your name? ");
      String name = input.nextLine();
      System.out.println("Nice to meet you, " + name + "!");
      
      // AI code
      System.out.print("What is your favorite color? ");
      String color = input.nextLine();
      if (color.equalsIgnoreCase("blue")) {
         System.out.println("I also like the color blue!");
      } else {
         System.out.println("Interesting, I've never heard of the color " + color + ".");
      }
   }
}
