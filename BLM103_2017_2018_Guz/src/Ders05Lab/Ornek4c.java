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
public class Ornek4c {

    public static void main(String[] args) {
        int sayi = 234435466;
        int a = sayi;
        int rakam = 6;
        int kalan;
        boolean sonuc = false;
        while (a > 0&&!sonuc) {
            kalan = a % 10;
            a = a / 10;
            if (kalan == rakam) {
                sonuc = true;
            }

        }
        System.out.println(sonuc);

    }
}
