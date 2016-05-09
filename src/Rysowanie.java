/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ratownik;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
 *
 * @author Tomzdon
 */
public class Rysowanie extends JComponent{
    public String tonocy="T";
    public String ratownik="R";
    public int ratownik_x;
    public int ratownik_y;
    public int tonocy_x;
    public int tonocy_y;
    public int X;
    public int Y;
    
    
    public Rysowanie(int rat_x,int rat_y,int ton_x,int ton_y){
       ratownik_x=rat_x;
       ratownik_y=rat_y;
       tonocy_x=ton_x;
       tonocy_y=ton_y;
     
                }
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2d= (Graphics2D)g;
        g2d.setColor(Color.BLUE);
        //g2d.drawRect(0, 0, 400,100);
        g2d.fillRect(0, 0, 400, 100);
        g2d.setColor(Color.yellow);
        g2d.fillRect(0, 100,400, 200);
        g2d.setColor(Color.BLACK);
        g2d.drawString("X", X,Y);
        g2d.drawString(tonocy, tonocy_x, tonocy_y);
        g2d.drawString(ratownik, ratownik_x, ratownik_y);
        g2d.drawLine(tonocy_x, tonocy_y,X , Y);
        g2d.drawLine(ratownik_x, ratownik_y, X, Y);
    }
    
   
    
    
}
