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
public class Ornek0 {
    public static void main(String[] args) {
        
        int sayi=0b1010000111101;          
        int temp=sayi;
        int sayac=0;
        while(sayi>0){
            if ((sayi&1)==0) sayac++;
            sayi=sayi>>1;
        }
        System.out.println(temp+"daki toplam s?f?r adedi: "+sayac);
    }
}
