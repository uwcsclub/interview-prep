/* Computer Science Club at UW
 *
 * Class to implement the First Unique Char In String problem.
 * See /First Unique Char in a String/Question.txt for problem details.
 * Last updated 11/07/2017
 * 
 * Run this program and follow the inputs to test your implementation.
 */

import java.util.*;
import java.io.*;

public class FirstUniqueCharInString {

   public static void main(String[] args) {
      System.out.println("Testing your code...");
      
      
   }
   
   // DO YOUR LOGIC IN THIS METHOD
   public static char firstUniqueCharInString(String input) {
      
      return 'x'; // placeholder
      
   }
   
   public static void testCode() {
      String a = "a";
      String b = "abad";
      String c = "haassddffffzaaaaassssddddfffffaassddffaassdfhelloo";
      
      boolean allPassed = true;
      
      System.out.print("Test 1... ");
      
      char output = firstUniqueCharInString(a);    
      
      if (output == 'a') {
         System.out.println(" Passed!");
      } else {
         System.out.println(" Failed :(");
         allPassed = false;
      }
      
      if (output == 'b') {
         System.out.println(" Passed!");
      } else {
         System.out.println(" Failed :(");
         allPassed = false;
      }
      
      if (output == 'z') {
         System.out.println(" Passed!");
      } else {
         System.out.println(" Failed :(");
         allPassed = false;
      }
      
      if (allPassed) {
         System.out.println("Good job! You passed these tests :D");
      } else {
         System.out.println("Oh no! At least one or more tests failed. Something is wrong :O");
      }
   }
}