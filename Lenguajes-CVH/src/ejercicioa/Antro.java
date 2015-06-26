/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioa;

/**
 *
 * @author Clinton
 */
public class Antro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Direccion d1=new Direccion(55130,"ecatepec");
        Usuario u=new Usuario("juean",42,"jcampos@gmail.com",d1);
        System.out.println(u.getDireccion().getMunicipio());
        
        
        
        Bebida bebida=new Bebida();
        bebida.setTipo("alcoholicas");
        String []reco= bebida.obtenerRecomendaciones();
        for (String bebidas:reco){
            System.out.println("Bebida "+bebidas);
        }
    }
    
}
