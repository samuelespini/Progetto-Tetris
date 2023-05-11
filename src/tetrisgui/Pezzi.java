package tetrisgui;

import java.awt.*;  
import java.awt.event.*;
import java.util.*;
import javax.swing.*;  

/**
 *
 * @author cristiano.catemario
 */
public class Pezzi extends JPanel implements ActionListener{
    Graphics2D g2d;
    ArrayList<Graphics2D> listaPezzi = new ArrayList<Graphics2D>();

    private int pezzo = 0;
    
    javax.swing.Timer timer;
    int xVelocity = 1;
    int yVelocity = 1;
    int x = 0;
    int y = 0;
    
    
    public Pezzi(){
        this.setSize(400, 600);
        this.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        timer = new javax.swing.Timer(100, null);
        timer.start();
    }   
    
    public void setPezzo(int pezzo) {
        this.pezzo = pezzo;
    }
    
    
    public void disegna(){
         switch (pezzo) {
            case 1:  //pezzo O
                super.paint(g2d);
                g2d.setColor(Color.red);
                g2d.fillRect(0, 0, 40, 40);
                listaPezzi.add(g2d);
            break;

            case 2: //pezzo I
                super.paint(g2d);
                g2d.setColor(Color.green);
                g2d.fillRect(0, 0, 160, 40);
                listaPezzi.add(g2d);
            break;
            
            case 3: //pezzo L
                super.paint(g2d);
                g2d.setColor(Color.orange);
                g2d.fillRect(0, 0, 40, 120);
                g2d.fillRect(40, 80, 40, 40);
                listaPezzi.add(g2d);
            break;
            
            case 4: //pezzo J
                super.paint(g2d);
                g2d.setColor(Color.pink);
                g2d.fillRect(40, 0, 40, 120);
                g2d.fillRect(0, 80, 40, 40);
                listaPezzi.add(g2d);
            break;
            
            case 5: //pezzo T
                super.paint(g2d);
                g2d.setColor(Color.MAGENTA);
                g2d.fillRect(0, 0, 120, 40);
                g2d.fillRect(40, 40, 40, 40);
                listaPezzi.add(g2d);
            break;
            
            case 6: //pezzo S
                super.paint(g2d);
                g2d.setColor(Color.yellow);
                g2d.fillRect(0, 40, 80, 40);
                g2d.fillRect(40, 0, 80, 40);
                listaPezzi.add(g2d);
            break;
            
            case 7://pezzo S
                super.paint(g2d);
                g2d.setColor(Color.black);
                g2d.fillRect(0, 0, 80, 40);
                g2d.fillRect(40, 40, 80, 40);
                listaPezzi.add(g2d);
            break;
        }
    }
    
    public void paint(Graphics g){
        g2d = (Graphics2D)g;
        disegna();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        x = x + xVelocity;
        repaint();
    }
}
