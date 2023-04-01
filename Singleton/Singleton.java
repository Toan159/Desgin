/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Singleton;

/**
 *
 * @author toan
 */
public class Singleton {
    private  static Singleton instance;
    int count = 0;

    private Singleton() {
    }
    
    public void tang() {
        count++;
        
    }
    
    public static Singleton getInstance() {
        if(instance ==  null) {
            instance = new Singleton();
        }
        return instance;
    }

    public int getCount() {
        return count;
    }
    
    
}
