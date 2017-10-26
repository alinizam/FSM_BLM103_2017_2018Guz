/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders05Lab;

/**
 *
 * @author anizam
 */
public class Ornek4b {

    public static void main(String[] args) {
        int rakam = 7;
        int sayi = 3339955;
        int yenisayi;
        yenisayi = sayi;
        int a;
        boolean sonuc = false;
        while (yenisayi > 0 && !sonuc ) {
            a = yenisayi % 10;
            if (a == rakam) {
                sonuc = true;
            }
            yenisayi /= 10;
        }
        System.out.println(sonuc);
    }
}
