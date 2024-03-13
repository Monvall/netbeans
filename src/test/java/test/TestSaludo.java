/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;


import BeansStateful.IContador;
import Beans.ISaludoRemote;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class TestSaludo {
    public static void main(String[] args){
        //saludo();
        contar();
    }
    
    private static void saludo(){
        System.out.println("Llamado al EJB");
         try{
             Context jndi = new InitialContext();
             ISaludoRemote saludoEjb = (ISaludoRemote) jndi.lookup("java:global/MV100521-1.0-SNAPSHOT/Saludo!Beans.ISaludoRemote");
             String respuesta = saludoEjb.getSaludo("Cesar");
             System.out.println(respuesta);
         } catch (NamingException e){
             e.printStackTrace(System.out);
         }
    }
    
    private static void contar(){
        System.out.println("Llamando al EJB");
        try {
            Context jndi = new InitialContext();
            IContador agregar = (IContador) jndi.lookup("java:global/MV100521-1.0-SNAPSHOT/Contar");
            System.out.println(agregar);
            System.out.println(agregar.test());
            System.out.println("Se agrego in item");
            agregar.agregarItem();
            agregar.agregarItem();
            
            
            System.out.println("Registros; " + agregar.contarItem());
                    
        } catch (NamingException e ){
            e.printStackTrace(System.out);
        }
    }
}
