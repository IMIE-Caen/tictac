/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

import static java.lang.Thread.sleep;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author clement
 */
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        
        System.out.println("GO !");
        
        
        Thread tic = new Thread(){
            @Override
            public void run(){
                while(true){
                    try {
                        sleep(3000);
                    } catch (InterruptedException ex) {}
                    System.out.println("Tic");
                }
            }
            
        };
        Thread tac = new MonThreadTicTac();
        Thread toc = new Thread(new TicTacRunnable());
        tic.start();
        Thread.sleep(1000);
        tac.start();
        Thread.sleep(1000);
        toc.start();
        System.out.println("Vis ma vie");
       
        
    }
    
}
