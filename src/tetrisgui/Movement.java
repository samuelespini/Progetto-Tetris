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
    
    int MOVEMENT_SPEED = 1000;
    
    public Movement(GUITetris g, Pezzi p, TabellaGioco t) {
        this.f = g;
        this.pezzo = p;
        this.table = t;
        y2 = pezzo.getHeight();                
    }

    public void run() {
        while(true){
            System.out.println("time: " + i);
            
            moveNumbers();
            movePiece();
            
            /*if(Pezzi.cooYPiece > 500){
                Pezzi.cooYPiece = 0;
                pezzo.setPezzo((int)(Math.random() * 7) + 2);
                f.pnlGame.add(new Pezzi(table));
            }*/

            try{
                Thread.sleep(MOVEMENT_SPEED);
            } catch (Exception e) {
                e.printStackTrace();
            }
            i++;
        }
    }
    
    public void movePiece(){  //muove pezzo in panello tramite graphics
        Pezzi.cooYPiece+=40; //muovo il pezzo di 40px
        pezzo.repaint();
        
        /*  
            ATTENZIONE!!
            Il pezzo si sposta in continuazione e linearmente senza resettare gli 0 perchè al momento
            del repaint cooYPiece e cooXPiece ritornano al valore di i e j iniziale nel metodo paintPiece()
            RISOLVERE!!
        */
    }
    
    public boolean checkMoveNumbers(){ //controlla se al di sotto del pezzo disegnato nella matrice sia possibile spostare il numero
        for (int i = TabellaGioco.ROWS - 1; i > 0 ; i--) {
            for (int j = TabellaGioco.COLS - 1; j > 0; j--) {
                if(table.tabMat[i][j] == f.nRandom && i + 1 < TabellaGioco.ROWS && table.tabMat[i+1][j]!=1)
                    continue;
                else 
                    return false;
            }
        }
        return true;
    }
    
    public void moveNumbers(){  //se al di sotto della matrice vi è spazio (cioè numeri 0), il pezzo viene spostato
        for (int i = TabellaGioco.ROWS-1; i >= 0 ; i--) { //scorro la matrice partendo dal fondo
            for (int j = TabellaGioco.COLS-1; j >= 0; j--) {
                if(table.tabMat[i][j] >= 2 && table.tabMat[i][j] <= 8){ //se cè la parte di pezzo
                    if (i != 14) {
                        table.tabMat[i][j] = 0; 
                        table.tabMat[i+1][j] = f.nRandom;
                        System.out.println("PIECE MOVED");
                    }
                }
            }
        }
    }
}