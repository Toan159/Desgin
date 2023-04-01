/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT3_SVPoLy;

/**
 *
 * @author toan
 */
public class SinhVienIT extends SinhVienNTU{
    double java, html, css;

    public SinhVienIT(double java, double html, double css, String hoTen, String nganh) {
        super(hoTen, nganh);
        this.java = java;
        this.html = html;
        this.css = css;
    }

   
    
    
    @Override
    public double getDiem() {
        return (2*java + html + css)/4;
    }
    
    
}
