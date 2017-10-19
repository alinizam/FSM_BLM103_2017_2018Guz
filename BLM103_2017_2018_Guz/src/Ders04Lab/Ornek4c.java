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
public class Ornek4c {

    public static void main(String[] args) {

        int hesaplanacakSayi = 1;
        while(hesaplanacakSayi <= 10){
            int sayi = hesaplanacakSayi;
            long sonuc = 1;

            if (sayi > 0) {
                while (sayi >= 1) {
                    sonuc *= sayi;//sonuc=sonuc*sayi
                    sayi--;
                }
                System.out.println(hesaplanacakSayi + "! = " + sonuc);
            } else {
                System.out.println("hatali giris yaptiniz");

            }
            hesaplanacakSayi++;
        }
    }
}
