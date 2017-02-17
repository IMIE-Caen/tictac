package javaapplication6;


import static java.lang.Thread.sleep;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author clement
 */
public class MonThreadTicTac extends Thread {

            @Override
            public void run(){
                while(true){
                    try {
                        sleep(3000);
                    } catch (InterruptedException ex) {}
                    System.out.println("Tac");
                }
            }
            
        
}
