/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BeansStateful.BeanLocal;

import javax.ejb.Stateful;
 @Stateful
public class Calculo implements ICalculo{
    @Override
    public String mensaje(){
        return "mensaje desde EJB Local";
    }
}
