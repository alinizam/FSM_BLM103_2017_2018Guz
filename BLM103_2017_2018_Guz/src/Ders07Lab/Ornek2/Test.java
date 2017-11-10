/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders07Lab.Ornek2;

/**
 *
 * @author anizam
 */
public class Test {

    public static void main(String[] args) {
        Personel p = new Personel();
        p.calismaSure = 15;
        p.vergi = 500;
        Maas maas = p.maasHesapla();
        System.out.println(maas.net + " : " + maas.vergi + " : " + maas.burut);
    }
}
