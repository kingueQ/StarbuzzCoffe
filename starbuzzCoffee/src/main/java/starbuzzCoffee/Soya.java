/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package starbuzzcoffee;

/**
 * Clase que hereda de condimento y simula ser soya
 * @author Abraham Quintana
 */
public class Soya extends Condimento{
    /**
     * Metodo que obtiene la descripcion del condimento
     * @return La descripcion del condimento
     */
    @Override
    public String getDescripcion() {
        return "Leche de soya natural";
    }

    /**
     * Metodo que obtiene el costo del condimento
     * @return El costo del condimento
     */
    @Override
    public double getCosto() {
        return 10;
    }
}
