/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package starbuzzcoffee;

/**
 * Clase que simula ser el condimento crema batida
 * @author Abraham Quintana
 */
public class CremaBatida extends Condimento{

    /**
     * Metodo que obtiene la descripcion del condimento
     * @return La descripcion del condimento
     */
    @Override
    public String getDescripcion() {
        return "Crema Batida de la mas alta calidad";
    }

    /**
     * Metodo que obtiene el costo del condimento
     * @return El costo del condimento
     */
    @Override
    public double getCosto() {
        return 15;
    }
    
}
