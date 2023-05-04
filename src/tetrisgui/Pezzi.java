package tetrisgui;

import java.awt.*;
import javax.swing.*;
import java.util.*;
/**
 *
 * @author samus & crist 
*/
public class Pezzi extends JPanel{
    
    GUITetris frame;
    
    //pezzi del tetris !!da modificare in quanto vanno fatti con il paintComponents
//    Point[] o = { new Point(0, 0), new Point(0, 1), new Point(1, 0), new Point(1, 1)};
//
//    Point[] i = { new Point(0, 0), new Point(0, 4), new Point(1, 0), new Point(1, 4)};
//
//    Point[] s = {new Point(1, 0), new Point(1,1), new Point (0,1), new Point(0,2), new Point(3,0), new Point(3,1), new Point(2,1), new Point(2,2)};
//
//    Point[] l = {new Point(0,0), new Point(3, 0), new Point(1,1), new Point(2,1), new Point(2,2), new Point(2, 3)};

    public Pezzi(GUITetris f) {
        this.frame = f; //copio il pannello
    }
    
    public void paint(Graphics g){
        Graphics2D g2D = (Graphics2D) g;
        g2D.setColor(Color.red);
        g2D.fillRect(10, 10, 20, 20);
    }   
}
