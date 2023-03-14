/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ana
 */

public class TiendaOficina extends Tienda{
    
    public TiendaOficina(int N){
        super(N);
        for (int i = 0; i < N; i ++){
            MesaOficina mesa = new MesaOficina(i);
            mesa.setColor("azul");
            mesas.add(mesa);
        }
        
        tipo = "oficina";
    }
}
