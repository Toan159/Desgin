/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT4_Singleton;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author toan
 */
public class Election {
//    List<String> you = new ArrayList();
    
    private static Election intance;
    int donalTrump = 0;
    int joeBiden = 0;
    
    List<String> users = new ArrayList();
    private Election(){
        
    }
    
    public static Election getIntance(){
        if(intance == null){
           intance = new Election();
        }
        return intance;
    }
    
    public void Vote(Candidate canadidate, Use user){
        if(users.contains(user.phieuBC)){
            return;
        }
        if(canadidate == Candidate.Donal_Trump){
            donalTrump++;
            users.add(user.phieuBC);
        }
        else if(canadidate == Candidate.Joe_Biden){
            joeBiden++;
            users.add(user.phieuBC);
        }
    }
    
    public int getDol(){
        return donalTrump;
    }
    public int getJoe(){
        return joeBiden;
    }
}
