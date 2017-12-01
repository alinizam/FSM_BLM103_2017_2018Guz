/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders10Lab.Ornek2;

/**
 *
 * @author anizam
 */
public class Test {
    public static void main(String[] args) {
        OgrenciNot ders1 = new OgrenciNot();
        ders1.notlar[0]=60;
        
        OgrenciNot ders2 = new OgrenciNot();
        ders2.notlar[0]=90;
        
        Ogrenci o1 = new Ogrenci();
        o1.dersler.add(ders1);
        o1.dersler.add(ders2);
        
        System.out.println("ortalama : " + o1.getNotOrtalama());
    }
}
