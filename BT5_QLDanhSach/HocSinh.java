/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT5_QLDanhSach;

/**
 *
 * @author toan
 */
public class HocSinh extends CaNhan {
    String lop, nangKhieu;

    public HocSinh(String lop, String nangKhieu) {
        this.lop = lop;
        this.nangKhieu = nangKhieu;
    }

    @Override
    public String HienThiTT() {
        return super.HienThiTT() + "HocSinh{" + "lop=" + lop + ", nangKhieu=" + nangKhieu + '}';
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getNangKhieu() {
        return nangKhieu;
    }

    public void setNangKhieu(String nangKhieu) {
        this.nangKhieu = nangKhieu;
    }
}
