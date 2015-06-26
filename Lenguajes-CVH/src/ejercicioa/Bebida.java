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
public class Bebida {
    public Bebida(){
        
    }
    private String tipo;
    private String []bebidas;
    
    public String[] obtenerRecomendaciones(){
        
        
        if (tipo.equals("Alcoholicas")){
            String []alcoholicas={"Wisky","Vodka","Coñac","Cerveza","Ron","Tequila"};
            return alcoholicas;
        }else{
            String []sinalcohol={"Jugo","Agua","Refresco","Limonada","Cafe"};
            return sinalcohol;
        }
        
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String[] getBebidas() {
        return bebidas;
    }

    public void setBebidas(String[] bebidas) {
        this.bebidas = bebidas;
    }
}
