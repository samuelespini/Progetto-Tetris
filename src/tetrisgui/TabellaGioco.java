package tetrisgui;

import java.awt.*;
import java.awt.Color;
import java.awt.Graphics;
/**
 *
 * @author samus
 */
public class TabellaGioco extends Canvas{
    GUITetris f;
    
    Graphics pezzo;
    Pezzi p;
    
    int rows;
    int col;
    
    public TabellaGioco(GUITetris f) {
        this.f = f;
        rows=f.pnlGame.getHeight();    //prendo la dimensione dell'altezza
                                    //per determinare il numero di righe del tabellone
        col=f.pnlGame.getWidth();     //prendo la dimensione della larghezza
                                    //per determinare il numero di colonne
        p = new Pezzi(this.f);
    }

    public int getR() {
        return rows;
    }

    public void setR(int r) {
        this.rows = r;
    }

    public int getC() {
        return col;
    }

    public void setC(int c) {
        this.col = c;
    }
    
    public void creaTabellaAstratta(){
        rows /= 15; //creo la tabella dividendo la parte di sinstra per le righe
        col /= 10;  //e la parte alta per il numero di colonne arrivando a fare una tabella di 15x10
    } 
}
