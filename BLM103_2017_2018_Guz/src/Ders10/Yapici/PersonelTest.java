/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders10.Yapici;

/**
 *
 * @author anizam
 */
public class PersonelTest {
    public static void main(String[] args) {
        Personel p=new Personel();
        System.out.println(p.maas);
        
        Personel p1=new Personel(15000);
        System.out.println(p1.maas);
        
        Personel calisanlar[]=new Personel[5];
        calisanlar[0]=new Personel(10000);
        
        Personel p2=new Personel();
        p2.maas=16000;
        calisanlar[1]=p2;
        
        
        Personel p3=new Personel(100000, "Ahmet", "Ak");
        System.out.println(p3.adi+" "+p3.soyadi);
        
    }
}
