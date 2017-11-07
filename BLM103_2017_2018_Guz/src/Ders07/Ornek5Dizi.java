/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders07;

/**
 *
 * @author anizam
 */
public class Ornek5Dizi {
    public static void main(String[] args) {
        int notlar[]=new int[50];
        notlar[0]=80;
        notlar[1]=80;
        notlar[2]=70;
        notlar[3]=90;
        notlar[4]=70;
        System.out.println(notlar[2]);
       //elemanlar? yazd?r?n?z.
        for (int i = 0; i < notlar.length; i++) {
            System.out.println(i+".inci eleman = "+notlar[i]);
        }
        
        //not ortalamas?n? bulunuz.
        int toplam=0;
        for (int i = 0; i < 50; i++) {
            toplam=toplam+notlar[i];
        }
        System.out.println("toplam: "+toplam);
        System.out.println("ortalama: "+(toplam/50)); 
        
        
        //En yüksek notu bulunuz.
        
        int maksimumSayi=notlar[0];
        for (int i = 0; i < 50; i++) {
            if(notlar[i]>maksimumSayi){
                maksimumSayi=notlar[i];
            }
        }
        System.out.println("En büyük say?: "+maksimumSayi);
 
       // System.out.println(notlar[51]);    
    
        for(int not:notlar){
            System.out.println(not);
        }
       
    }
}
