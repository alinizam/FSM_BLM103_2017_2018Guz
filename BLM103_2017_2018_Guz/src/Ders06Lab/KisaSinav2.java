/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders06Lab;

/**
 *
 * @author anizam
 */
public class KisaSinav2 {

    public static void main(String[] args) {
        int sayi = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = sayi; j >= sayi/2; j = j - 2) {
                System.out.print(j + " ");
            }
            sayi = 2 * sayi;
            System.out.println("");
        }
    }
}
