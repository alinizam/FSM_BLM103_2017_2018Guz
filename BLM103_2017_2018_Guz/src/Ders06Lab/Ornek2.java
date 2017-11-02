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
public class Ornek2 {
    public static void main(String[] args) {
        int sayi;
        for (int i = 1; i <= 5; i++) {
            sayi = i;
            for (int j = 0; j < 5; j++) {
                System.out.print(sayi + " ");
                sayi++;
            }
            System.out.println("");
        }
    }
}
