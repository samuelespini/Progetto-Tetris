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
public class TabellaGioco{
    GUITetris f;
    
    static int ROWS = 15;
    static int COLS = 10;
    static int CELL_SIZE = 40;
    
    //griglia tabella
    int tabMat[][] = new int[15][10];
    
    public TabellaGioco(JPanel pnlTable, GUITetris frame) {
        this.f = frame;
        
        pnlTable.setVisible(true);
        fillTable(); //imposto tutta la matrice a 0
    }

    public void printTable(){
        System.out.println("MATRIX: ");
        
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                System.out.print(tabMat[i][j] + " ");
            }
            System.out.println();
        }
    }   
    
    public void fillTablePieces(int nPezzo){
        switch (nPezzo) {
            case 2:  //pezzo O
                tabMat[0][4] = 2;
                tabMat[0][5] = 2;
                tabMat[1][4] = 2;
                tabMat[1][5] = 2;
            break;

            case 3: //pezzo I
                tabMat[0][4] = 3;
                tabMat[0][5] = 3;
                tabMat[0][6] = 3;
                tabMat[0][7] = 3;
            break;
            
            case 4: //pezzo L
                tabMat[0][4] = 4;
                tabMat[1][4] = 4;
                tabMat[2][4] = 4;
                tabMat[2][5] = 4;
            break;
            
            case 5: //pezzo J
                tabMat[0][5] = 5;
                tabMat[1][5] = 5;
                tabMat[2][5] = 5;
                tabMat[2][4] = 5;
            break;
            
            case 6: //pezzo T
                tabMat[0][3] = 6;
                tabMat[0][4] = 6;
                tabMat[0][5] = 6;
                tabMat[1][4] = 6;
            break;
            
            case 7: //pezzo S
                tabMat[0][5] = 7;
                tabMat[0][4] = 7;
                tabMat[1][4] = 7;
                tabMat[1][3] = 7;
            break;
            
            case 8://pezzo Z
                tabMat[0][4] = 8;
                tabMat[0][5] = 8;
                tabMat[1][5] = 8;
                tabMat[1][6] = 8;
            break;
            
            default:
            break;
        }
    }
    
    public void fillTable(){ //riempio matrice con 0
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                tabMat[i][j] = 0;
            }
        }
    }
}
