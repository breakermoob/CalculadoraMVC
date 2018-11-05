/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.text.DecimalFormat;

/**
 *
 * @author bm
 */
public class Modelo {

    double numero1;
    double numero2;
    double resultado;
    String res;
    String signo;

    public void setSigno(String signo) {
        this.signo = signo;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public String getRes() {
        return res;
    }

    public String calcular() {

        switch (signo) {
            case "+":
                resultado = numero1 + numero2;
                break;
            case "-":
                resultado = numero1 - numero2;
                break;
            case "/":
                resultado = numero1 / numero2;
                break;
            case "*":
                resultado = numero1 * numero2;
                break;
        }
        DecimalFormat df;
        df = new DecimalFormat("0.000");
        df.format(resultado);
        res = Double.toString(resultado);
        return res;
    }
}
