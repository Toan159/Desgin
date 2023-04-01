/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Bai1_Builder_Pattern;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author toan
 */
public class Main {

    /**
     * @param args the command line arguments
     * @throws java.text.ParseException
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        HoaDonHeader HDH = new HoaDonHeader
        ("HD001", new SimpleDateFormat("dd/mm/yyyy").parse("10/09/2023"),"Chicken");
        CTHD CTHD1 = new CTHD("Keyboard",2,400000,0.2);
        CTHD CTHD2 = new CTHD("AirPod",2,50000,0.3);
        
        HoaDon HD = new HoaDon.Builder()
            .addHoaDonHeader(HDH)
            .addCTHD(CTHD1)
            .addCTHD(CTHD2)
            .build();
        System.out.println(HD.toString());
    }
    
}
