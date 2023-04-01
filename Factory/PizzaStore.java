/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory;

/**
 *
 * @author toan
 */
public abstract class PizzaStore {
    
    abstract protected Pizza crePizza(PizzaType t);
    
    public Pizza orderPizza(PizzaType t) {
//        Pizza p = crePizza(t);
//        return p;
        Pizza pizza;
        pizza = crePizza(t);
        pizza.bake();
        pizza.cut();
        pizza.prepare();
        pizza.xoa();
        return pizza;
    }
}
