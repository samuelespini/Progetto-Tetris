package tetrisgui;

import java.awt.*;
import javax.swing.*;


/**
 *
 * @author samus
 */
public class Run extends Thread{
    int i = 0;
    GUITetris f;
    
    public Run(GUITetris gayfrociocomunista) {
        this.f = gayfrociocomunista;
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
