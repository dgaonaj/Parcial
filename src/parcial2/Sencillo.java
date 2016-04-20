/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2;

/**
 *
 * @author BORDADORA
 */
public class Sencillo implements TipoApartamento{
    
    private String nombre;
    private double precio;

    public Sencillo() {
    }

    public Sencillo(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public Object clonar() {
        
        Sencillo sc = new Sencillo();
        sc=this;
        return sc;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public double getPrecio() {
        return precio;
    }
    
    public String toString(){
        return nombre;
    }
    
}
