/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author ana
 */
public class main {
    public static void main(String [] args){ // main de prueba
        FactoriaMuebles factoriaCocina = new FactoriaTiendaMesaCocina();
        FactoriaMuebles factoriaOficina = new FactoriaTiendaMesaOficina();
    
        Cliente cliente = new Cliente();
    
        int N = 10; // número de mesas de cada tienda
        int venta_cocina = N * 2/10;
        int venta_oficina = N * 3/10;
        
        // Creamos las tiendas
        Tienda tc = factoriaCocina.crearTienda(N);
        Tienda to = factoriaOficina.crearTienda(N);
        
        //En vez de llamar directamente a run() hay que llamar a start(), que llama a run()
        tc.start();
        to.start();
    
        cliente.comprarMesas(venta_cocina, tc); // 2 mesas de la tienda de cocina
        cliente.comprarMesas(venta_oficina, to); // 3 mesas de la tienda de oficina

    }
}
