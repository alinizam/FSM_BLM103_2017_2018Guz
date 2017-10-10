/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders03;

/**
 *
 * @author anizam
 */
public class Ornek4SoruIsareti {
    public static void main(String[] args) {
        //?ki say?dan büyük olan? bulunuz.
        int a=15,b=9;
        int max=(a>b)?a:b;
        System.out.println("Büyük say? de?eri: " +max);
        
        // ?ki say?n?n e?it olup olmad???n? ekrana yazd?r?n?z.
        System.out.println("Iki sayi esit"+ ((a==b)?"tir":" degildir") );
        
        String sonuc=(a==b)?"?ki say? e?ittir":" E?it degildir!";
        System.out.println(sonuc);
        
        // hangi de?i?kenin büyük say?y? tuttu?unu yazd?r?n?z.
        char maxDegiskenAdi=(a>b)?'a':'b';
        System.out.println("Büyük say? de?eri: " +maxDegiskenAdi);
        
        //Büyük say?n?n de?erini 5 artt?r?n?z.
        int buyuk5=(a>b)?(a+=5):(b+5);
        System.out.println("buyuk5: "+buyuk5+" a: "+a );
        
        
        String isim="Ahmet"+" AK"+6;
        System.out.println("isim: "+isim);
        
    }
}
