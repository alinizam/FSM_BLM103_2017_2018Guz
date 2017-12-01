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
public class OgrenciNot {

    String ogrenciNo, dersAdi;
    int[] notlar = new int[3];
    
    double getNotOrtalama(){
        double toplam = 0;
        for (int n : notlar) {
            toplam += n;
        }
        return toplam / notlar.length;
    } 
}
