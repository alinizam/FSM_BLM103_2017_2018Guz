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
public class Ornek5b {
    public static void main(String[] args) {
        int sayi = 1;
        int sonuc = 0;
        
        while (sayi <= 100 && sonuc+sayi <= 3000) {            
            sonuc += sayi;
            sayi++;
        }
        
        System.out.println(sonuc + " - " + (sayi-1));
    }
}
