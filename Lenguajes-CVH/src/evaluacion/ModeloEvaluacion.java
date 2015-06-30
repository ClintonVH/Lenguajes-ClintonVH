/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluacion;

/**
 *
 * @author Clinton
 */
public class ModeloEvaluacion {
    public float evaluar(ExamenParcial cParcial, ExamenFinal cFinal)throws ExcepcionPorcentaje{
         if (cParcial.getPorcentaje()+cFinal.getPorcentaje() != 1) throw new ExcepcionPorcentaje();
        float calificacionFinal=cParcial.getCalificacion()*cParcial.getPorcentaje()+
                cFinal.getCalificacion()*cFinal.getPorcentaje();
        return calificacionFinal;
    }
    
}
