/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chekedexception;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Administrador
 */
public class ProbarCheked {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File f=new File("archivaldo");
        try {
            FileOutputStream fos=new FileOutputStream(f);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ProbarCheked.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
