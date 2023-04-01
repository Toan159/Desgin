/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT4_QLChuyenXe;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author toan
 */
public class QuanLyChuyenXe {
   List<ChuyenXe> ds = new ArrayList<>();
   
//   abstract protected int chuyen();

    public void them(ChuyenXe c) { 
//        if(kiemtra(c)==false) {
//            List.add(c);
//            return true;
//        }
        for(ChuyenXe cx:ds) {
            if (cx.masoChuyenXe == c.masoChuyenXe) {
                return;
            }
        }
        ds.add(c);
    }
    
    public int doanhThuXeNgoaiThanh() {
        int tong = 0;
        for(ChuyenXe c : ds) {
            if (c instanceof XeNgoaiThanh) {
                tong += c.doanhThu;
            }
        }
        return tong;
    }
    
      public int doanhThuXeNoiThanh() {
        int tong = 0;
        for(ChuyenXe c : ds) {
            if (c instanceof XeNoiThanh) {
                tong += c.doanhThu;
            }
        }
        return tong;
    }
    
    public void inDS() {
        for(ChuyenXe c:ds) {
            System.out.println(c.toString());
        }
    }
    
}
