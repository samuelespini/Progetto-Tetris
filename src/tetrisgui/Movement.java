package tetrisgui;

import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;
import javax.swing.*;

/**
 *
 * @author samus & crist
 */
public class Movement extends Thread {

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
        while (true) {
            System.out.println("time: " + i);

            //modificare metodo checkLastRow con checkMoveNumbers
            
            if(checkLastRow() == false){
                GUITetris.flag = 1;
                addPiece();
                f.pnlGame.add(new Pezzi(table));
            }
            else if(checkLastRow()){
                moveNumbers();
                movePiece();
            }
                

            try {
                Thread.sleep(MOVEMENT_SPEED);
            } catch (Exception e) {
                e.printStackTrace();
            }

            i++;
        }
    }

    public boolean checkMoveNumbers() { //controlla se al di sotto del pezzo disegnato nella matrice sia possibile spostare il numero
        for (int i = TabellaGioco.ROWS - 1; i > 0; i--) {
            for (int j = TabellaGioco.COLS - 1; j > 0; j--) {
                if (table.tabMat[i][j] == f.nRandom && i + 1 < TabellaGioco.ROWS && table.tabMat[i + 1][j] != 1) {
                    continue;
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    public void moveNumbers() {  //se al di sotto della matrice vi è spazio (cioè numeri 0), il pezzo viene spostato
        int[] lastRow = Arrays.copyOf(table.tabMat[table.tabMat.length - 1], table.tabMat[table.tabMat.length - 1].length);
        for (int i = table.tabMat.length - 1; i > 0; i--) {
            for (int j = 0; j < table.tabMat[i].length; j++) {  //assegna i valori della riga precedente a quelli di quella corrente
                table.tabMat[i][j] = table.tabMat[i - 1][j];
            }
        }
        table.tabMat[0] = lastRow; //imposto la prima riga degli array con l'ultima
    }

    /*public void movePiece() {  //muove pezzo in panello tramite graphics
        GUITetris.flag = 1;
        pezzo.repaint();
    }*/
    
    
    public boolean checkLastRow(){
        int cont = 0;
        for (int col = 0; col < TabellaGioco.COLS; col++) {
            if(table.tabMat[14][col] != 0){ //controllo gli 0 nell'ultima riga
                cont++;
            }
        }
        
        
        
//        if(cont == 10) //ultima riga della matrice è sporca almeno di un numero
//            return false; 
//        
//        else if(cont > 0) //ultima riga completa
//            return true;
//            //aggiungere spostamento completo della matrice verso il basso
//        
        return true;
    }
    
    public void movePiece(){
        GUITetris.flag = 1;
        pezzo.repaint();
    }
    
    public void addPiece(){
        table.fillTablePieces(pezzo.generateRandom());
    }
}
