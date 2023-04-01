/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2_Builder_Pattern;

/**
 *
 * @author toan
 */
public class MyStringBuilder {
    private String str = "";
    
    public MyStringBuilder(String str) {
        this.str = str;
    }

   public MyStringBuilder() {
        
    }
    
    public MyStringBuilder addString(String s){
        this.str = this.str.concat(s); // String concat la noi them chuoi 
        return this;
    }
    public MyStringBuilder addFloat(float f){
        this.str=this.str.concat(Float.toString(f));
        return this;
    }
    public MyStringBuilder addBool(boolean b){
        this.str=this.str.concat(Boolean.toString(b));
        return this;
    }

    @Override
    public String toString() {
        return "MyStringBuilder{" + "str=" + str + '}';
    }
    
}
    
