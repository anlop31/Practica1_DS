/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ana
 */
public class FactoriaTiendaMesaOficina extends FactoriaMuebles {
    public FactoriaTiendaMesaOficina(){}
    
    @Override public Mesa crearMesa(int ID){
        Mesa mesaOficina = new MesaOficina(ID);
        
        return mesaOficina;
    }
    
    @Override public Tienda crearTienda(int N){
        Tienda tiendaOficina = new TiendaOficina(N); // N mesas
        
        return tiendaOficina;
    }
    
}
