/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders10Lab.Ornek3;

import java.util.ArrayList;

public class Araba {

    String plaka, model;
    Parca[] parcaListesi = new Parca[3];

    static ArrayList< Araba> arabalar = new ArrayList<>();

    int getToplamFiyat() {
        int toplam = 0;
        for (Parca p : parcaListesi) {
            if (p != null) {
                toplam += p.fiyat;
            }
        }
        return toplam;
    }

    double getOrtalamaFiyat() {
        int toplam = 0;
        for (int i = 0; i < arabalar.size(); i++) {
            toplam += arabalar.get(i).getToplamFiyat();
        }

        return (double) toplam / arabalar.size();
    }

    double getOrtalamaFiyat(String m) {
        int toplam = 0 , adet = 0;
        for (int i = 0; i < arabalar.size(); i++) {
            if (arabalar.get(i).model.equals(m)) {
                toplam += arabalar.get(i).getToplamFiyat();
                adet++;
            }
        }

        return (double) toplam / adet;
    }
}
