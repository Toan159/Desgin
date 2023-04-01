/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package startery_pattern_C2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author toan
 */
public class QLSV {
    ISoSanh isoSanh;
    List<SinhVien> danhSachSV = new ArrayList<>();
    
    public QLSV() {}
    
    public QLSV(ISoSanh iSoSanh) {
        this.isoSanh = iSoSanh;
    }

    public void setiSoSanh(ISoSanh iSoSanh) {
        this.isoSanh = iSoSanh;
    }
    
    public void SapXep() {
        for(int i =0; i < danhSachSV.size() - 1; i++) {
            for(int j = i + 1; j < danhSachSV.size(); j++) {
                if(isoSanh.isoSanh(danhSachSV.get(i), danhSachSV.get(j)) > 0);
                Collections.swap(danhSachSV, i, j);
            }
        }
    }
    
    void inDS() {
        for(int i = 0; i < danhSachSV.size(); i++) {
            danhSachSV.get(i).create_list();
        }
    }
    
    public void addSV(SinhVien addSinhVien){
        danhSachSV.add(addSinhVien);
    }
}
