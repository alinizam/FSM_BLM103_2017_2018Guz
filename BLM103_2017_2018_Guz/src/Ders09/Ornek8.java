/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders09;

/**
 *
 * @author anizam
 */
public class Ornek8 {

    public static void main(String[] args) {
        sayilariTopla(1);
        sayilariTopla(1,2,3);
        sayilariTopla();
        int sayilar[]={1,3,5};
        sayilariTopla(sayilar);
    }

    static int sayilariTopla(int... sayilar) {
        int toplam=0;
        for (int i = 0; i < sayilar.length; i++) {
            toplam+=sayilar[i];
        }
        return toplam; 
    }
     static int sayilariTopla(String a,int... sayilar) {
        int toplam=0;
        for (int i = 0; i < sayilar.length; i++) {
            toplam+=sayilar[i];
        }
        return toplam; 
    }
    
}
