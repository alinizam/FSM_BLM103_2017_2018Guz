/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders03Lab;

/**
 *
 * @author anizam
 */
public class Ornek4 {

    public static void main(String[] args) {
        int sayi = 16;

        int count = (sayi % 2 != 0) ? 0 : 
                    ((sayi / 2) % 2 != 0) ? 1 : 
                    ((sayi / 4) % 2 != 0) ? 2 : 3;
        
        System.out.println("kaç kere bölünür : " + count);
    }
}
