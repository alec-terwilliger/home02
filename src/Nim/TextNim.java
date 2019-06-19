/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nim;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Alec Terwilliger
 */
public class TextNim {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int selection = 0, gameSelection = 0, playerSelection = 0, player2Selection = 0, marbleSelection = 0, marbleAmountSelection = 0, amount = 0;
        Player player1 = new Player("");
        Player player2 = new Player("");
        Random rand = new Random();
        Player computerPlayer1 = new Player("Johnny", 0);
        Player computerPlayer2 = new Player("Matt", 33);
        Player computerPlayer3 = new Player("Alex", 66);
        Player computerPlayer4 = new Player("Adam", 100);
        System.out.println("Would you like to play a game of Nim? \n1) Yes \n2) No");
        System.out.println("");
        while (selection < 1 || selection > 2) // Wrong value
        {
            System.out.println("Enter a value 1 – 2: ");
            while (!scan.hasNextInt()) // Wrong type
            {
                scan.nextLine();          // Flush buffer                 
                System.out.println("Enter a value 1 – 2: ");
            }
            selection = scan.nextInt();     // Safe to read
        }
        while (selection == 1) 
        {
            if (selection == 2) 
            {
                break;
            }

            System.out.println("Please select game type: \n1. Human vs. Human \n2. Human vs. Computer \n3. Computer vs Computer");
            System.out.println("");
            
            while (gameSelection < 1 || gameSelection > 3) // Wrong value
            {                
                System.out.println("Enter a value 1 – 3: ");
                while (!scan.hasNextInt()) // Wrong type
                {
                    scan.nextLine();          // Flush buffer                 
                    System.out.println("Enter a value 1 – 3: ");
                }
                gameSelection = scan.nextInt(); // Safe to read
            }
            if (gameSelection == 1) 
            {                
                System.out.println("Please enter a name for player 1: \n");
                player1 = new Player(scan.next());

                System.out.println("Please enter a name for player 2: \n");
                player2 = new Player(scan.next());
            }
            if (gameSelection == 2) 
            {
                System.out.println("Please enter a name for player 1: ");
                player1 = new Player(scan.next());

                System.out.println("Please choose an AI for player 2: \n1.Johnny \n2.Matt \n3.Alex \n4.Adam");
                while (player2Selection < 1 || player2Selection > 4) // Wrong value
                {
                    System.out.println("Enter a value 1 – 4: ");
                    while (!scan.hasNextInt()) // Wrong type
                    {
                        scan.nextLine();          // Flush buffer                 
                        System.out.println("Enter a value 1 – 4: ");
                    }                    
                    player2Selection = scan.nextInt();     // Safe to read
                }
                if (player2Selection == 1) 
                {
                    player2 = computerPlayer1;
                }
                if (player2Selection == 2) 
                {
                    player2 = computerPlayer2;
                }
                if (player2Selection == 3) 
                {
                    player2 = computerPlayer3;
                }
                if (player2Selection == 4) 
                {
                    player2 = computerPlayer4;
                }                    
            }
            if (gameSelection == 3) 
            {
                System.out.println("Please choose an AI for player 1: \n1.Johnny \n2.Matt \n3.Alex \n4.Adam");
                while (playerSelection < 1 || playerSelection > 4) // Wrong value
                {
                    System.out.println("Enter a value 1 – 4: ");
                    while (!scan.hasNextInt()) // Wrong type
                    {
                        scan.nextLine();          // Flush buffer                 
                        System.out.println("Enter a value 1 – 4: ");
                    }
                    playerSelection = scan.nextInt();     // Safe to read
                }
                System.out.println(gameSelection + " game selected");                        
                if (playerSelection == 1) 
                {
                    player1 = computerPlayer1;
                }
                if (playerSelection == 2) 
                {
                    player1 = computerPlayer2;
                }
                if (playerSelection == 3)
                {
                    player1 = computerPlayer3;
                }
                if (playerSelection == 4)
                {
                    player1 = computerPlayer4;
                }                    
                System.out.println("Please choose an AI for player 2: \n1.Johnny \n2.Matt \n3.Alex \n4.Adam");
                while (player2Selection < 1 || player2Selection > 4) // Wrong value
                {
                    System.out.println("Enter a value 1 – 4: ");
                    while (!scan.hasNextInt()) // Wrong type
                    {   
                        scan.nextLine();          // Flush buffer                 
                        System.out.println("Enter a value 1 – 4: ");
                    }
                    player2Selection = scan.nextInt();     // Safe to read
                }
                if (player2Selection == 1) 
                {
                    player2 = computerPlayer1;
                }
                if (player2Selection == 2) 
                {
                    player2 = computerPlayer2;
                }
                if (player2Selection == 3) 
                {
                    player2 = computerPlayer3;
                }
                if (player2Selection == 4) 
                {
                    player2 = computerPlayer4;
                }                        
            }            
            System.out.println(player2Selection + " player 2 selection.");
            System.out.println("Please choose a number of marbles to play with: \n1. 21 \n2. Random \n3. Custom \n");
            while (marbleAmountSelection < 1 || marbleAmountSelection > 3) 
            {
                System.out.println("Enter a value 1 - 3:  \n");
                while (!scan.hasNextInt()) 
                {
                    scan.nextLine();
                    System.out.println("Not an integer value, try again. 1-3: \n");
                }
                marbleAmountSelection = scan.nextInt();
            }                
            if (marbleAmountSelection == 1) 
            {
                marbleSelection = 21;
            }
            if (marbleAmountSelection == 2) 
            {
                int randomMarbleSize = rand.nextInt(57 - 17 + 1) + 17;
                marbleSelection = randomMarbleSize;
            }
            if (marbleAmountSelection == 3) 
            {
                System.out.println("Select a value between 1 and 100: \n");
                while (marbleSelection < 1 || marbleSelection > 100) // Wrong value
                {
                    System.out.println("Enter a value 1 – 100: ");
                    while (!scan.hasNextInt()) // Wrong type
                    {
                        scan.nextLine();          // Flush buffer                 
                        System.out.println("Enter a value 1 – 100: ");
                    }
                    marbleSelection = scan.nextInt(); // Safe to read
                }
            }           

            Game gameNim = new Game(player1, player2, marbleSelection);
            System.out.println("There are " + marbleSelection + " marbles in the pile.");
            while (!gameNim.isGameOver()) 
            {                
                gameNim.displayPile();
                gameNim.nextPlayer();
                System.out.println("It is " + gameNim.getCurrentPlayer().getName() + "'s turn");
                amount = 0;
                if (gameNim.getCurrentPlayer().isComputerControlled()) 
                {                    
                    amount = gameNim.getCurrentPlayer().takeTurn(gameNim.getMarblesRemaining());
                    gameNim.removeFromPile(amount);                     
                }
                else
                {
                    System.out.println(gameNim.getCurrentPlayer().getName() + " How many marbles would you like to take? 1-" + Math.min(3, gameNim.getMarblesRemaining()) + ": \n");
                    while ((amount < 1 || amount > Math.min(3, gameNim.getMarblesRemaining()))) 
                    {
                        System.out.println("Enter a value 1-" + Math.min(3, gameNim.getMarblesRemaining()) + ": \n");
                        while (!scan.hasNextInt()) 
                        {
                            scan.nextLine();
                            System.out.println("Not an integer value, try again. 1-" + Math.min(3, gameNim.getMarblesRemaining()) + ": \n");
                        }
                            amount = scan.nextInt();
                    }
                    gameNim.removeFromPile(amount);
                }
                marbleSelection -= amount;
                System.out.println(gameNim.getCurrentPlayer().getName() + " took " + amount + " marbles from the pile.");
                System.out.println("There are " + marbleSelection + " marbles in the pile remaining");
            }
            System.out.println(gameNim.getCurrentPlayer().getName() + " is the winner!");
            
            // Play again -> will send to top of loop
            System.out.println("");
            System.out.println("Would you like to play a game of Nim? \n1) Yes \n2) No");
            System.out.println("");
            selection = 0;
            while (selection < 1 || selection > 2) // Wrong value
            {
                System.out.println("Enter a value 1 – 2: ");
                while (!scan.hasNextInt()) // Wrong type
                {
                    scan.nextLine();          // Flush buffer                 
                    System.out.println("Enter a value 1 – 2: ");
                }
                selection = scan.nextInt();     // Safe to read
            } 
            // need to clear all selections
            gameSelection = 0;
            playerSelection = 0;
            player2Selection = 0;
            marbleSelection = 0;
            marbleAmountSelection = 0;
            amount = 0;
        }
        
    }
    
}
