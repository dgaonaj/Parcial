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
public class Factory {
    
    private Sencillo sc;
    private Suite st;

    public Factory() {
        
        sc = new Sencillo("Sencillo", 2500);
        st = new Suite("Suite", 7500);
        
    }
    
    public TipoApartamento crearApartamento(String n){
        
        if(n.equals("Suite")){
            return (TipoApartamento) st.clonar();
        }else{
            if(n.equals("Sencillo")){
                return (TipoApartamento) sc.clonar();
            }else{
                return null;
            }
        }
    }
}
