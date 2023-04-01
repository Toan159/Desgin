/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory;

/**
 *
 * @author toan
 */
public class VNPizzaStore extends PizzaStore{

    @Override
    protected Pizza crePizza(PizzaType t) {
        Pizza pizza = null;
        
        if (t == PizzaType.PizzaMamtom) {
            pizza = new PizzaMamTom();
        }
        return pizza;
    }
}
