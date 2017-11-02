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
public class Ornek3 {
     public static void main(String[] args) {
        int sayi = 1;
        for (int i = 1; i <= 5; i++) {
            int temp=sayi;
            for (int j = 0; j < Math.pow(2,4-1); j++) {
                if (j<sayi/2.0 ) System.out.print(temp + "  ");
                else System.out.print("*  ");
                temp-=2;
            }
            sayi = 2 * sayi;
            System.out.println("");
        }
    }
}
