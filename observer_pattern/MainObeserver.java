/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package observer_pattern;

/**
 *
 * @author toan
 */
public class MainObeserver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TiGia t = new TiGia();
        NhaDauTu a = new NhaDauTu(t);
        NhaDauTuB b = new NhaDauTuB(t);

        System.out.println("Lan 1:");
        t.notifyTiGia(-5);
        a.huyDangKy();

        System.out.println("Lan 2:");
        t.notifyTiGia(5);
    }
}
