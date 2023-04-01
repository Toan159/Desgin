/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package obeserver_ATM_A5;

/**
 *
 * @author toan
 */
public class TaiKhoan implements ATM.I_TaiKhoanATM{
    ATM atm;
    int sodu;
    String ten;

    public TaiKhoan(ATM atm, int sodu, String ten) {
        this.atm = atm;
        this.sodu = sodu;
        this.ten = ten;
    }
    
    public void duathevaoATM(ATM atm) {
        this.atm = atm;
        atm.attach(this);
    }
    
    public void ruttheRa(ATM atm) {
        this.atm = atm;
        atm.detach(this);
    }
    
    @Override
    public boolean kiemTraSoDu(int soTienRut) {
        if(sodu >= soTienRut) {
            sodu = sodu - soTienRut;
            return true;
        }
        else {
                return false;
        }
    }

    @Override
    public void nhanThongBao(int soTienRut, boolean thanhCong) {
        System.out.println("So tien da rut ra:" + soTienRut + thanhCong);
    }
    
}
