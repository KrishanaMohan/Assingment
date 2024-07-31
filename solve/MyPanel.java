/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solve;
import java.util.*;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import java.util.Random;

public class MyPanel extends JPanel{

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.red);
        
        // Original coordinates for the lines
        int flight1[][]={{20,10},{40,60},{100,100}};
        int flight2[][]={{10,40},{100,80},{150,120}};
        int flight3[][]={{30,10},{140,160},{200,300}};
      
        for(int i=1;i<3;i++){
              g.drawLine(flight1[i-1][0], flight1[i-1][1], flight1[i][0], flight1[i][1]);
              
        }
         for(int i=1;i<3;i++){
            // doLinesIntersect(x1, y1, x2, y2, x3, y3, x4, y4)
            int x=flight2[i][0];
            int y=flight2[i][1];
            if(doLinesIntersect(flight2[i-1][0], flight2[i-1][1], x, y,flight1[0][0], flight1[0][1], flight1[1][0], flight1[1][1])){
                Random rand = new Random();
   
       
           x = rand.nextInt(1000);
           y = rand.nextInt(1000);
            }
            g.drawLine(flight2[i-1][0], flight2[i-1][1], x, y);
           
            
        }
          for(int i=1;i<3;i++){
            // doLinesIntersect(x1, y1, x2, y2, x3, y3, x4, y4)
            int x=flight3[i][0];
            int y=flight3[i][1];
            if(doLinesIntersect(flight3[i-1][0], flight3[i-1][1], x, y,flight1[0][0], flight1[0][1], flight1[1][0], flight1[1][1])){
                Random rand = new Random();
   
       
           x = rand.nextInt(1000);
           y = rand.nextInt(1000);
            }
          
              g.drawLine(flight3[i-1][0], flight3[i-1][1],x,y);
        }

    }
    
    // Function to check if two lines intersect
    private boolean doLinesIntersect(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        // Calculate the direction of the lines
        int d1 = direction(x1, y1, x2, y2, x3, y3);
        int d2 = direction(x1, y1, x2, y2, x4, y4);
        int d3 = direction(x3, y3, x4, y4, x1, y1);
        int d4 = direction(x3, y3, x4, y4, x2, y2);

        // If the directions are different, the lines intersect
        return ((d1 > 0 && d2 < 0) || (d1 < 0 && d2 > 0)) &&
               ((d3 > 0 && d4 < 0) || (d3 < 0 && d4 > 0));
    }
    
    // Helper function to calculate the direction of the turn
    private int direction(int xi, int yi, int xj, int yj, int xk, int yk) {
        return (xk - xi) * (yj - yi) - (xj - xi) * (yk - yi);
    }
}
