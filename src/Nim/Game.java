/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nim;

import java.awt.Graphics;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Alec Terwilliger
 */
public class Game {

    
    private Player currentPlayer, player1, player2;   
    private boolean gameOver;
    private Random rand = new Random();
    private Scanner scan = new Scanner(System.in);
    private Pile pile1; 
    
    public Game(Player player1, Player player2, int marbles)
    {
        this.player1 = player1;
        this.player2 = player2;
        pile1 = new Pile(marbles);
    }
    
    public Player getCurrentPlayer()
    {        
        return currentPlayer;        
    }
    public int getMarblesRemaining()
    {
        return pile1.getSize();
    }
    
    public boolean isGameOver()
    {
        gameOver = (pile1.getSize() <= 0);
        return gameOver;
    }
  
    
    public boolean removeFromPile(int amount)
    {
        if((amount < 1 || amount > 3) || (amount > pile1.getSize()))
        {
            return false;
        }
        else
        {
            pile1.remove(amount);
            return true;
        }
    }
    
    public void nextPlayer() 
    {
        if (currentPlayer == player1) 
        {
            currentPlayer = player2;
        } 
        else if (currentPlayer == player2) 
        {
            currentPlayer = player1;
        } 
        else 
        {
            int choose = rand.nextInt(2 - 1 + 1) + 1;
            if (choose == 1) 
            {
                currentPlayer = player1;
            } else 
            {
                currentPlayer = player2;
            }

        }

    }
    
    public void displayPile(Graphics g, int x, int y)
    {
        pile1.drawPile(g, x, y);
    }
    
    public void displayPile()
    {
        pile1.printPile();
    }
           
    
    
}
