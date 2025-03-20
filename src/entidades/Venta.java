/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import enums.Categoria;
import enums.TipoVenta;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rosales
 */
public class Venta {

    /**
     * @return the calcularSubtotal
     */
    public int getCalcularSubtotal() {
        return calcularSubtotal;
    }

    /**
     * @param calcularSubtotal the calcularSubtotal to set
     */
    public void setCalcularSubtotal(int calcularSubtotal) {
        this.calcularSubtotal = calcularSubtotal;
    }
    // Creamos los métodos get y set para cada atributo
    /**
     * @return the cliente
     */
    public String getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the subtotal
     */
    public Double getSubtotal() {
        return subtotal;
    }

    /**
     * @param subtotal the subtotal to set
     */
    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }

    /**
     * @return the total
     */
    public Double getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(Double total) {
        this.total = total;
    }

    /**
     * @return the tipo
     */
    public TipoVenta getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(TipoVenta tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the articulos
     */
    public List<Articulo> getArticulos() {
        return articulos;
    }

    /**
     * @param articulos the articulos to set
     */
    public void setArticulos(List<Articulo> articulos) {
        this.articulos = articulos;
    }
    //cliente:string, tipo:TipoVenta, subtotal:double, descuento: double, total:double, articulos:List<Articulo>
    
    private String cliente;
    
    private Double subtotal;
    
    private Double total;
    
    private TipoVenta tipo;
    
    private List<Articulo> articulos;
    
    /** Calcula el subtotal de la venta
     * 
     */
    public void calcularSubtotal() {}
    
    for(Articulo a : articulo){ }
    
        if (a.getCategoria() == Categoria.ROPA){
            
}
    
     /**
      * Calcula el total de la venta 
      */
    public void calcularTotal() {
        
    }

      
    }
    

