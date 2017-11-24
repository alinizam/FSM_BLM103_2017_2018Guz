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
public class Ornek1d {

    public static void main(String[] args) {
        int[][] dizi = {{3, 6, 5, 7, 5}, {3, 5, 5, 7, 67}};
        int sayi = 5;
        
        boolean varmi = false;
        
        a:
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                if (sayi == dizi[i][j]) {
                    varmi = true;
                    System.out.println(i + " " + j);
                    break a;
                }
            }
        }
        
        if (varmi) {
            System.out.println("sayi bulunmustur");
        } else {
            System.out.println("sayibulunamamistir");
        }
    }
}
