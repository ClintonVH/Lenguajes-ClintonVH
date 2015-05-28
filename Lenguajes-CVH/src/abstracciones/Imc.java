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
     private float peso;
    private float altura;
   
    public Imc(float altura, float peso){
        this.peso=peso;
        this.altura=altura;
    }
    public String calcula_imc(){
        float  imc=peso/(altura*altura);
        if (imc <20)
     {
        return imc + " Tienes Anorexia";
     } 
     else
     {
         if(imc>=20 && imc <25)
         {
             return imc + " Estas en tu peso ideal";
         }else
         {
          if (imc>=25 && imc <30)  {
              return imc + " Estas en sobrepeso";
          }
          else{
              return imc + " Estas en plena obesidad";
          }
         }
     }
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

  
    
}
