/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders09Lab.Ornek2;

/**
 *
 * @author anizam
 */
public class Fabrika {
    Personel[] personellerListesi = new Personel[3];
    
    
    int toplamMaas(String unvan){
        int toplamMaas = 0;
        
        for (int i = 0; i < personellerListesi.length; i++) {            
            if(personellerListesi[i].unvan.equals(unvan)){
                toplamMaas += personellerListesi[i].maas;
            }
        }
        return toplamMaas;
    }
    
    void personelEkle(Personel personel){
        for (int i = 0; i < personellerListesi.length; i++) {
            if(personellerListesi[i] == null ){
                personellerListesi[i] = personel;
                break;
            } 
        }
    }
}
