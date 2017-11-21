/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vize;

/**
 *
 * @author anizam
 */
public class Personel {
    String adi,soyadi,unvan;
    void unvanDegistir(Personel p1, Personel p2){
        String tempUnvan=p1.unvan;
        p1.unvan=p2.unvan;
        p2.unvan=tempUnvan;
    }    
}
