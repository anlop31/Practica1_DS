/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author ana
 */
public class Cliente {
    private FactoriaMuebles factoria = new FactoriaTiendaMesaCocina();
    
    public void venderMesas(int nMesas){ // y el tipo??
        
    }

    public static void main(String[] args) {

    //TiendaCocina tienda = new TiendaCocina(4); // Crear una instancia del hilo que se desea interrumpir
    //Timer timer = new Timer(); // Crear una instancia de Timer

    // Programar una tarea que llame al método interrupt() en el hilo después de 60 segundos
    //timer.schedule(new TimerTask() {
    //    @Override public void run() {
    //        tienda.interrupt(); // Llamar al método interrupt() en el hilo
    //    }
    //}, 6000); // Retrasar la tarea por 60 segundos (60,000 milisegundos)

    // Iniciar el hilo
    //tienda.start();

        
        //MAIN DE PRUEBA PARA COMPROBAR LOS HILOS Y EL FUNCIONAMIENTO DE TIENDA Y MESA
        int N = 10;
        TiendaCocina tc = new TiendaCocina(N);
        TiendaOficina to = new TiendaOficina(N);
        System.out.println("eh");
        //En vez de llamar directamente a run() hay que llamar a start(), que llama a run()
        tc.start();
        to.start();

    }
}




