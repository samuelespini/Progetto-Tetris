package tetrisgui;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

/**
 *
 * @author samus & crist
 */
public class Pezzi extends JPanel {

    Graphics2D g2d;
    TabellaGioco table;

    private int Npezzo = 0;
    int i = 0;

    //coordinate pezzo
    static int cooXPiece = 0;
    static int cooYPiece = 0;

    public Pezzi(TabellaGioco t) {
        this.setSize(400, 600);
        this.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        this.table = t;
    }

    public void setPezzo(int pezzo) {
        this.Npezzo = pezzo;
    }

    public void paintPiece() {
        if (GUITetris.flag == 0) { //prima impostazione della matrice
            for (int i = 0; i < TabellaGioco.ROWS; i++) { //scorro la matrice
                for (int j = 0; j < TabellaGioco.COLS; j++) {
                    if (table.tabMat[i][j] != 1 && table.tabMat[i][j] != 0) { //se nella matrice trova un numero 

                        cooXPiece = j;
                        cooYPiece = i;

                        switch (Npezzo) {
                            case 2:  //pezzo O
                                g2d.setColor(Color.RED);
                                g2d.fillRect(cooXPiece * 40, cooYPiece * 40, 40, 40);
                                table.fillTablePieces(Npezzo);
                                table.printTable();
                                break;

                            case 3: //pezzo I
                                g2d.setColor(Color.GREEN);
                                g2d.fillRect(cooXPiece * 40, cooYPiece * 40, 40, 40);
                                table.fillTablePieces(Npezzo);
                                table.printTable();
                                break;

                            case 4: //pezzo L
                                g2d.setColor(Color.ORANGE);
                                g2d.fillRect(cooXPiece * 40, cooYPiece * 40, 40, 40);
                                table.fillTablePieces(Npezzo);
                                table.printTable();
                                break;

                            case 5: //pezzo J
                                g2d.setColor(Color.PINK);
                                g2d.fillRect(cooXPiece * 40, cooYPiece * 40, 40, 40);
                                table.fillTablePieces(Npezzo);
                                table.printTable();
                                break;

                            case 6: //pezzo T
                                g2d.setColor(Color.MAGENTA);
                                g2d.fillRect(cooXPiece * 40, cooYPiece * 40, 40, 40);
                                table.fillTablePieces(Npezzo);
                                table.printTable();
                                break;

                            case 7: //pezzo S
                                g2d.setColor(Color.YELLOW);
                                g2d.fillRect(cooXPiece * 40, cooYPiece * 40, 40, 40);
                                table.fillTablePieces(Npezzo);
                                table.printTable();
                                break;

                            case 8://pezzo Z
                                g2d.setColor(Color.BLUE);
                                g2d.fillRect(cooXPiece * 40, cooYPiece * 40, 40, 40);
                                table.fillTablePieces(Npezzo);
                                table.printTable();
                                break;
                        }
                    } 
                    
                    else if (table.tabMat[i][j] == 1) { //se il pezzo è già caduto viene colorato di grigio
                        g2d.setColor(Color.DARK_GRAY);
                        g2d.fillRect(cooXPiece * 40, cooYPiece * 40, 40, 40);
                        table.fillTablePieces(Npezzo);
                        table.printTable();
                        
                    } 
                    
                    else if (table.tabMat[i][j] == 0) {}
                }
            }
        }

        else if (GUITetris.flag == 1) {
            for (int i = 0; i < TabellaGioco.ROWS; i++) { //scorro la matrice
                for (int j = 0; j < TabellaGioco.COLS; j++) {
                    if (table.tabMat[i][j] != 1 && table.tabMat[i][j] != 0) { //se nella matrice trova un numero 

                        cooXPiece = j;
                        cooYPiece = i;

                        switch (Npezzo) {
                            case 2:  //pezzo O
                                g2d.setColor(Color.RED);
                                g2d.fillRect(cooXPiece * 40, cooYPiece * 40, 40, 40);
                                table.printTable();
                                break;

                            case 3: //pezzo I
                                g2d.setColor(Color.GREEN);
                                g2d.fillRect(cooXPiece * 40, cooYPiece * 40, 40, 40);
                                table.printTable();
                                break;

                            case 4: //pezzo L
                                g2d.setColor(Color.ORANGE);
                                g2d.fillRect(cooXPiece * 40, cooYPiece * 40, 40, 40);
                                table.printTable();
                                break;

                            case 5: //pezzo J
                                g2d.setColor(Color.PINK);
                                g2d.fillRect(cooXPiece * 40, cooYPiece * 40, 40, 40);
                                table.printTable();
                                break;

                            case 6: //pezzo T
                                g2d.setColor(Color.MAGENTA);
                                g2d.fillRect(cooXPiece * 40, cooYPiece * 40, 40, 40);
                                table.printTable();
                                break;

                            case 7: //pezzo S
                                g2d.setColor(Color.YELLOW);
                                g2d.fillRect(cooXPiece * 40, cooYPiece * 40, 40, 40);
                                table.printTable();
                                break;

                            case 8://pezzo Z
                                g2d.setColor(Color.BLUE);
                                g2d.fillRect(cooXPiece * 40, cooYPiece * 40, 40, 40);
                                table.printTable();
                                break;
                        }
                    } else if (table.tabMat[i][j] == 1) { //se il pezzo è già caduto viene colorato di grigio
                        super.paint(g2d);
                        g2d.setColor(Color.DARK_GRAY);
                        g2d.fillRect(cooXPiece * 40, cooYPiece * 40, 40, 40);
                        table.fillTablePieces(Npezzo);
                        table.printTable();
                    } else if (table.tabMat[i][j] == 0) {}
                }
            }
        }
    }

    @Override
    public void paint(Graphics g) {
        g2d = (Graphics2D) g;
        paintPiece();
    }
}
