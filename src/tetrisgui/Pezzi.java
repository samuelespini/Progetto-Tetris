package tetrisgui;

import java.awt.*;  
import javax.swing.JFrame;  
import javax.swing.JPanel;

/**
 *
 * @author cristiano.catemario
 */
public class Pezzi extends JPanel{
    Graphics2D g2d;
    
    private int pezzo = 0;

    public Pezzi(){
         this.setSize(400, 600);
         this.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
    }   
    
    public void setPezzo(int pezzo) {
        this.pezzo = pezzo;
    }
    
    @Override
    public void paint(Graphics g){
        g2d = (Graphics2D)g;
        disegna();
    }
    
    public void disegna(){
         switch (pezzo) {
            case 1:  //pezzo O
                super.paint(g2d);
                g2d.setColor(Color.red);
                g2d.fillRect(10, 10, 40, 40);
                break;

            case 2: //pezzo I
                super.paint(g2d);
                g2d.setColor(Color.blue);
                g2d.fillRect(10, 10, 160, 40);
            break;
        }
    }
}
