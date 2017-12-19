/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders13.Ornek1;

/**
 *
 * @author anizam
 */
public class Test {
    public static void main(String[] args) {
        Personel p=new Memur();
        p.adi="Ahmet AK";
        
        System.out.println(p.getAdi());
        System.out.println(p.getFirma());
        
        System.out.println(((Memur)p).getFirma());
    }
}
