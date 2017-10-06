/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders2laba;

/**
 *
 * @author anizam
 */
public class Soru5 {
    public static void main(String[] args) {
        double s1=66.11,s2=26.33;
        double s1Kusurat=s1-(int)s1;
        System.out.println("s1Kusurat:"+s1Kusurat);
        
        double s2Kusurat=s2-(int)s2;
        boolean ilkiBuyukMu=(s1Kusurat>s2Kusurat); 
        System.out.println("?lk küsurat büyük : "+ilkiBuyukMu);
        
    }
}
