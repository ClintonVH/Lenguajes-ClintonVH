/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstracciones;

/**
 *
 * @author T-107
 */
public class Imc {
     float peso;
    float altura;
    float imc;
    public Imc(float altura, float peso){
        this.peso=peso;
        this.altura=altura;
    }
    public String calcula_imc(){
          imc=peso/(altura*altura);
        return "Tu imc " + imc;
    }
    
    
}
