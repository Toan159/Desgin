/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Bai7_Builder_Pattern;

/**
 *
 * @author toan
 */
public class MainCopmuter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            
    Computer c = new Computer.Builder()
            .buildCPU("Core i9 \n")
            .buildHardDisk("1TB \n")
            .buildRAM("8GB \n")
            .buildSCREEN("21 in \n")
            .buildComputer();
        System.out.println(c.toString());
    }
    
}
