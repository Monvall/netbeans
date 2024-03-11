/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import BeansSingleton.IUtilRemote;



/**
 *
 * @author User
 */
public class TestSingleton {
    
    public static void main(String[] args){
        saludoSingleton();
    }
    
    public static void saludoSingleton(){
        System.out.println ("Llamando al EJB Singleton");
        
        try{
            Context jndi = new InitialContext ();
            IUtilRemote util = (IUtilRemote) jndi.lookup("");
            
            System.out.println("Respuesta: " + util.saludo());
            
        } catch (NamingException e){
            e.printStackTrace(System.out);
        }
    }
}
