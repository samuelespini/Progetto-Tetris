package tetrisgui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author samus
 */
public class Run extends Thread{
    int i = 0;
    GUITetris f;
    Graphics2D objPezzo;
        
    public Run(GUITetris g) {
        this.f = g;
    }
    
    public void run()  
    {
        while(true){
            try  
            {  
                //aggiungere spostamento pezzi ritirando dalla lista di pezzi fatta in 
                //GUITetris il pezzo salavato e cercare metodo per riposizionare il pezzo 
                //costruito cambiandogli x e y
                
                Thread.sleep(2000);  
            }catch(InterruptedException e){System.out.println(e);}    

            System.out.println(i);    
            
            i++;
        }
    }    
}