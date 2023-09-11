/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package starbuzzcoffee;

/**
 * Clase que hereda de bebida y que simula ser un expresso
 * @author Abraham Quintana
 */
public class Expresso extends Bebida{
    /**
     * Metodo que regresa la descripcion de la bebida
     * @return La descripcion de la bebida
     */
    @Override
    public String getDescripcion() {
        return "Cafe expreso delicioso";
    }
    /**
     * Metodo que calcula y regresa el costo de la bebida
     * @return Costo de la bebida
     */
    @Override
    public double getCosto() {
        costo=30;
        for(int i=0;i<condimentos.size();i++){
            costo=costo+condimentos.get(i).getCosto();
        }
        return costo;
    }
    /**
     * Metodo que le agrega un condimento a la bebida
     * @param condimento Condimento a agregar
     */
    public void agregaCondimento(Condimento condimento){
        this.condimentos.add(condimento);
    }
    /**
     * Metodo que elimina un condimento de la bebida
     * @param condimento Condimento a eliminar
     */
    public void quitaCondimento(Condimento condimento){
        this.condimentos.remove(condimento);
    }
}
