/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT1_NV;

/**
 *
 * @author toan
 */
public class NhanVien {
    String Ten,DiaChi;
    int Tuoi;
    double Luong;
    int GioLam;

    public NhanVien() {
    }

    public NhanVien(String Ten, String DiaChi, int Tuoi, double Luong, int GioLam) {
        this.Ten = Ten;
        this.DiaChi = DiaChi;
        this.Tuoi = Tuoi;
        this.Luong = Luong;
        this.GioLam = GioLam;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public int getTuoi() {
        return Tuoi;
    }

    public void setTuoi(int Tuoi) {
        this.Tuoi = Tuoi;
    }

    public double getLuong() {
        return Luong;
    }

    public void setLuong(double Luong) {
        this.Luong = Luong;
    }

    public int getGioLam() {
        return GioLam;
    }

    public void setGioLam(int GioLam) {
        this.GioLam = GioLam;
    }

    public String getThongTin() {
        return "NhanVien{" + "Ten=" + Ten + ", DiaChi=" + DiaChi + ", Tuoi=" + Tuoi + ", Luong=" + Luong + ", GioLam=" + GioLam + '}';
    }
    
    public double tinhThuong(int GioLam){
        if(GioLam >= 200){
            return Luong=Luong*20/100;
        }
        else{
            if(GioLam <200 && GioLam >=100)
                return Luong=Luong*10/100;
            else
                return Luong;
        }
    }
}
