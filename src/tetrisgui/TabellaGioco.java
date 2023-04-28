package tetrisgui;

/**
 *
 * @author samus
 */
public class TabellaGioco{
    GUITetris f;
    int rows;
    int col;
    
    public TabellaGioco(GUITetris f) {
        this.f = f;
        rows=f.pnlGame.getHeight();    //prendo la dimensione dell'altezza
                                    //per determinare il numero di righe del tabellone
        col=f.pnlGame.getWidth();     //prendo la dimensione della larghezza
                                    //per determinare il numero di colonne
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
        rows /= 15;
        col /= 10;
    }
}
