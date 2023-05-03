package tetrisgui;

import java.awt.*;
import javax.swing.*;
import java.util.*;
/**
 *
 * @author samus & crist 
*/
public class Pezzi extends JFrame{
    
    GUITetris frame;
    
    public Pezzi(GUITetris f) {
        this.frame = f; //copio il pannello
    }
    
    JPanel pezzo_O = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) { //disegno il quadrato rosso
                super.paintComponent(g);
                g.setColor(Color.RED);
                g.fillRect(50, 30, 10, 10);
            }
        };
    
    Point[] o = { new Point(0, 0), new Point(0, 1), new Point(1, 0), new Point(1, 1)};

    Point[] i = { new Point(0, 0), new Point(0, 4), new Point(1, 0), new Point(1, 4)};

    Point[] s = {new Point(1, 0), new Point(1,1), new Point (0,1), new Point(0,2), new Point(3,0), new Point(3,1), new Point(2,1), new Point(2,2)};

    Point[] l = {new Point(0,0), new Point(3, 0), new Point(1,1), new Point(2,1), new Point(2,2), new Point(2, 3)};
    
//    ArrayList<Point> pezzi = new ArrayList<Point>();
    
    
//    int z[][] = {{4, 4, 0},
//    {0, 4, 4}};
//    
//    int j[][] = {{0, 6},
//    {0, 6},
//    {6, 6}};
//
//    int t[][] = {{7, 7, 7},
//    {0, 7, 0}};
   
}
