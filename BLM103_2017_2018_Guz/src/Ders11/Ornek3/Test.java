/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders11.Ornek3;

/**
 *
 * @author anizam
 */
public class Test {
    public static void main(String[] args) {
        Araba a=new Arazi();
        System.out.println(a.getFiyat());
        
        Araba[] arabalar=new Araba[5];
        arabalar[0]=new Sedan();
        arabalar[1]=new Sedan();
        arabalar[2]=new Araba();
        arabalar[3]=new Sedan();
        arabalar[4]=new Arazi();
        int toplam=0;
        for (int i = 0; i < arabalar.length; i++) {
            toplam+= arabalar[i].getFiyat();
        }
        System.out.println("Toplam = "+toplam);
       
        toplam=0;
        for (Araba araba : arabalar) {
             toplam+= araba.getFiyat();
        }
        System.out.println("Toplam = "+toplam);
    
    }
}
