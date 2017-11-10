/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders07Lab.Ornek1;

/**
 *
 * @author anizam
 */
public class Personel {

    String adi, soyadi;
    int calismaSure, netMaas;

    void maasAta(int yeniMaas) {
        if (yeniMaas > 0) {
            netMaas = yeniMaas;
        }
    }
    
    int maasOku(){
        return netMaas;
    }

    int maasHesapla() {
        if (calismaSure < 0) {
            System.out.println("Net Maas Hesabi yapilmaz");
            netMaas = -1;
        } else if (calismaSure < 10) {
            netMaas = 3000;
        } else {
            netMaas = 4000;
        }
        return netMaas;
    }

  
}
