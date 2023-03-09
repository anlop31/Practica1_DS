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
    
    @Override public Mesa crearMesa(){
        Mesa mesaOficina = new MesaOficina();
        
        return mesaOficina;
    }
    
    @Override public Tienda crearTienda(){
        Tienda tiendaOficina = new TiendaOficina();
        
        return tiendaOficina;
    }
    
}
