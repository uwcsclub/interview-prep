/* Computer Science Club at UW
 *
 * Class to implement the Largest Sum Contiguous Subarray problem.
 * See /Largest Sum Contiguous Subarray/Question.txt for problem details.
 * Last updated 10/31/2017
 * 
 * Run this program and follow the inputs to test your implementation.
 */

import java.util.*;
import java.io.*;

public class LargestSumContiguousSubarray {

   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      
      System.out.println("Which input would you like (1-3): ");
      int option = scan.nextInt();
      
      int[] input = chooseInput(option);
      int[] answer = chooseAnswer(option);
      
      int[] output = largestSumContiguousSubarray(input);
      
      compareArrays(output, answer);
   }
   
   // DO YOUR LOGIC IN THIS METHOD
   public static int[] largestSumContiguousSubarray(int[] input) {
   
      return null; // placeholder
      
   }
   
   /***** Helper Methods *****/
   private static int[] chooseInput(int inputChoice) {
      if (inputChoice == 1) {
         return new int[]{-2, -3, 4, -1, -2, 1, 5, -3};
      } else if (inputChoice == 2) {
         return new int[]{-3, -7, -6, -2, -1, -5};
      } else if (inputChoice == 3) {
         return new int[]{1, 8, 4, 6, 3, 10, 4};
      } else {
         throw new IllegalArgumentException("Input choice was not a valid input. Input value: " + inputChoice);
      }
   }
   
   private static int[] chooseAnswer(int answerChoice) {
      if (answerChoice == 1) {
         return new int[]{4, -1, -2, 1, 5};
      } else if (answerChoice == 2) {
         return new int[]{-1};
      } else if (answerChoice == 3) {
         return new int[]{1, 8, 4, 6, 3, 10, 4};
      } else {
         throw new IllegalArgumentException("Answer choice was not a valid input. Answer value: " + answerChoice);
      }
   }
   
   private static void compareArrays(int[] output, int[] answer) {
      boolean isCorrect = true;
      
      if (output.length != answer.length) {
         System.out.println("Output array and Answer array sizes do not match.");
         System.out.println("Output array size: " + output.length);
         System.out.println("Answer array size: " + answer.length);
         isCorrect = false;
      }
      
      for (int i = 0; i < Math.min(output.length, answer.length); i++) {
         if (output[i] != answer[i]) {
            isCorrect = false;
         }
      }
      
      if (isCorrect) {
         System.out.println("Congratulations! Your output array matches the answer"); 
      } else {
         System.out.println("Oh no! Your answer isn't quite right. Try again.");
      }
   }
}