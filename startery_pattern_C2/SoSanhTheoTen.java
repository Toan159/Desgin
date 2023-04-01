/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package startery_pattern_C2;

/**
 *
 * @author toan
 */
public class SoSanhTheoTen implements ISoSanh<SinhVien> {

    @Override
    public int isoSanh(SinhVien o1, SinhVien o2) {
       return o1.getHoTen().compareTo(o2.getHoTen());
    }
}
