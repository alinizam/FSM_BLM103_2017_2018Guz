/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders03;

/**
 *
 * @author anizam
 */
public class Ornek8MantiksalOperatorler {
    public static void main(String[] args) {
        int maas=18000;
        char personel_turu='Y';
        //Memur ve maa? 2000'den küçükse maa??na zam yap?n?z.
        maas+=(personel_turu=='M' && maas<2000) || 
              (personel_turu=='Y' && maas<20000 ) 
              ? (maas*0.5):(0);
        System.out.println("Yeni Maa? : "+ maas);
        
    }
}
