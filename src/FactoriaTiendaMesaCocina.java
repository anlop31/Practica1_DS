/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ana
 */
public class FactoriaTiendaMesaCocina extends FactoriaMuebles {
    public FactoriaTiendaMesaCocina(){}
    
    @Override public Mesa crearMesa(){
        Mesa mesaCocina = new MesaCocina();
        
        return mesaCocina;
    }
    
    @Override public Tienda crearTienda(){
        Tienda tiendaCocina = new TiendaCocina();
        
        return tiendaCocina;
    }
    
}
