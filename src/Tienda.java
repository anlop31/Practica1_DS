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
    String tipo = "";
    
    public Tienda(int N){
        mesas = new ArrayList<>();
    }

    @Override
    public void run(){
        long inicio = System.currentTimeMillis();
        for (Mesa m: mesas){
            m.start();            
        }
        while(System.currentTimeMillis() - inicio < 30000) { 
            //System.out.println(System.currentTimeMillis() - inicio);
        }

    }
    
    public ArrayList<Mesa> getMesas(){
        return mesas;
    }
    
    public void venderMesas(int nMesas){
        try {
            for (int i = 0; i < nMesas; i++){
                mesas.get(i).interrupt();
                mesas.get(i).join();
                System.out.println("ID = " + i + " de mesa de tipo " + tipo + " después: " + mesas.get(i).isAlive());

            }
        }
        catch (Exception e) {
            System.out.println("Exception handled");
        }
    }
}
