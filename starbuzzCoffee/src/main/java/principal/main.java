/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import starbuzzcoffee.Chocolate;
import starbuzzcoffee.Condimento;
import starbuzzcoffee.CremaBatida;
import starbuzzcoffee.Descafeinado;
import starbuzzcoffee.Expresso;
import starbuzzcoffee.Leche;
import starbuzzcoffee.MezclaDeLaCasa;
import starbuzzcoffee.Soya;
import starbuzzcoffee.TostadoOscuro;

/**
 * Clase principal del programa
 * @author Abraham Quintana
 */
public class main {

    /**
     * @param args Los argumentos de la linea de comandos
     */
    public static void main(String[] args) {
        Condimento leche=new Leche();
        Condimento cremaBatida=new CremaBatida();
        Condimento soya=new Soya();
        Condimento chocolate=new Chocolate();
        
        Descafeinado descafeinado=new Descafeinado();
        Expresso expresso=new Expresso();
        MezclaDeLaCasa mezcla=new MezclaDeLaCasa();
        TostadoOscuro tostadoOscuro=new TostadoOscuro();
        
        System.out.println("Precios normales de las bebidas");
        System.out.println("Descafeinado: " + descafeinado.getCosto());
        System.out.println("Expresso: " + expresso.getCosto());
        System.out.println("Mezcla de la casa: " + mezcla.getCosto());
        System.out.println("Tostado Oscuro: " + tostadoOscuro.getCosto());
        
        System.out.println("Precios normales de los condimentos");
        System.out.println("Leche: " + leche.getCosto());
        System.out.println("Crema Batida: " + cremaBatida.getCosto());
        System.out.println("Soya: " + soya.getCosto());
        System.out.println("Chocolate: " + chocolate.getCosto());
        descafeinado.agregaCondimento(leche);
        expresso.agregaCondimento(cremaBatida);
        expresso.agregaCondimento(chocolate);
        tostadoOscuro.agregaCondimento(soya);
        
        System.out.println("Precios finales de las bebidas");
        System.out.println("Descafeinado con leche: " + descafeinado.getCosto());
        System.out.println("Expresso con crema batida y chocolate: " + expresso.getCosto());
        System.out.println("Mezcla de la casa: " + mezcla.getCosto());
        System.out.println("Tostado Oscuro con soya: " + tostadoOscuro.getCosto());
    }
    
}
