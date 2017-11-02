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
public class Ornek1 {

    public static void main(String[] args) {
        int sayi = 5;
  
        int kontrol = 0b1;

        while (sayi >= kontrol) {
            kontrol = kontrol<<1;
        }
        System.out.println(kontrol>>1);
    }
}
