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
public class SaatTest {
    public static void main(String[] args) {
        Saat saat1 = new Saat();
        saat1.saat = 22;
        saat1.dakika = 58;
        saat1.saniye = 59;
        
        for (int i = 0; i < 140; i++) {
            saat1.saniyeArttir();
            saat1.saatKac();
        }
        
        
    }
}
