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
    int y2;
    int i = 0;
    
    public Movement(GUITetris g, Pezzi p) {
        this.f = g;
        this.pezzo = p;
        y2 = pezzo.getHeight();
    }

    public void run() {
            while(true){
                System.out.println("time: " + i);
                movePiece();

                if(Pezzi.y >= 500){
                    Pezzi.y = 0;
                    f.pnlGame.add(new Pezzi());
                    pezzo.setPezzo((int)(Math.random() * 7) + 1);
                }
                
                try{
                    Thread.sleep(1000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                i++;
            }
    }
    
    public void movePiece(){
        while (Pezzi.y < 500) {
            Pezzi.y+=30; //muovo il pezzo di 30px
            pezzo.repaint();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
