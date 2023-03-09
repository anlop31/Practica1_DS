/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ana
 */
public class MesaOficina extends Mesa {

    private String color;

    public MesaOficina(int ID, String color){
        super(ID);
        this.color = color;
    }

    public String getColor(){
        return this.color;
    }

    @Override
    public void run(){
        //PARA PROBAR QUE TODO VA BIEN
        System.out.println("El ID es " + getID() + "OFICINA");
    }


    //getID() y run() no se implementan porque
    //son las de la clase padre
    
}
