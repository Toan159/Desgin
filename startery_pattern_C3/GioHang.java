/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package startery_pattern_C3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author toan
 */
public class GioHang {
    IThanhToan ithanhToan;
    List<HangHoa> danhsachHH = new ArrayList<>();
    int moneyHang = 0;

    public void setIthanhToan(IThanhToan ithanhToan) {
        this.ithanhToan = ithanhToan;
    }
    
    public void addHH(HangHoa hangHoa) {
        danhsachHH.add(hangHoa);
    }
    
//    public int moneyHGoc() {
//        for(int i = 0; i < danhsachHH.size(); i++) {
//            moneyHang += danhsachHH.get(i).getGla();
//        }
//    }
    
//    public double thanhtoan() {
//        
//    }
    
    public void display() {
        for(int i = 0; i < danhsachHH.size(); i++) {
            danhsachHH.get(i).display();
        }
    }
    
}
