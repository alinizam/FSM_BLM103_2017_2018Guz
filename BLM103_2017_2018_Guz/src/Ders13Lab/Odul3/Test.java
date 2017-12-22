/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders13Lab.Odul3;

/**
 *
 * @author anizam
 */
public class Test {
    public static void main(String[] args) {
        Personel p1 = new Personel();
        p1.unvan = "Memur";
        
        Personel.AltOdul odul = p1.new AltOdul();
        odul.odulEkle();
        odul.odulEkle();
        
        p1.unvan = "??çi";
        odul.odulEkle();
        
        System.out.println(p1.oduller);
        
        System.out.println(odul.enYuksekOduluBul().miktar);
        
        Personel p2 = new Personel();
        p2.unvan = "??çi";
        odul.personelOdulEkle(p2);
        System.out.println(p2.oduller);
    }
}
