/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ana
 */

public abstract class Mesa extends Thread{
    
    String tipo = "";
    private int ID;

    public Mesa(int ID){
        this.ID = ID;
    }

    public int getID(){
        return this.ID;
    }

    @Override
    public void run(){
        System.out.println("El ID es " + getID() + " de tipo: " + tipo);
        System.out.println("ID = " + getID() + " de mesa de tipo " + tipo + " antes: " + this.isAlive());
    }

}
