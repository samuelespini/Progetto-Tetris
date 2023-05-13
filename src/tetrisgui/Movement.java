package tetrisgui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author samus & crist
 */
public class Movement extends Thread{

    GUITetris f;
    Pezzi pezzo;
    
    public Movement(GUITetris g, Pezzi p) {
        this.f = g;
        this.pezzo = p;
        Pezzi.y = pezzo.getHeight();
    }

    public void run() {
        int i = 0;
            while(true){
                System.out.println("time: " + i);
                movePiece();
                try{
                    Thread.sleep(1000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                i++;
        }
    }
    
    public void movePiece(){
        while (Pezzi.y < pezzo.getHeight() - 10) {
            Pezzi.y+=30; //muovo il pezzo di 30px
            pezzo.repaint();
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
