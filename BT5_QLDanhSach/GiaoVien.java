/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT5_QLDanhSach;

/**
 *
 * @author toan
 */
public class GiaoVien extends CaNhan{
    String monDay, toBoMon;

    public GiaoVien(String monDay, String toBoMon) {
        this.monDay = monDay;
        this.toBoMon = toBoMon;
    }

    
     @Override
    public String HienThiTT() {
        return super.HienThiTT() + "GiaoVien{" + "monDay=" + monDay + ", toBoMon=" + toBoMon + '}';
    }
    
    public String getMonDay() {
        return monDay;
    }

    public void setMonDay(String monDay) {
        this.monDay = monDay;
    }

    public String getToBoMon() {
        return toBoMon;
    }

    public void setToBoMon(String toBoMon) {
        this.toBoMon = toBoMon;
    }  
}
