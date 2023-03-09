/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author ana
 */
public class main {
    public static void main(String [] args){
        FactoriaMuebles factoria = new FactoriaTiendaMesaCocina();
        
        Mesa mesacocina1 = factoria.crearMesa();
        mesacocina1.start();
        
    }
}
