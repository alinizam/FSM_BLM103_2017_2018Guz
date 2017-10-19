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
public class Ornek4b {

    public static void main(String[] args) {
        int sayi = 1;
        int sonuc = 1;

        while (sayi <= 10) {
            sonuc *= sayi;
            System.out.println(sayi + "! = " + sonuc);
            sayi++;
        }

    }
}
