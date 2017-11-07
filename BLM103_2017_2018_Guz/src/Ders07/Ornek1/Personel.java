/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders07.Ornek1;

/**
 *
 * @author anizam
 */
public class Personel {
    String adi,soyadi;
    int netMaas, vergi;
    int burutMaasHesapla(){
        int sonuc=netMaas+vergi;
        return sonuc;
    }
    void maasArttir(int artis){
        netMaas+=artis;
    }
}
