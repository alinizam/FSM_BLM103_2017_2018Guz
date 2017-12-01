/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders10Lab;

/**
 *
 * @author anizam
 */
public class Fabrika {

    String adi;
    static Malzeme[] malzemeListesi = new Malzeme[10];

    void malzemeEkle(Malzeme m, int index) {
        if (index >= 0 && index < malzemeListesi.length) {
            if (malzemeListesi[index] == null) {
                malzemeListesi[index] = m;
            } 
            else {
                malzemeEkle(m);
            }
        }
    }

    void malzemeSil(int index) {
        if (index >= 0 && index < malzemeListesi.length) {
            malzemeListesi[index] = null;
        }
    }
    
    static void malzemeEkle(Malzeme m) {
        for (int i = 0; i < malzemeListesi.length; i++) {
            if (malzemeListesi[i] == null) {
                malzemeListesi[i] = m;
                break;
            }
        }
    }
    
    
    
    
    
    
    
    
    void malzemeleriYazdir() {
        for (Malzeme m : malzemeListesi) {
            if (m != null) {
                System.out.println(m + " -> " + m.adi + " - " + m.fiyat);
            }
        }
    }

    int malzemeAdedi() {
        int adet = 0;
        for (int i = 0; i < malzemeListesi.length; i++) {
            if (malzemeListesi[i] != null) {
                adet++;
            }
        }
        return adet;
    }

    int toplamMalzemeBedeli() {
        int toplam = 0;
        for (int i = 0; i < malzemeListesi.length; i++) {
            if (malzemeListesi[i] != null) {
                toplam += malzemeListesi[i].fiyat;
            }
        }
        return toplam;
    }

    

}
