
package com.erik.conversor_de_moneda;

import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Erik Jose
 */
public class Conversor_De_Moneda {
    private JLabel resultado;
    private  ArrayList<Double> divisas = new ArrayList<Double>();
    private JTextField area;
    private Double dolar = 0.054;
    private Double euro = 0.051;
    private Double libra = 0.045;
    private Double yen = 7.33;
    private Double won = 70.63;
    
    private Double pDolar = 18.38;
    private Double pEuro = 19.46;
    private Double pLibra = 22.08;
    private Double pYen = 0.14;
    private Double pWon = 0.014;
    
public Conversor_De_Moneda(JLabel resultado,JTextField area){
    this.resultado = resultado;
    this.area = area;
    divisas.add(dolar);
    divisas.add(euro);
    divisas.add(libra);
    divisas.add(yen);
    divisas.add(won);
    
     divisas.add(pDolar);
    divisas.add(pEuro);
    divisas.add(pLibra);
    divisas.add(pYen);
    divisas.add(pWon);
}
public void conversion(int posicion,String cantidad){
    posicion-=1;
    var valor = divisas.get(posicion);
    var cantidadIngresada = Double.valueOf(cantidad);
    var resultadoConversion = valor*cantidadIngresada;
    area.setText(""+resultadoConversion);
    resultado.setText(""+resultadoConversion);
}
    
}
