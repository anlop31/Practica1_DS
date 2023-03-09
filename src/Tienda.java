/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.ArrayList;

/**
 *
 * @author ana
 */
public class Tienda extends Thread {
    public ArrayList<Mesa> mesas;
    
    @Override
    public void run(){
        long inicio = System.currentTimeMillis();
        
        while(System.currentTimeMillis() - inicio < 60000)
            System.out.println(System.currentTimeMillis() - inicio);
    }
    
    public ArrayList<Mesa> getMesas(){
        return mesas;
    }
}
