/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders10.Statik;

/**
 *
 * @author anizam
 */
public class PersonelTest {
    public static void main(String[] args) {
        
        Personel.firma="FSMVÜ";
        
        Personel p=new Personel();
        Personel p1=new Personel();
        Personel p2=new Personel();
        System.out.println(p.personelSayisi);
        
        p.firma="ABC";
        p1.firma="XYZ";
        System.out.println(Personel.firma);
        
        System.out.println(Personel.getFirma());
        
        
        
    }
}
