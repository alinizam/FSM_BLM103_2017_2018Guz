/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders10;

import java.util.ArrayList;

/**
 *
 * @author anizam
 */
public class Ornek4 {
    public static void main(String[] args) {
          ArrayList<Personel> calisanlar=new ArrayList() ;
          Personel p=new Personel();
          p.adi="Ahmet";
          calisanlar.add(p);
          calisanlar.add(p);
          for (Personel calisan : calisanlar) {
            System.out.println(calisan.adi);
        }
    }
}
