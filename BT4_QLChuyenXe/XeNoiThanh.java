/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT4_QLChuyenXe;

/**
 *
 * @author toan
 */
public class XeNoiThanh extends ChuyenXe {
    String soKM, soTuyen;

    public XeNoiThanh(String soKM, String soTuyen, String masoChuyenXe, String TaiXe, String soXe, int doanhThu) {
        super(masoChuyenXe, TaiXe, soXe, doanhThu);
        this.soKM = soKM;
        this.soTuyen = soTuyen;
    }

    @Override
    public String toString() {
//        return "XeNoiThanh{" + "soKM=" + soKM + ", soTuyen=" + soTuyen + '}';
        return super.toString() + "\n" +
                "So tuyen: " + soTuyen + "\n" +
                "So Km: " + soKM;
    }

    public String getSoKM() {
        return soKM;
    }

    public void setSoKM(String soKM) {
        this.soKM = soKM;
    }

    public String getSoTuyen() {
        return soTuyen;
    }

    public void setSoTuyen(String soTuyen) {
        this.soTuyen = soTuyen;
    }


    
}
