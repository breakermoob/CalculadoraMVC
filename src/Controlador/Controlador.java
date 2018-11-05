/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Modelo;

/**
 *
 * @author bm
 */
public class Controlador {
    
    Modelo m = new Modelo();

    
   public void cambiarDatos(int numero1,int numero2,String signo)
   {         
       m.setNumero1(numero1);
       m.setNumero2(numero2);
       m.setSigno(signo); 
   }
   
   public String calcular()
   {
        String resultado = m.calcular();
        return resultado;
   }
    
    
}
