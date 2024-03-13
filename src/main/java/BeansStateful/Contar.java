/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BeansStateful;

import BeansStateful.BeanLocal.ICalculo;
import javax.ejb.EJB;
import javax.ejb.Stateful;


@Stateful
public class Contar implements IContador{
    
    @EJB
    private ICalculo icalculo;
    
    
    private int item;
    
     @Override
    public String  test(){
        return "Hola desde EJB Remoto + "  + icalculo.mensaje() ;
    }
    @Override
    public void agregarItem(){
        item++;
    }
      
    @Override
    public void borrarItem(){
        item--;
    }
    
    @Override
    public int contarItem(){
        return item;
    }
    
    @Override
    public void borrarTodo(){
        item--;
    }
    
  
   
}

