/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders11.Ornek2;

/**
 *
 * @author anizam
 */
public class Ogrenci {
    String adi,soyadi;

    public Ogrenci() {
        System.out.println("Üst s?n?f bo? yap?c?s? ça?r?ld?.");
        
    } 
    public Ogrenci(String adi, String soyadi) {
        this.adi = adi;
        this.soyadi = soyadi;
        System.out.println("Üst s?n?f yap?c?s? ça?r?ld?.");
    }
    final void notVer(){
        System.out.println("Not verildi.");
    }
    
}
