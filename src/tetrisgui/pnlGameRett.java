package tetrisgui;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author samus
 */
public class pnlGameRett extends JPanel{

    public pnlGameRett() {
        setSize(400, 600);
    }
    //creazione quadrato
    @Override
    public void paint(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        g.setColor(Color.green);
        g.fillRect(120, 0, 40, 80);
    }
    
    
}
