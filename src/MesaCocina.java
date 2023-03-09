/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ana
 */
public class MesaCocina extends Mesa{

    private double altura;

    public MesaCocina(int ID, double altura){
        super(ID);
        this.altura = altura;
    }

    public double getAltura(){
        return this.altura;
    }

    @Override
    public void run(){
        System.out.println("El ID es " + getID() + "COCINA");
        System.out.println("ID = " + getID() + " antes: " + this.isAlive());
    }

    //getID() y run() no se implementan porque
    //son las de la clase padre
}
