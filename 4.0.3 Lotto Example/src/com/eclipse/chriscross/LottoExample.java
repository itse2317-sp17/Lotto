package com.eclipse.chriscross;

import java.util.Scanner;
/**
* The LottoExample program implements an application that
* reads in a two digit number and compares it against a random
* two digit number to determine if the user is a winner.  You can use this
* example as a starting point for your texasLotto project.
*
* @author  Daniel Liang
* @version 1.0
* @since   2017-14-2017
*/public class LottoExample {
  public static void main(String[] args) {
    // Generate a lottery as a two-digit string
    String lottery = "" + (int)(Math.random() * 10)
      + (int)(Math.random() * 10);
    // Prompt the user to enter a guess
    Scanner input = new Scanner(System.in);
    System.out.print("Enter your lottery pick (two digits): ");
    String guess = input.nextLine();
    // Get digits from lottery
    char lotteryDigit1 = lottery.charAt(0); 
    char lotteryDigit2 = lottery.charAt(1); 
    // Get digits from guess
    char guessDigit1 = guess.charAt(0);
    char guessDigit2 = guess.charAt(1);
    System.out.println("The lottery number is " + lottery);
    // Check the guess
    if (guess.equals(lottery))
      System.out.println("Exact match: you win $10,000");
    else if (guessDigit2 == lotteryDigit1
          && guessDigit1 == lotteryDigit2)
      System.out.println("Match all digits: you win $3,000");
    else if (guessDigit1 == lotteryDigit1 
          || guessDigit1 == lotteryDigit2 
          || guessDigit2 == lotteryDigit1 
          || guessDigit2 == lotteryDigit2)
      System.out.println("Match one digit: you win $1,000");
    else
      System.out.println("Sorry, no match"); 
  }
}