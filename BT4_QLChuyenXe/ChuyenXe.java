/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT4_QLChuyenXe;

/**
 *
 * @author toan
 */
public class ChuyenXe {
     String masoChuyenXe, TaiXe, soXe;
    int doanhThu;

    public ChuyenXe(String masoChuyenXe, String TaiXe, String soXe, int doanhThu) {
        this.masoChuyenXe = masoChuyenXe;
        this.TaiXe = TaiXe;
        this.soXe = soXe;
        this.doanhThu = doanhThu;
    }

    @Override
    public String toString() {
        return "Ma so chuyen xe:" + masoChuyenXe + "\n" +
                "Tai Xe:" + TaiXe + "\n" +
                "So Xe:" + soXe + "\n" +
                "Doanh Thu:" + doanhThu;
    }

    
//    public String getMasoChuyenXe() {
//        return masoChuyenXe;
//    }
//
//    public String getTaiXe() {
//        return TaiXe;
//    }
//
//    public String getSoXe() {
//        return soXe;
//    }
//
//    public int getDoanhThu() {
//        return doanhThu;
//    }
//    

    public String getMasoChuyenXe() {
        return masoChuyenXe;
    }

    public void setMasoChuyenXe(String masoChuyenXe) {
        this.masoChuyenXe = masoChuyenXe;
    }

    public String getTaiXe() {
        return TaiXe;
    }

    public void setTaiXe(String TaiXe) {
        this.TaiXe = TaiXe;
    }

    public String getSoXe() {
        return soXe;
    }

    public void setSoXe(String soXe) {
        this.soXe = soXe;
    }

    public int getDoanhThu() {
        return doanhThu;
    }

    public void setDoanhThu(int doanhThu) {
        this.doanhThu = doanhThu;
    }
    
}
