/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders12Lab;

import java.util.ArrayList;

/**
 *
 * @author anizam
 */
public class Ekran {
    ArrayList<IHareket> nesneler = new ArrayList<>();
    
    void nesneEkle(IHareket nesne){
        nesneler.add(nesne);
    }
    
    int toplamAlan(){
        int toplam = 0;       
        for (IHareket nesne : nesneler) {
            toplam += nesne.getAlan();
        }       
        return toplam;
    }
}
