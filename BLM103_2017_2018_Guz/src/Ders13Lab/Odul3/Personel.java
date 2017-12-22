/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders13Lab.Odul3;

import java.util.ArrayList;

/**
 *
 * @author anizam
 */
public class Personel {

    String unvan;
    ArrayList<Odul> oduller = new ArrayList<>();

    public class AltOdul extends Odul {

        @Override
        void odulEkle() {
            AltOdul yeniOdul = new AltOdul();

            if (unvan.equals("Memur")) {
                yeniOdul.miktar = 1000;
            } else if (unvan.equals("??çi")) {
                yeniOdul.miktar = 1500;
            }

            oduller.add(yeniOdul);
        }

        @Override
        public String toString() {
            return "" + miktar; 
        }

        @Override
        Odul enYuksekOduluBul() {
            Odul enYuksekOdul=oduller.get(0);
            for (Odul odul : oduller) {
                if (odul.miktar>enYuksekOdul.miktar)
                    enYuksekOdul=odul;
            }
            return enYuksekOdul;
        }

        @Override
        void personelOdulEkle(Personel p) {
              AltOdul yeniOdul = p.new AltOdul();
              yeniOdul.odulEkle();
        }

    }
}
