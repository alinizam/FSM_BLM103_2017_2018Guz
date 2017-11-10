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
public class Test {

    public static void main(String[] args) {
        Personel p = new Personel();
        p.calismaSure = 15;
        System.out.println(p.maasHesapla());
        System.out.println(p.maasOku());

        p.maasAta(5100);
        System.out.println(p.maasOku());
    }
}
