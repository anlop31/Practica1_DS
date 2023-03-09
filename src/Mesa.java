/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ana
 */

public abstract class Mesa extends Thread{
    
    private int ID;

    public Mesa(int ID){
        this.ID = ID;
    }

    public int getID(){
        return this.ID;
    }

    @Override
    public void run(){
        //PARA PROBAR QUE TODO VA BIEN
       // System.out.println("El ID es " + getID());
    }

/*     
    public void venderMesa(){
        this.stop(); // ?? se vende esta mesa, se para este thread?
    }
*/
}
