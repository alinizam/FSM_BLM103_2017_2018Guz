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
public class PersonelTest {
    public static void main(String[] args) {
        Personel p=new Personel();
        p.netMaas=100;
        p.vergi=10;
        p.burutMaasHesapla();
        System.out.println(p.burutMaasHesapla());
        p.maasArttir(50);
        System.out.println(p.netMaas);
        System.out.println(p.burutMaasHesapla());
    }
}
