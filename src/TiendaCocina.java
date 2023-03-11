/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ana
 */

public class TiendaCocina extends Tienda{
    
    public TiendaCocina(int N){
        super(N);
        for (int i = 0; i < N; i ++){
            MesaCocina mesa = new MesaCocina(i);
            mesa.setAltura(1.2);
            // mesas.add(new MesaCocina(i, 1.2));
            mesas.add(mesa);
        }
    }
}
