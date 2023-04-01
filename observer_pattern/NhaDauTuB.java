/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observer_pattern;

/**
 *
 * @author toan
 */
public class NhaDauTuB implements TiGia.I_TheoDoiTiGia {
    TiGia b;
    public NhaDauTuB(TiGia b) {
        this.b = b;
//        b.attach(this);
        b.attach(this);
    }
    
   public void huyDangKy() {
        b.detach(this);
   }

    @Override
    public void capNhatTiGia(float delta) {
         if(delta > 0) {
           System.out.println("Nh dau tu A: Bán không ra");
       }
       else {
           System.out.println("Nha dau tu B: Khong ban");
       }
    }
    
}
