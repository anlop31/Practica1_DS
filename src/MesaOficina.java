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

    public MesaOficina(int ID){ // antes (int ID, string color
        super(ID);
        tipo = "oficina";
    }

    public String getColor(){
        return this.color;
    }
    
    public void setColor(String color){
        this.color = color;
    }

    
}
