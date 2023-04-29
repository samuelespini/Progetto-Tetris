package tetrisgui;

import java.awt.*;

/**
 *
 * @author samus
 */
public class Pezzi {

    
    Point[] o = new Point[]{
        new Point(0, 0),
        new Point(0, 1),
        new Point(1, 0),
        new Point(1, 1),
    };

    
    Point[] i = new Point[] {
        new Point(),
        new Point(),
        new Point(),
        new Point(),
    
    }
    
    int s[][] = {{0, 3, 3},
                {3, 3, 0}};
    
    int z[][] = {{4, 4, 0},
                {0, 4, 4}};

    int l[][] = {{5, 0},
                {5, 0},
                {5, 5}};

    int j[][] = {{0, 6},
                {0, 6},
                {6, 6}};

    int t[][] = {{7, 7, 7},
                {0, 7, 0}};

    
}
