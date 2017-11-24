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
public class Ornek1b {

    public static void main(String[] args) {
        int arananSayi = 71;
        int[] dizi = {4, 7, 4, 3, 2, 89, 56, 89};
        System.out.println(sayiVarmi(dizi, arananSayi));
    }

    static boolean sayiVarmi(int[] dizi, int arananSayi) {

        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] == arananSayi) {
                return true;
            }
        }
        return false;
    }
}
