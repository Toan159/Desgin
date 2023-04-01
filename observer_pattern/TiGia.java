/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observer_pattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author toan
 */
public class TiGia {
    List<I_TheoDoiTiGia> obeservers = new ArrayList();
    
    public void attach(I_TheoDoiTiGia o) {
        if(obeservers.contains(o)) {
            obeservers.add(o);
        }
    }
    
    public void detach(I_TheoDoiTiGia o) {
        if (obeservers.contains(o)) {
            obeservers.remove(o);
        }
    }
    
    public void notifyTiGia(float delta) {
        for (var obs: obeservers) {
            obs.capNhatTiGia(delta); 
        }
    }
    
    static public interface I_TheoDoiTiGia {
        void capNhatTiGia(float delta);
//        @Override
//        public boolean equals(Object obj);
    }
}
