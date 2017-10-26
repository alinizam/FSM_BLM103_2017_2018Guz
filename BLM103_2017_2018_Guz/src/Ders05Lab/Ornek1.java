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
public class Ornek1 {

    public static void main(String[] args) {
        int sayi = 17;
        int kalan, bolum = sayi;
        String sonuc = "";
        int sonucInt = 0, basamakDegeri=1;
        
        while (bolum > 0) {
            kalan = bolum % 2;
            bolum = bolum / 2;
            
            sonuc = kalan + sonuc;
            
            sonucInt += kalan*basamakDegeri;
            basamakDegeri *= 10;
        }
        
        System.out.println(sayi + " nin 2 lik degeri = " + sonucInt);

    }
}
