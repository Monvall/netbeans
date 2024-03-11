/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package BeansStateful;

import javax.ejb.Remote;

@Remote
public interface IContador {
    
    public void agregarItem();
    public void borrarItem();
    public int contarItem();
    public void borrarTodo();
    public String test();
}
