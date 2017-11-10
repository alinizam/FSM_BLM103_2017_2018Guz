/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders07Lab.Ornek2;

/**
 *
 * @author anizam
 */
public class Personel {

    int calismaSure, vergi;

    Maas maasHesapla() {
        Maas maas = new Maas();
        
        if (calismaSure < 10) {
            maas.net = 10000;
        } 
        else {
            maas.net = 15000;
        }
        
        maas.vergi = vergi;
        maas.hesapla();
        
        return maas;
    }
}
