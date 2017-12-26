/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders14.Ornek2;

/**
 *
 * @author anizam
 */
public class Test {
    public static void main(String[] args) {
        Araba a=new Araba();
        a.hizlan();
        System.out.println(a.hiz);
        
        Bisiklet b=new Bisiklet();
        b.hizlan();
        System.out.println(b.hiz);
        
          
        a.anonimHizlan();
        System.out.println(a.hiz);
        
    }
}
