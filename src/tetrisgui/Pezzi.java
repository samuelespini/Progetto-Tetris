package tetrisgui;

import java.awt.*;
import javax.swing.*;
import java.util.*;
/**
 *
 * @author samus & crist 
*/
public class Pezzi extends JPanel{
    
    JPanel clonePnlGame;
        
    public Pezzi(JPanel p) {
        this.clonePnlGame = p; //copio il pannello
    }
    
    public JPanel generatePiece(int nRandom){
        switch (nRandom) {
            case 1:  //pezzo O
              clonePnlGame = new JPanel(){
                public void paintO(Graphics g){
                    Graphics2D g2D = (Graphics2D) g;
                    g2D.setColor(Color.red);
                    g2D.fillRect(10, 10, 20, 20);
                }   
              }; 
            break;
        }
        
        return clonePnlGame;
    }
    
}
