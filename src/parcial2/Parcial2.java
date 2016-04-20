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
public class Parcial2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Cliente  cl = new Cliente("Felipe Gaona", "1024549777"); 
        Usuario usu = new Usuario(cl);
        
        usu.asignarApartamento("Sencillo");
        usu.asignarApartamento("Suite");
        for(int i=0; i<cl.getApartamentos().size(); i++){
            
            System.out.println("Nombre: "+cl.getApartamentos().get(i).getNombre()+" - Precio: "+cl.getApartamentos().get(i).getPrecio());
        }
    }
    
}
