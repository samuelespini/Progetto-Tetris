package tetrisgui;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author samus
 */
public class pnlGame extends JPanel{

    public pnlGame() {
        setSize(400, 600);
    }
    //creazione quadrato
    @Override
    public void paint(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        g.setColor(Color.red);
        g.fillRect(180, 0, 40, 40);
    }
    
    
}
