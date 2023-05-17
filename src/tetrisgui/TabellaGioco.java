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
    
    static final int ROWS = 15;
    static final int COLS = 10;
    int sizeCell;
    
    //griglia tabella
    int tabMat[][] = new int[15][10];
    
    //pezzi nella matrice
    /*int pezzoO[][] = new int[15][10];
    int pezzoL[][] = new int[15][10];
    int pezzoS[][] = new int[15][10];
    int pezzoZ[][] = new int[15][10];
    int pezzoI[][] = new int[15][10];
    int pezzoT[][] = new int[15][10];
    int pezzoJ[][] = new int[15][10];*/
    
    public TabellaGioco(JPanel pnlTable, GUITetris frame) {
        this.f = frame;
          
        sizeCell = 40;
        
        this.setVisible(false);
        this.setSize(400, 600);
        this.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        pnlTable.setVisible(true);
        fillTable(); //riempie la matrice di zeri
    }

    public void printTable(){
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(tabMat[i][j] + " ");
            }
            System.out.println();
        }
    }   
    
    public void fillTablePieces(int nPezzo){        
        switch (nPezzo) {
            case 1:  //pezzo O
                tabMat[0][4] = 2;
                tabMat[0][5] = 2;
                tabMat[1][4] = 2;
                tabMat[1][5] = 2;
            break;

            case 2: //pezzo I
                tabMat[0][4] = 2;
                tabMat[0][5] = 2;
                tabMat[0][6] = 2;
                tabMat[0][7] = 2;
            break;
            
            case 3: //pezzo L
                tabMat[0][4] = 2;
                tabMat[1][4] = 2;
                tabMat[2][4] = 2;
                tabMat[2][5] = 2;
            break;
            
            case 4: //pezzo J
                tabMat[0][5] = 2;
                tabMat[1][5] = 2;
                tabMat[2][5] = 2;
                tabMat[2][4] = 2;
            break;
            
            case 5: //pezzo T
                tabMat[0][3] = 2;
                tabMat[0][4] = 2;
                tabMat[0][5] = 2;
                tabMat[1][4] = 2;
            break;
            
            case 6: //pezzo S
                tabMat[0][5] = 2;
                tabMat[0][4] = 2;
                tabMat[1][4] = 2;
                tabMat[1][3] = 2;
            break;
            
            case 7://pezzo Z
                tabMat[0][4] = 2;
                tabMat[0][5] = 2;
                tabMat[1][5] = 2;
                tabMat[1][6] = 2;
            break;
        }
    }
    
    public void fillTable(){
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 10; j++) {
                tabMat[i][j] = 0;
            }
        }
    }
    
    
    @Override
    public void paint(Graphics g){
        super.paint(g);
        
        for (int x = 0; x < ROWS; x++) {
            for (int y = 0; y < COLS; y++) {
                g.drawRect(x * sizeCell, y * sizeCell, sizeCell, sizeCell);
            }
        }
    }
}
