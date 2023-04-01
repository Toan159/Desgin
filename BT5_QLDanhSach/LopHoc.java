/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT5_QLDanhSach;

//import java.util.ArrayList;
//import java.util.List;

/**
 *
 * @author toan
 */
public class LopHoc {
//    List<HocSinh> hocSinh = new ArrayList<>();
//    List<GiaoVien> giaoVien = new ArrayList<>();
    IQLDS qldsHS = new QLDS();
    IQLDS qlDSGVGD = new QLDS();
    
    int themGVGD(GiaoVien gv) {
        return qlDSGVGD.them(gv);
    }
    
    void inDSHS() {
        qldsHS.inDS();
    }
}
