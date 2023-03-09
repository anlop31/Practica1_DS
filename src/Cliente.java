/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ana
 */
public class Cliente {
    private FactoriaMuebles factoria = new FactoriaTiendaMesaCocina();
    
    public void venderMesas(int nMesas/*, tipo*/){
        
    }

    public static void main(String[] args) {

        //MAIN DE PRUEBA PARA COMPROBAR LOS HILOS Y EL FUNCIONAMIENTO DE TIENDA Y MESA
        int N = 10;
        TiendaCocina tc = new TiendaCocina(N);
        TiendaOficina to = new TiendaOficina(N);
        
        //En vez de llamar directamente a run() hay que llamar a start(), que llama a run()
        tc.start();
        to.start();

       

    }
}




