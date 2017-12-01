/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders10Lab;

import static Ders10Lab.Fabrika.malzemeListesi;

/**
 *
 * @author anizam
 */
public class Test {
    public static void main(String[] args) {
        Fabrika f = new Fabrika();
        
        Malzeme m1 = new Malzeme("m1", 100);
        Malzeme m2 = new Malzeme("m2", 200);
        Malzeme m3 = new Malzeme("m3", 300);
        
        Malzeme m4 = new Malzeme(m3);   //new Malzeme("m3", 300);
        f.malzemeleriYazdir();
        
        System.out.println(f.malzemeAdedi());
        System.out.println(f.toplamMalzemeBedeli());
    }
}
