/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT1_NV;

import java.util.ArrayList;

/**
 *
 * @author toan
 */
public class QuanLyNhanVien implements IQLy {
    ArrayList<NhanVien> danhSach;

    public QuanLyNhanVien() {
        this.danhSach = new ArrayList<>();
    }    

    public QuanLyNhanVien(ArrayList<NhanVien> danhSach) {
        this.danhSach = danhSach;
    }
    
    
    @Override
    public void them(NhanVien nv) {
        this.danhSach.add(nv);
    }

    @Override
    public void inDS() {
        danhSach.forEach(n -> System.out.println(n.getThongTin()));
    }
}
