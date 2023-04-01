/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory;

/**
 *
 * @author toan
 */
public class PizzaMamTom extends Pizza{

    @Override
    void prepare() {
        builder.append("Pizza thap cam!! \n");
    }

    @Override
    void bake() {
        builder.append("Pizza khong bo hanh. \n");
    }

    @Override
    void cut() {
        builder.append("Pizza da ban het!!!" + " "
        + "Mong quy khach quay lai mua vao ngay hom sau.");
    }

    @Override
    void xoa() {
        builder.append("Xin loi hom nay quay khong có ban banh Pizza.");
    }
}
