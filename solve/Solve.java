/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package solve;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author hp
 */
public class Solve extends JFrame{
    Solve(){
    setSize(1000,1000);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
    MyPanel panel=new MyPanel();
    panel.setBackground(Color.BLUE);
    add(panel);
}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new Solve().setVisible(true);
    }
    
}
