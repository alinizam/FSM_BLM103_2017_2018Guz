/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders04Lab;

/**
 *
 * @author anizam
 */
public class Ornek4 {

    public static void main(String[] args) {
        int i = 1;
        int sayi;
        int sonuc;
        while (i <= 10) {
            sayi= i;
            sonuc = 1;
            while (sayi >= 1) {
                sonuc *= sayi;
                sayi--;
            }
            if (sayi < 0) {
                System.out.println("hatal? giris yapt?n?z");
            } else {
                System.out.println("sayinin faktoriyeli=" + sonuc);
            }
            i++;
        }
    }
}
