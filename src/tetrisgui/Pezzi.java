package tetrisgui;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author samus & crist
 */
public class Pezzi extends JPanel {

    JPanel clonePnlGame;

    public Pezzi(JPanel p) {
        this.clonePnlGame = p; //copio il riferimento del pannello pnlGame di GUITetris in questa classe
    }

    public JPanel generatePiece(int nRandom) {
        switch (nRandom) {
            case 1:  //pezzo O
                clonePnlGame = new JPanel() {
                    public void paintComponent(Graphics g) {
                        Graphics2D g2d = (Graphics2D) g;
                        super.paint(g2d);
                        g2d.setColor(Color.red);
                        g2d.fillRect(10, 10, 40, 40);
                    }
                };
                clonePnlGame.setVisible(true);
                clonePnlGame.setSize(600, 400);


                break;

            case 2: //pezzo I
                clonePnlGame = new JPanel() {
                    public void paintComponent(Graphics g) {
                        Graphics2D g2d = (Graphics2D) g;
                        super.paint(g2d);
                        g2d.setColor(Color.blue);
                        g2d.fillRect(10, 10, 160, 40);
                    }
                };
                clonePnlGame.setVisible(true);
                clonePnlGame.setSize(600, 400);
            break;
        }

        return clonePnlGame;
    }

}
