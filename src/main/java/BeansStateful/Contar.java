/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BeansStateful;


import javax.ejb.Stateful;

@Stateful
public class Contar implements IContador{
    
    private int item;
    
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
    
     @Override
    public String  test(){
        return "ola" ;
    }
    
   
}

