/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders06Lab;

/**
 *
 * @author anizam
 */
public class Personel {
    String adi,soyadi;
    void ismiGoster(){
        if (soyadi==null)
            soyadi="XXX";
        System.out.println(adi+" "+soyadi);
    }
    String ismiBul(){
        return adi+" "+soyadi;
    }
    
}
