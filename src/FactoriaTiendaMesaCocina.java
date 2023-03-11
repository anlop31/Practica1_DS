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
    
    @Override public Mesa crearMesa(int ID){
        Mesa mesaCocina = new MesaCocina(ID);
        
        return mesaCocina;
    }
    
    @Override public Tienda crearTienda(int N){
        Tienda tiendaCocina = new TiendaCocina(N);
        
        return tiendaCocina;
    }
    
}
