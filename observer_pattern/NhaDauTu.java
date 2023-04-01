/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observer_pattern;

/**
 *
 * @author toan
 */
public class NhaDauTu implements TiGia.I_TheoDoiTiGia {
    TiGia t;
    public NhaDauTu(TiGia t) {
        this.t =t;
//        t.attach(o:this);
        t.attach(this);
    }
    
    public void huyDangKy() {
        t.detach(this);
   }
    
   public void capNhatTiGia(float delta) {
       if(delta > 0) {
           System.out.println("Nh dau tu A: Bán không ra");
       }
       else {
           System.out.println("Nha dau tu B: Ban ra rat nhieu");
       }
   }
}
