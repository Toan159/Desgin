/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package startery_pattern_C2;

/**
 *
 * @author toan
 */
public class SoSanhTheoDiem implements ISoSanh<SinhVien> {

    @Override
    public int isoSanh(SinhVien o1, SinhVien o2) {
      if(o1.getDiemTB() == o2.getDiemTB()) {
          return 0;
      } 
      else {
          if(o1.getDiemTB() > o2.getDiemTB()) {
              return  1;
          }
      }
      return -1;
    }
}
