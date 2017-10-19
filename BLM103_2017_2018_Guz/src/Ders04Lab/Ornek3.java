/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders04Lab;

public class Ornek3 {

    public static void main(String[] args) {
        int sayi = 16;
        long sonuc = 1;

        if (sayi > 0) {
            while (sayi >= 1) {
                sonuc *= sayi;//sonuc=sonuc*sayi
                sayi--;
            }
            System.out.println("sayinin faktoriyeli = " + sonuc);
        } else {
            System.out.println("hatali giris yaptiniz");

        }
    }

}
