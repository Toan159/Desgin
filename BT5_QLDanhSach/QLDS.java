/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT5_QLDanhSach;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author toan
 */
public class QLDS implements IQLDS{
    List<CaNhan> danhSach = new ArrayList<>();

    @Override
    public int them(CaNhan c) {
        return 0;
    }

    @Override
    public int xoa(String ten) {
        return 0;
    }

    @Override
    public void inDS() {
        for(CaNhan c:danhSach()) {
            System.out.println(c.HienThiTT());
        }
    }
//    ArrayList<CaNhan> danhSach;

    private Iterable<CaNhan> danhSach() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
