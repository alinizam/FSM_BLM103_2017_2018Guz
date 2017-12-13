/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders12.Ornek2;

import java.util.ArrayList;

/**
 *
 * @author anizam
 */
public class Fabrika {
    ArrayList<Personel> calisanlar=new ArrayList();
    void calisanEkle(){
        calisanlar.add(new Personel());
        calisanlar.add(new Memur());
        calisanlar.add(new Mudur());
        calisanlar.add(new Mudur());
        calisanlar.add(new Mudur());
    }
    int getToplamUcretMudurlerHaric(){
        int toplam=0;
        for (Personel calisan : calisanlar) {
            if (!(calisan instanceof Personel)) 
                toplam+=calisan.getMaas();
        }
        return toplam;
    }
    
}
