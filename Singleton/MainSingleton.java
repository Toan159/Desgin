/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Singleton;

/**
 *
 * @author toan
 */
public class MainSingleton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        
        s1.tang();
        System.out.println("S1, count: " + s1.getCount());
        
        s2.tang();
        s1.tang();
        
        System.out.println("S1, count: " + s1.getCount());
        System.out.println("S2, count: " + s2.getCount());
    }
    
}
