/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders09;

/**
 *
 * @author anizam
 */
public class Ornek6 {
    public static void main(String[] args) {
        int sayilar[]={1,3,5};
        System.out.println(diziToplamiBul(sayilar));
        
        sayilar=diziyiArttir(sayilar,5);
        System.out.println(sayilar[2]);
    }
    static int diziToplamiBul(int[] dizi){
        int toplam=0;
        for (int i = 0; i < dizi.length; i++) {
            toplam+=dizi[i];
        }
        return toplam;
    }
    
    static int[] diziyiArttir(int[] dizi,int sayi){
        for (int i = 0; i < dizi.length; i++) {
            dizi[i]+=sayi;
        }
        return dizi;
    }
}
