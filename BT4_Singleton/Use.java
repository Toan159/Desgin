/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT4_Singleton;

/**
 *
 * @author toan
 */
public  class Use {
    String phieuBC;

    public  Use(String phieuBC){
        this.phieuBC = phieuBC;
    }
    public void vote(Candidate canadidate){
        Election e = Election.getIntance();
        e.Vote(canadidate, this);
    }
}
