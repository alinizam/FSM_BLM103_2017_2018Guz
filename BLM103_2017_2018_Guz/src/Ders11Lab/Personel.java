/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders11Lab;

import java.util.ArrayList;

public class Personel {
    String firstName, lastName, company;
    int inputYear, netPayment;
    
    int maas;
    
    ArrayList<AylikMaas> maaslar = new ArrayList();
    
    public Personel(int maas) {
        this.maas = maas;
    }
    
    void addAylikMaas(AylikMaas maas){
        maaslar.add(maas);
    } 
    
    /*
    setYeniMaas metodu yazarak eğer memursa aylık maaş ortalamasını %10 
                        işçiyse %20 arttırarrk maaş özelliğine atayınız.
    */
    void setYeniMaas(){
        for (AylikMaas aylikMaas : maaslar) {
            if(this instanceof Memur){
                aylikMaas.maas *= 1.1; 
            }
            else if(this instanceof Isci){
                aylikMaas.maas *= 1.2; 
            }
        }
    }
    
    void yeniMaas(){

    }
    
    int getToplamMaas(){
        int toplam = 0 ;
        for (AylikMaas aylikMaas : maaslar) {
            toplam += aylikMaas.maas;
        }
        return toplam;
    }
    
}
