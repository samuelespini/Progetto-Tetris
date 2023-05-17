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
    TabellaGioco table;
    
    int y2;
    int i = 0;
    
    int MOVEMENT_SPEED = 500;
    
    public Movement(GUITetris g, Pezzi p, TabellaGioco t) {
        this.f = g;
        this.pezzo = p;
        this.table = t;
        y2 = pezzo.getHeight();                
    }

    public void run() {
            while(true){
                System.out.println("time: " + i);
                if(checkMoveNumbers()){
                    movePiece();
                    moveNumbers();
                }
                
                if(Pezzi.y > 500){
                    Pezzi.y = 0;
                    pezzo.setPezzo((int)(Math.random() * 7) + 1);
                    f.pnlGame.add(new Pezzi(table));
                    f.pnlGame.revalidate();
                }

                try{
                    Thread.sleep(500);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                i++;
            }
    }
    
    public void movePiece(){  //muove pezzo in panello tramite graphics
        while (Pezzi.y < 500) {
            Pezzi.y+=30; //muovo il pezzo di 30px
            pezzo.repaint();
            try {
                Thread.sleep(MOVEMENT_SPEED);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        }
    
    public boolean checkMoveNumbers(){ //muove pezzo nella matrice spostando i numeri
        for (int i = TabellaGioco.ROWS - 1; i > 0 ; i--) {
            for (int j = TabellaGioco.COLS -1; j > 0; j--) {
                if(table.tabMat[i][j] == 2 && i+1 < TabellaGioco.ROWS && table.tabMat[i+1][j]!=1)
                    continue;
                else 
                    return false;
            }
        }
        return true;
    }
    
    public void moveNumbers(){
        for (int i = TabellaGioco.ROWS - 1; i > 0 ; i--) {
            for (int j = TabellaGioco.COLS -1; j > 0; j--) {
                if(table.tabMat[i][j] == 2){
                    table.tabMat[i][j] = 0;
                    table.tabMat[i+1][j] = 2;
                }
            }
        }
    }
}