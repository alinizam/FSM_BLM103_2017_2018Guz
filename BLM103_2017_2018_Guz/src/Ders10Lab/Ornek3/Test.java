/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders10Lab.Ornek3;

/**
 *
 * @author anizam
 */
public class Test {
    public static void main(String[] args) {
        Araba a1 = new Araba();
        a1.model = "1";
        
        a1.parcaListesi[0] = new Parca(120, "p1");
        a1.parcaListesi[1] = new Parca(80, "p2");
        a1.parcaListesi[2] = new Parca(300, "p3");
        
        Araba a2 = new Araba();
        a2.model = "1";
        
        a2.parcaListesi[0] = new Parca(120, "p1");
        a2.parcaListesi[1] = new Parca(80, "p2");
        a2.parcaListesi[2] = new Parca(200, "p3");
        
        System.out.println(a1.getToplamFiyat());
        System.out.println(a2.getToplamFiyat());
        
        Araba.arabalar.add(a1);
        Araba.arabalar.add(a2);
        
        System.out.println("ort: " + a1.getOrtalamaFiyat());
    }
}
