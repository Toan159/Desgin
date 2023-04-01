/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BT4_QLChuyenXe;


/**
 *
 * @author toan
 */
public class Main {

    public static void main(String[] args)  {
        // TODO code application logic here
//        QuanLyChuyenXe qlchuyenxe = new QuanLyChuyenXe();
//        XeNgoaiThanh xeNgT = new XeNgoaiThanh("Nha trang", 2, "abc123", "T", "asb1", 1000);
//        XeNgoaiThanh xeNgT1 = new XeNgoaiThanh("Phu Yen", 3, "abc123", "Y", "asb2", 2000);
////        XeNoiThanh xeNTh = new XeNoiThanh(3, 1000,"C001", "Hai", "BSK1011", 3000);
//        
//        qlchuyenxe.them(xeNgT);
//        qlchuyenxe.them(xeNgT1);
//
//        System.out.println("Danh sach chuyen xe duoc tao moi: \n");
//        qlchuyenxe.inDS();

        QuanLyChuyenXe qlcx = new QuanLyChuyenXe();
//        XeNoiThanh xeNoT1 = new XeNoiThanh(3, 1000, "C001", "Hai", "BS101", 3000);
//        XeNoiThanh xeNoT2 = new XeNoiThanh(4, 1520, "C002", "Phuoc", "BS102", 4000);
        XeNgoaiThanh xeNgT1 = new XeNgoaiThanh("Cam Ranh", 2, "c003", "Phi", "BS103", 2320);
        XeNgoaiThanh xeNgT2 = new XeNgoaiThanh("Cam Lam", 1, "c004", "Tin", "VS104", 2222);
        
//        qlcx.them(xeNoT1);
//        qlcx.them(xeNoT2);
        qlcx.them(xeNgT1);
        qlcx.them(xeNgT2);
        
        System.out.print("Danh sach chuyen xe: \n");
        qlcx.inDS();
        
        qlcx.doanhThuXeNgoaiThanh();
        qlcx.doanhThuXeNoiThanh();
//        qlcx.tongDoanhThu();
    }
    
}
