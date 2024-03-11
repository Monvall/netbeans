/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Beans;


import javax.ejb.Stateless;
@Stateless
public class Saludo implements ISaludoRemote{
    
    @Override
    
    public String getSaludo (String suNombre){
       System.out.println("Ejecutando saludo");
       return "Buenas Noches: " + suNombre;
    }
}
