/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory;

/**
 *
 * @author toan
 */
public abstract class Pizza {
    
    StringBuilder builder = new StringBuilder();
            
    abstract void prepare();
    
    abstract void bake();
    
    abstract void cut();
    
    abstract void xoa();

    @Override
    public String toString() {
        return builder.toString();
    }
}
