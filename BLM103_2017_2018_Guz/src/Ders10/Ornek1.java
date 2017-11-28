/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders10;

/**
 *
 * @author anizam
 */
public class Ornek1 {
    public static void main(String[] args) {
        
        System.out.println(topla(1,3,5));
        System.out.format("Bir sayi %,d %.3f ", 1000000,10.0);
            
    }
    static int topla(int... sayilar){
        int toplam=0;
        for (int i = 0; i < sayilar.length; i++) {
            toplam += sayilar[i];
            
        }
        return toplam;
        
    }
    
}
