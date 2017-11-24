/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders09Lab.Ornek2;

/**
 *
 * @author anizam
 */
public class Test {

    public static void main(String[] args) {
        Personel p1 = new Personel();
        p1.maas = 1000;
        p1.unvan = "a";

        Personel p2 = new Personel();
        p2.maas = 5000;
        p2.unvan = "a";

        Personel p3 = new Personel();
        p3.maas = 7000;
        p3.unvan = "b";

        Fabrika f1 = new Fabrika();
        f1.personelEkle(p1);
        f1.personelEkle(p2);
        f1.personelEkle(p3);

        int sonuc = f1.toplamMaas("a");
        System.out.println("toplam maas = " + sonuc);
    }
}
