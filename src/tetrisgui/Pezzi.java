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

    int x = 0;
    static int y = 0;

    public Pezzi(TabellaGioco t) {
        this.setSize(400, 600);
        this.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        this.table = t;
    }

    public void setPezzo(int pezzo) {
        this.Npezzo = pezzo;
    }

    public void disegna() {
        switch (Npezzo) {
            case 1:  //pezzo O
                System.out.println("pezzo numero " + Npezzo);
                super.paint(g2d);
                g2d.setColor(Color.red);
                g2d.fillRect(200, y, 40, 40);
                table.fillTablePieces(Npezzo);
                table.printTable();
            break;

            case 2: //pezzo I
                System.out.println("pezzo numero " + Npezzo);
                super.paint(g2d);
                g2d.setColor(Color.green);
                g2d.fillRect(200, y, 160, 40);
                table.fillTablePieces(Npezzo);
                table.printTable();
            break;

            case 3: //pezzo L
                System.out.println("pezzo numero " + Npezzo);
                super.paint(g2d);
                g2d.setColor(Color.orange);
                g2d.fillRect(200, y, 40, 120);
                g2d.fillRect(240, y + 80, 40, 40);
                table.fillTablePieces(Npezzo);
                table.printTable();
            break;

            case 4: //pezzo J
                System.out.println("pezzo numero " + Npezzo);
                super.paint(g2d);
                g2d.setColor(Color.pink);
                g2d.fillRect(240, y, 40, 120);
                g2d.fillRect(200, y + 80, 40, 40);
                table.fillTablePieces(Npezzo);
                table.printTable();
            break;

            case 5: //pezzo T
                System.out.println("pezzo numero " + Npezzo);
                super.paint(g2d);
                g2d.setColor(Color.MAGENTA);
                g2d.fillRect(200, y, 120, 40);
                g2d.fillRect(240, y + 40, 40, 40);
                table.fillTablePieces(Npezzo);
                table.printTable();
            break;

            case 6: //pezzo S
                System.out.println("pezzo numero " + Npezzo);
                super.paint(g2d);
                g2d.setColor(Color.yellow);
                g2d.fillRect(200, y + 40, 80, 40);
                g2d.fillRect(240, y, 80, 40);
                table.fillTablePieces(Npezzo);
                table.printTable();
            break;

            case 7://pezzo S
                super.paint(g2d);
                g2d.setColor(Color.black);
                g2d.fillRect(200, y, 80, 40);
                g2d.fillRect(240, y + 40, 80, 40);
                table.fillTablePieces(Npezzo);
                table.printTable();
            break;
        }
    }
    
    @Override
    public void paint(Graphics g) {
        g2d = (Graphics2D) g;
        disegna();
    }

}
