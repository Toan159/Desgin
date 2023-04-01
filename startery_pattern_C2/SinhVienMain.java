/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package startery_pattern_C2;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author toan
 */
public class SinhVienMain {

    /**
     * @param args the command line arguments
     * @throws java.text.ParseException
     */
    public static void main(String[] args) throws ParseException{
        // TODO code application logic here
        QLSV qlsv = new QLSV();
        
        SinhVien sinhvien1 = new SinhVien("Toan", new SimpleDateFormat("dd/MM/yy").parse("01/02/2001"), 1);
        SinhVien sinhvien2 = new SinhVien("Tin", new SimpleDateFormat("dd/MM/yy").parse("10/11/2001"), 2);
        SinhVien sinhvien3 = new SinhVien("Phi", new SimpleDateFormat("dd/MM/yy").parse("29/06/2001"), 3);
        
        qlsv.addSV(sinhvien1);
        qlsv.addSV(sinhvien2);
        qlsv.addSV(sinhvien3);
        
        System.out.println("Danh sach sinh vien khoi tao: ");
        qlsv.inDS();
        
        ISoSanh iSoSanhSVTheoDiem = new SoSanhTheoDiem();
        ISoSanh iSoSanhSVTheoTen  = new SoSanhTheoTen();
        
        qlsv.setiSoSanh(iSoSanhSVTheoDiem);
        qlsv.SapXep();
        System.out.println("Danh sach sinh vien sap xep theo diem trung binh: ");
        qlsv.inDS();
        
        qlsv.setiSoSanh(iSoSanhSVTheoTen);
        qlsv.SapXep();
        System.out.println("Danh sach sinh vien sap xep theo ten: ");
        qlsv.inDS();
    }
}
