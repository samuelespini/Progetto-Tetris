package tetrisgui;

import java.awt.*;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Set;
import javax.swing.*;
    
/**
 *
 * @author samus & crist
 */
public class TabellaGioco extends JPanel{
    GUITetris f;
    
    int gridRows;
    int gridCol;
    int sizeCell;
    
    int tabMat[][] = new int[15][10];
    
    public TabellaGioco(JPanel pnlTable, GUITetris frame) {
        this.f = frame;
       
        gridRows=this.f.pnlGame.getWidth() / 15;     //prendo la dimensione dell'altezza
                                                //per determinare il numero di righe del tabellone
        gridCol=this.f.pnlGame.getWidth() / 10;      //prendo la dimensione della larghezza
                                                //per determinare il numero di colonne
        sizeCell = 40;
        
        this.setVisible(true);
        this.setSize(400, 600);
        this.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        pnlTable.setVisible(false);
        fillTable();
    }

    public int getGridRows() {
        return gridRows;
    }

    public void setGridRows(int gridRows) {
        this.gridRows = gridRows;
    }

    public int getGridCol() {
        return gridCol;
    }

    public void setGridCol(int gridCol) {
        this.gridCol = gridCol;
    }
    
    public void fillTable(){
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(tabMat[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    @Override
    public void paint(Graphics g){
        super.paint(g);
        
        for (int x = 0; x < gridRows; x++) {
            for (int y = 0; y < gridCol; y++) {
                g.drawRect(x * sizeCell, y * sizeCell, sizeCell, sizeCell);
            }
        }
    }
    
    //fare griglia per pezzi
    //usare matrice per fare pezzi
    //copiare quello in class Pezzi in class TabellaGioco
    
}
