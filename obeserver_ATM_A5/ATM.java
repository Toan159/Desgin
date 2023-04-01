/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package obeserver_ATM_A5;

/**
 *
 * @author toan
 */
public class ATM {
    I_TaiKhoanATM taiKhoanATM;
    
    public void attach(I_TaiKhoanATM taiKhoanATM) {
        this.taiKhoanATM = taiKhoanATM;
    }
    
    public void detach(I_TaiKhoanATM taiKhoanATM) {
        this.taiKhoanATM = taiKhoanATM;
    }
    
    public boolean kiemTraTienRut(int soTienRut) {
        return taiKhoanATM.kiemTraSoDu(soTienRut);
    }
    
    public void rutTien(int soTienRut) {
        if(kiemTraTienRut(soTienRut)) {
            taiKhoanATM.nhanThongBao(soTienRut, true);
        }
        else {
            taiKhoanATM.nhanThongBao(soTienRut, false);
        }
    }
    
    public static interface I_TaiKhoanATM {
        boolean kiemTraSoDu(int soTienRut);
        void nhanThongBao(int soTienRut, boolean thanhCong);
    }
}
