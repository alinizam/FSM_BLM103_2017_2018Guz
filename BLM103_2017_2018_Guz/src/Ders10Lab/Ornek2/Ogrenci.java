/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders10Lab.Ornek2;

import java.util.ArrayList;

/**
 *
 * @author anizam
 */
public class Ogrenci {
    String ogrenciNo, adi, soyadi;
    ArrayList <OgrenciNot> dersler = new ArrayList<>();

    double getNotOrtalama(){
        double toplam = 0;
        for (OgrenciNot d : dersler) {
            toplam += d.getNotOrtalama();
        }
        return toplam/dersler.size();
    }
}
