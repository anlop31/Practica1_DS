/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.ArrayList;

/**
 *
 * @author ana
 */
public abstract class Tienda extends Thread {
    public ArrayList<Mesa> mesas;
    
    public Tienda(int N){
        mesas = new ArrayList<Mesa>();
    }

    @Override
    public void run(){
        long inicio = System.currentTimeMillis();
        
        while(System.currentTimeMillis() - inicio < 60000)
            System.out.println(System.currentTimeMillis() - inicio);

        for (Mesa m: mesas){
            m.run();            
        }
    }
    
    public ArrayList<Mesa> getMesas(){
        return mesas;
    }
}
