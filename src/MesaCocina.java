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

    public MesaCocina(int ID){ // antes (int ID, double altura)
        super(ID);
        tipo = "cocina";
    }

    public double getAltura(){
        return this.altura;
    }
    
    public void setAltura(double altura){
        this.altura = altura;
    }

}
