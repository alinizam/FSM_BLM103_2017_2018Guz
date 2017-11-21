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
public class Ornek2 {
    public static void main(String[] args) {
        Personel p1=new Personel();
        Personel calisanlar[]=new Personel[3];
        for (int i = 0; i < calisanlar.length; i++) {
            calisanlar[i]=p1;
        }
        p1.maas=15000;
        for (Personel calisan : calisanlar) {
            System.out.println(calisan.maas);
        }
        
        calisanlar[2].maas=10000;
        for (Personel calisan : calisanlar) {
            System.out.println(calisan.maas);
        }
    }
}
