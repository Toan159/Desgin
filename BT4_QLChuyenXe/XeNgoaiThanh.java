/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT4_QLChuyenXe;

/**
 *
 * @author toan
 */
public class XeNgoaiThanh extends ChuyenXe {
    String noiDen;
    int soNgayDi;

    public XeNgoaiThanh(String noiDen, int soNgayDi, String masoChuyenXe, String TaiXe, String soXe, int doanhThu) {
        super(masoChuyenXe, TaiXe, soXe, doanhThu);
        this.noiDen = noiDen;
        this.soNgayDi = soNgayDi;
    }

//    public String getNoiDen() {
//        return noiDen;
//    }
//
//    public int getSoNgayDi() {
//        return soNgayDi;
//    }

    @Override
    public String toString() {
        return "XeNgoaiThanh{" + "noiDen=" + noiDen + ", soNgayDi=" + soNgayDi + '}';
    }    
}
