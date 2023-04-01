/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stratery_pattern;

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
        TinhToan ct =new TinhToan();
        
        ct.setTinhToan(new Cong());
        System.out.println("1 + 1 = " + ct.tinh(1, 1));
        
        ct.setTinhToan(new Tru());
        System.out.println("10 - 5 = "+ct.tinh(10, 5));
        
        ct.setTinhToan(new Nhan());
        System.out.println("10 * 5 = " + ct.tinh(10, 5));
        
        ct.setTinhToan(new Chia());
        System.out.println("6 / 2 = "+ct.tinh(6, 2));
    }
    
}
