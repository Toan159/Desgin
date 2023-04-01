/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BT4_Singleton;

//import election_singleton.Canadidate;
//import election_singleton.User;

/**
 *
 * @author toan
 */
public class MainVote {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Use s1 = new Use("Toan");
        Use s2 = new Use("Teo");
        
        s1.vote(Candidate.Donal_Trump);
        System.out.println("Phieu bau cu cho Donal Trum" + " " + Election.getIntance().getDol());
        System.out.println("Phieu bau cu cho Donal Trum" + " " + Election.getIntance().getDol());
        
        System.out.println("\n");
        
        s2.vote(Candidate.Joe_Biden);
        System.out.println("Phieu bau cu cho Joe Biden" + " " + Election.getIntance().getJoe());    
        System.out.println("Phieu bau cu cho Donal Trum" + " " + Election.getIntance().getDol());
    }
    
}
