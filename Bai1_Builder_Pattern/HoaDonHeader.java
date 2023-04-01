/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1_Builder_Pattern;

import java.util.Date;

/**
 *
 * @author toan
 */
public class HoaDonHeader {
//    khai bao cac bien/truong
    String mahoadon;
    Date ngayban;
    String tenkhachhang;

    public HoaDonHeader(String mahoadon, Date ngayban, String tenkhachhang) {
        this.mahoadon = mahoadon;
        this.ngayban = ngayban;
        this.tenkhachhang = tenkhachhang;
    }
    public HoaDonHeader(){}

    public String getMahoadon() {
        return mahoadon;
    }

    public Date getNgayban() {
        return ngayban;
    }

    public String getTenkhachhang() {
        return tenkhachhang;
    }

    public void setMahoadon(String mahoadon) {
        this.mahoadon = mahoadon;
    }

    public void setNgayban(Date ngayban) {
        this.ngayban = ngayban;
    }

    public void setTenkhachhang(String tenkhachhang) {
        this.tenkhachhang = tenkhachhang;
    }

    @Override
    public String toString() {
        return "HoaDonHeader{" + 
                "mahoadon=" + mahoadon + 
                ", ngayban=" + ngayban + 
                ", tenkhachhang=" + tenkhachhang + '}';
    }
}
