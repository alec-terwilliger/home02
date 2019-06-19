/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nim;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Alec Terwilliger
 */
public class Pile {
    
    private int size;    
    
    public Pile (int initialCount) 
    {
        size = initialCount;
    }

    public int getSize()
    {        
        return size;
    }
    
    public void remove(int size)
    {
        this.size -= size;
    }
    
    public void drawPile(Graphics g, int x, int y)
    {
       for (int i = 0; i < 21; i++)
        {
            g.setColor(Color.RED);
            if(i >= size)
            {
                g.setColor(Color.GRAY);
            }
            g.fillOval(x + 15*(i%10), (int) (y + 15*Math.floor(i/10)), 13, 13);
              
        }    
    }
    
    public void printPile()
    {
        int tempSize = size;
        int numberofRows = (int) Math.ceil(size / 10);
        for (int i = 0; i < numberofRows + 1; i++)
        {
            for(int j = 0; j < 10; j++)
            {                
                if(tempSize == 0)
                {
                    break;
                }
                System.out.print("* ");
                tempSize--;
            }
            System.out.println("");
        } 
    }
}
