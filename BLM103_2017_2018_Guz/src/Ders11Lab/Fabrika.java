/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders11Lab;

import java.util.ArrayList;

public class Fabrika {

    ArrayList<Personel> personelListesi = new ArrayList();

    void personelEkle(Personel p) {
        personelListesi.add(p);
    }

    void hangiTurElemanlarVar() {
        for (int i = 0; i < personelListesi.size(); i++) {
            Personel p = personelListesi.get(i);

            if (p instanceof Sozlesmeli) {
                System.out.println(i + ". eleman : Sozlesmeli");
            } else if (p instanceof Kadrolu) {
                System.out.println(i + ". eleman : Kadrolu");
            } else if (p instanceof Memur) {
                System.out.println(i + ". eleman : Memur");
            } else if (p instanceof Isci) {
                System.out.println(i + ". eleman : Isci");
            } else {
                System.out.println(i + ". eleman : Personel");
            }
        }
    }

    void hangiTurElemanKacAdetVar() {
        int[] array = new int[5];

        for (int i = 0; i < personelListesi.size(); i++) {
            Personel p = personelListesi.get(i);

            if (p instanceof Sozlesmeli) {
                array[3]++;
            } else if (p instanceof Kadrolu) {
                array[4]++;
            }
            
            if (p instanceof Memur) {
                array[2]++;
            } else if (p instanceof Isci) {
                array[1]++;
            }
            
            array[0]++;
        }
        System.out.println("Personel : " + array[0] + " Isci : " + array[1]
                + " Memur : " + array[2] + " Sozlesmeli : " + array[3] + " Kadrolu : " + array[4]);
    }

    int getToplamMaas() {
        int toplam = 0;
        for (int i = 0; i < personelListesi.size(); i++) {
            toplam += personelListesi.get(i).maas;
        }
        return toplam;
    }

}
