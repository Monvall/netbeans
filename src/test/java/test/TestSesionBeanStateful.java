/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;


import BeansStateful.BeanLocal.ICalculo;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class TestSesionBeanStateful{

public static void main (String[] args){
    testBeanLocal1();
}
 public static void testBeanLocal1() {
        System.out.println("Llamando al EJB - LOCAL");
        
        try{
            Context jndi = new InitialContext();
            ICalculo agregar = (ICalculo) jndi.lookup("java:global/MV100521-1.0-SNAPSHOT/Calculo!BeansStateful.BeanLocal.ICalculo");
            
            System.out.println(agregar.mensaje());
        }catch(NamingException e) {
            e.printStackTrace(System.out);
        }
    }

    
}