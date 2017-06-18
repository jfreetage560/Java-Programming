/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessinggame;

import java.util.Scanner;
import java.util.Random;
public class GuessingGame
{
   public static void main (String [] args) {


  //Variables
  Random randomNumber = new Random();
  Scanner kbd = new Scanner(System.in);
  int computerValue = randomNumber.nextInt(0x64);
  int numberOfTries = 0;
  int success = 0;
  int guess = 0;


  //Logic and While Loop



 while(true) {
    computerValue = randomNumber.nextInt(10000);
    numberOfTries = 0;
    while (true) {
        System.out.println("please enter an integer betwen 1 and 10000 inclusive: ");
        guess = kbd.nextInt();
        numberOfTries++;

        if (guess < 1 || guess > 10000) System.out.println("Invalid input");
        else if (guess == computerValue) {
            System.out.println("Congratulations you won! Your numbers of tries was: " + numberOfTries + " and the number was: " + computerValue);
            // leave the first loop
            break;
        }
        else if (guess < computerValue) System.out.println("Your guess is too low!");
        else if (guess > computerValue) System.out.println("Your guess is too high!");
    }

    System.out.println("Do you want to play again? (1:Yes/2:No)");
    // if input is not yes leave second loop
    if(kbd.nextInt() != 1) break;
    }
  }
 }