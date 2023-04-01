/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT3_SVPoLy;

/**
 *
 * @author toan
 */
public abstract class SinhVienNTU {
    String hoTen, nganh;
    double diem;

    public SinhVienNTU(String hoTen, String nganh) {
        this.hoTen = hoTen;
        this.nganh = nganh;
    }
    
    public abstract double getDiem();
    
    public  String getHocLuc() {
        double diem = getDiem();
        if(diem<5) {
            return "Yeu";
        }
        
        if (diem<6.5) {
            return "Trung binh";
        }
        if (diem<7.5) {
            return "Kha";
        }
        if (diem<9) {
            return "Gioi";
        }
        
        return "Xuat sac";
    }
    
    public void  xuat() {
        System.out.println("Ho ten:" + hoTen);
        System.out.println("Nganh:" + nganh);
        System.out.println("Diem:" + getDiem());
        System.out.println("Hoc luc:" + getHocLuc());
    }

    // get & set là de sau cung
    public String getHoTen() {
        return hoTen;
    }

    public String getNganh() {
        return nganh;
    }
}
