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
public class Ornek4_a {

    public static void main(String[] args) {
        int sayi = 16;

        int counter = (sayi % 2 != 0) ? 0 : 1;
        
        counter = (counter == 1 && ((sayi/2) % 2 == 0)) ? counter+1 : counter;

        counter = (counter == 2 && ((sayi/4) % 2 == 0)) ? counter+1 : counter;

        counter = (counter == 3 && ((sayi/8) % 2 == 0)) ? counter+1 : counter;

        System.out.println(counter);
    }
}
