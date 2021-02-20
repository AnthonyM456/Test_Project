// Anthony Manrique, CSE 8B, A16398508

// The program is a trivia which would take number inputs (int)
// from a user and identify if the answer is correct or not. At the
// end, the final score is tallied and showed to the user.

import java.util.Scanner;

public class CSE8B_PA1 {
  public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
    int guess;
    int numCorrect = 0;
    System.out.println("BRUH");
// First question
    System.out.println("Question 1: Grace Hopper was an admiral in the US Navy.");
    System.out.println("1. True");
    System.out.println("2. False");
    System.out.println("(Type 1 or 2)");
      guess = scnr.nextInt();
      if(guess == 1){
        System.out.println("Nice!");
        numCorrect++;
      }
      else if(guess == 2){
        System.out.println("Incorrect! She was actually an admiral.");
      }
// Second question
    System.out.println("Question 2: Grace Hopper was the inventor of the ___.");
    System.out.println("1. Computer");
    System.out.println("2. Compiler");
    System.out.println("3. Keyboard");
    System.out.println("(Type 1, 2, or 3)");
    guess = scnr.nextInt();
    if(guess == 1){
      System.out.println("Incorrect! It was Compiler.");
    }
    else if(guess == 2){
      System.out.println("Correct!");
      numCorrect++;
    }
    else if(guess == 3){
      System.out.println("Incorrect! It was Compiler.");
    }

// Third question
    System.out.println("Question 3: Grace Hopper she created a ___-page Manual of Operations for the Automatic Sequence-Controlled Calculator");
    System.out.println("1. 150");
    System.out.println("2. 345");
    System.out.println("3. 500");
    System.out.println("(Type 1, 2, or 3)");
    guess = scnr.nextInt();
      if(guess == 1){
        System.out.println("Incorrect! It was 500.");
      }
      else if(guess == 2){
        System.out.println("Incorrect! It was 500.");
      }
      else if(guess == 3){
        System.out.println("Awesome!");
        numCorrect++;
      }

    System.out.println("You got " + numCorrect + " correct!");
  }
}
