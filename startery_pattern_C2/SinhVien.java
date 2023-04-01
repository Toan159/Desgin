/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package startery_pattern_C2;

import java.util.Date;

/**
 *
 * @author toan
 */
public class SinhVien {
    String hoTen;
    Date ngaySinh;
    float diemTB;

    public SinhVien(String hoTen, Date ngaySinh, float diemTB) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diemTB = diemTB;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public float getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(float diemTB) {
        this.diemTB = diemTB;
    }
    
    public void create_list() {
        System.out.println("Ho ten cua sinh vien:= " + hoTen  );
        System.out.println("Ngay sinh cua sinh vien:= " + ngaySinh  );
        System.out.println("Diem trung binh cua sinh vien:= " + diemTB + "\n");
    }
    
}
