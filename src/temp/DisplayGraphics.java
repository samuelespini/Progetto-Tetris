package temp;

import java.awt.*;  
import javax.swing.JFrame;  
import javax.swing.JPanel;

/**
 *
 * @author cristiano.catemario
 */
public class DisplayGraphics extends JPanel{
    Graphics2D g2d;
    private int pezzo = 0;

    public DisplayGraphics(){
         this.setSize(400, 600);
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
        g2d.fillRect(10, 10, 20, 20);
    }
}
