/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders07Lab.Ornek1;

/**
 *
 * @author anizam
 */
public class Saat {

    int saat, dakika, saniye;

    void saatKac() {
        System.out.println(saat + " : " + dakika + " : " + saniye);
    }

    void saniyeArttir() {
        if (saniye < 59) {
            saniye++;
        }
        else{
            saniye = 0;
            dakikaArttir();
        }
    }

    void dakikaArttir() {
        if (dakika < 59) {
            dakika++;
        }
        else{
            dakika = 0;
            saatArttir();
        }
    }

    void saatArttir() {
        if(saat < 23){
            saat++;
        }
        else{
            saat = 0;
        }
    }
}
