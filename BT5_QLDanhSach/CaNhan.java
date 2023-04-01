/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT5_QLDanhSach;

/**
 *
 * @author toan
 */
public abstract  class CaNhan {
    String hoTen, diaChi, sdt;
    int tuoi;
    
    public CaNhan() {
    }
    
    public CaNhan(String hoTen, String diaChi, String sdt, int tuoi) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.sdt = sdt;
        this.tuoi = tuoi;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
    
    public String HienThiTT() {
        return "CaNhan{" + "hoTen=" + hoTen + ", tuoi:=" + tuoi + ", diaChi:=" + diaChi + ", sdt:=" + sdt;
    }
}
