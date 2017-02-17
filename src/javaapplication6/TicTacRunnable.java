/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

import static java.lang.Thread.sleep;

/**
 *
 * @author clement
 */
public class TicTacRunnable implements Runnable{

    @Override
    public void run() {
         while(true){
            try {
                Thread.sleep(3000);
            } catch (InterruptedException ex) {}
            System.out.println("Toc");
        }
    }
    
    
}
