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
public class Usuario {
    
    private Cliente cliente;
    private TipoApartamento tipoApto;

    public Usuario() {
    }
    
    public Usuario(Cliente cl){
        this.cliente = cl;
    }
    
    public Usuario(Cliente cliente, TipoApartamento tipoApto) {
        this.cliente = cliente;
        this.tipoApto = tipoApto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public TipoApartamento getTipoApto() {
        return tipoApto;
    }

    public void setTipoApto(TipoApartamento tipoApto) {
        this.tipoApto = tipoApto;
    }
    
    public void asignarApartamento(String n){
        
        TipoApartamento apto;
        
        apto=cliente.comprarApartamento(n);
        
        cliente.getApartamentos().add(apto);
    }
}
