/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders04;

/**
 *
 * @author anizam
 */
public class Ornek14 {

    public static void main(String[] args) {
        // 5'ten 25'e kadar 7 'ye bölünen say?lar? ve toplam?n? yazd?r?n?z.
        int i = 5;
        int toplam = 0;
        while (i <= 25) {
            if (i % 7 == 0) {
                toplam += i;
                System.out.println(i);
            }
            i++;
        }
        System.out.println("Toplam = " + toplam);
    }
}
