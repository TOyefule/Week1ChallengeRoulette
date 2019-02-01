package com.company;

import java.util.Random;
import java.util.Scanner;
//Challenge 2: Roulette

/*
You will write a Java program to simulate Roulette, a casino game.

Players will be able to enter in the amount of money they want to bet and the type of bet they will be placing.

The types of bets include:
Red: You are betting that the next roll will come up red.
Black: You are betting that the next roll will come up black.
Even: This is wagering that the ball will land on an even number between 1-36.
Odd: This is wagering that the ball will land on an odd number between 1-36.
Low: This is a bet that the next number will be between 1 and 18.
High: This is a bet that the next number will be between 19 and 36.
The program will then randomly generate a number between 1-36 and a color (red or black). You will then double the player's amount if they won, or deduct their money if they lost.

Allow the user to play as many games as they want until they want to quit.

At the end of the program, print out the net amount of money they've earned, whether that's positive or negative. In addition, also print out the number of games they have won and lost.
 */
public class Main {

    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);

        //      Variables:
        int money = 0;
        int betAmount = 0;
        int gamesWon = 0;
        int gamesLost = 0;
        int answer = 0;

        //     Random Int():
        int num1 = 1 + r.nextInt(6);
        int num2 = 1 + r.nextInt(6);

        //     String[]:
        Strings[] bets = new string[6];
    while(answer == 0) {

        System.out.println(" WELCOME! Let's play some Roulette!");
        System.out.println("Enter the type of bet you would like to place (red|black|even|odd|high|low): "System.in(bets));
        System.in(red);
//	if(Argument){ /*Do stuff*/};


        System.out.println("Enter in your bet amount: ");
        System.in(35);
        System.out.println(" The ball landed on .");
        if (state.col == true && state.num == true) {
            System.out.println("Congratulations, you've won.");
    else if {
                System.out.println("Sorry, you've lost this bet.");
            }
        }

    /*
        // You currently have: $-35.0
        System.out.println("You currently have: $"money(-35.0));
        System.out.println("Would you like to play again (true|false)?");
        System.in(true);
    */

/*
Enter the type of bet you would like to place (red|black|even|odd|high|low): low
Enter in your bet amount: 40
The ball landed on 17 black.
Congratulations, you've won.
You currently have: $45.0
Would you like to play again (true|false)? true
Enter the type of bet you would like to place (red|black|even|odd|high|low): even
Enter in your bet amount: 100
The ball landed on 29 black.
Sorry, you've lost this bet.
You currently have: $-55.0
Would you like to play again (true|false)? false
*/
    }

        System.out.println("Thank you for playing!")
        System.out.println("This is how much money you have remaining: $" + money(-55.00))
        System.out.println("You've won " + gameswon + " game(s) and lost " + gameslost + " game(s).")
    }

    }
}