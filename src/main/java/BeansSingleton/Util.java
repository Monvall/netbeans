/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BeansSingleton;

import javax.ejb.Remote;

@Remote
public class Util implements IUtilRemote{
    
    @Override
    public String saludo(){
        return "Saludo desde BeansSingleton";
    }
}
