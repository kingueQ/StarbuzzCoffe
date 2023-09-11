/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package starbuzzcoffee;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que contiene los metodos de uso comun para las bebidas y la clase condimento
 * @author Abraham Quintana
 */
public abstract class Bebida {
    protected String descripcion;
    protected double costo;
    protected List<Condimento> condimentos;
    /**
     * Constructor por omisión
     */
    public Bebida() {
        this.condimentos=new ArrayList<>();
    }
    /**
     * Constructor que inicializa todos los atributos
     * @param descripcion Descripcion del producto
     * @param costo Costo del producto
     */
    public Bebida(String descripcion, double costo) {
        this.descripcion = descripcion;
        this.costo = costo;
        condimentos=new ArrayList<>();
    }
    /**
     * Método que regresa la descripcion del producto
     * @return La descripcion del producto
     */
    public abstract String getDescripcion();
    /**
     * Método que le asigna un valor a la descripcion del producto
     * @param descripcion Descripcion del producto
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    /**
     * Metodo que obtiene el costo del producto
     * @return El costo del producto
     */
    public abstract double getCosto();
    /**
     * Metodo que le asigna un valor al costo
     * @param costo 
     */
    public void setCosto(double costo) {
        this.costo = costo;
    }
}
