/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Bai2_Builder_Pattern;

/**
 *
 * @author toan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       MyStringBuilder str = new MyStringBuilder();
        str.addString("Toi ten la gi !!!" + " " );
        str.addFloat((float) 1.2 );
        str.addBool(false);
        System.out.println(str.toString());
               
    }

    
    
}
