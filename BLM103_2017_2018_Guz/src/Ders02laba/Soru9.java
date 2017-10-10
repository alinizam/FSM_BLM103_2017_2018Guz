/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders02laba;

/**
 *
 * @author anizam
 */
public class Soru9 {

    public static void main(String[] args) {
        int sayi=777;
        int birler,onlar,yuzler;
        birler=sayi%10;
        sayi=sayi/10;
        onlar=sayi%10;
        sayi=sayi/10;
        yuzler=sayi;
        int sonuc=(birler%2)+(onlar%2)+(yuzler%2);
        System.out.println("sonuc= "+sonuc);
        
    }
}
