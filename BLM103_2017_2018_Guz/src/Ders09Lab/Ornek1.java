/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders09Lab;

/**
 *
 * @author anizam
 */
public class Ornek1 {

    public static void main(String[] args) {
        int arananSayi = 7;
        int[] dizi = {4, 7, 4, 3, 2, 89, 56, 89};
        
        boolean varMi = false;
        
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] == arananSayi) {
                varMi = true;
                break;
            }
        }
        
        if (varMi) {
            System.out.println("sayi dizide bulundu");
        } else {
            System.out.println("bulunamadi");
        }
        
        
        boolean sonuc = sayiVarmi(dizi, 5);
        System.out.println(sonuc);
        System.out.println(sayiVarmi(dizi, 4));
        System.out.println(sayiVarmi(dizi, 7));
    }

    static boolean sayiVarmi(int[] dizi, int arananSayi) {
        boolean varMi = false;

        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] == arananSayi) {
                varMi = true;
                break;
            }
        }
        
        return varMi;
    }
}
