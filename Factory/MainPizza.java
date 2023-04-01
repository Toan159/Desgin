/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Factory;

/**
 *
 * @author toan
 */
public class MainPizza {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PizzaStore pizzaStore = new  VNPizzaStore();
        
        Pizza pizza = pizzaStore.orderPizza(PizzaType.PizzaMamtom);
        
//        System.out.println("Moi anh chi order");
        System.out.println(pizza.toString());
    }
    
}
