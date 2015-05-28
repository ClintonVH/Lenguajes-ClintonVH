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
public class InterfazImc {
 public static void main(String []oso){
  Imc indice=new  Imc(1.68f,80);
  System.out.println(indice.calcula_imc());
     if (indice.imc <20)
     {
         System.out.println("Tienes Anorexia");
     } 
     else
     {
         if(indice.imc>=20 && indice.imc <25)
         {
             System.out.println("Estas en tu peso ideal");
         }else
         {
          if (indice.imc>=25 && indice.imc <30)  {
              System.out.println("Estas en sobrepeso");
          }
          else{
              System.out.println("Estas en plena obesidad");
          }
         }
     }
     
            
 }
    
     
     
    
}



