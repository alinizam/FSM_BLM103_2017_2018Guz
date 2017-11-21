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
public class Test {
    public static void main(String[] args) {
      /*  Personel p1=new Personel();
        p1.maas=1000;
         Personel p2=new Personel();
        p2.maas=1000;
         Personel p3=new Personel();
        p3.maas=1000;*/
        
        Personel calisanlar[]=new Personel[3];
        calisanlar[0]=new Personel();
        calisanlar[0].maas=10000;
        calisanlar[1]=new Personel();
        calisanlar[1].maas=10000;
        calisanlar[2]=new Personel();
        calisanlar[2].maas=10000;
        int toplam=0;
        for (int i = 0; i < calisanlar.length; i++) {
            calisanlar[i]=new Personel();
        }
        
        for (int i = 0; i < calisanlar.length; i++) {
            toplam+=calisanlar[i].maas;
        }
        
        
        int maaslar[]={10000,15000,13000};
    }
    
}
