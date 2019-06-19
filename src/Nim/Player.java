/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nim;

import java.util.Random;

/**
 *
 * @author Alec Terwilliger
 */
public class Player {
    
    private String name;
    private boolean isComputerControlled;
    private int idealMoveProbabilty;
    private Random rand = new Random();
    
    public Player(String name)
    {
        this.name = name;
    }
    public Player(String name, int idealMoveProbabiity)
    {
        this.name = name;
        this.idealMoveProbabilty = idealMoveProbabiity;
        isComputerControlled = true;
    }
    
    public String getName()
    {
        return name;
    }
    public boolean isComputerControlled()
    {
        return isComputerControlled;
    }
    
    public int takeTurn(int pileSize)
    {
        int random1 = rand.nextInt(100 - 0 +1) + 0;
        int marblesTaken;
        if(random1 <= idealMoveProbabilty)
        {
            if(pileSize <= 3)
            {
                return pileSize;
            }
            marblesTaken = pileSize % 4;
            if(marblesTaken == 0)
            {
                marblesTaken = rand.nextInt(3 - 1 + 1) + 1;
            }  
            return marblesTaken;
        }
        else
        {
            marblesTaken = rand.nextInt(Math.min(3, pileSize)) + 1;
            return marblesTaken; 
        }
    }
   
            
}
