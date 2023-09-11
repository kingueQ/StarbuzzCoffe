/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package starbuzzcoffee;

/**
 * Clase que funciona como el condimento chocolate
 * @author Abraham Quintana
 */
public class Chocolate extends Condimento{

    /**
     * Metodo que obtiene la descripcion del condimento
     * @return La descripcion del condimento
     */
    @Override
    public String getDescripcion() {
        return "Chocolate negro liquido";
    }

    /**
     * Metodo que obtiene el costo del condimento
     * @return El costo del condimento
     */
    @Override
    public double getCosto() {
        return 12.5;
    }
    
}
