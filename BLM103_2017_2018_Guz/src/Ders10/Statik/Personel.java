/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders10.Statik;

/**
 *
 * @author anizam
 */
public class Personel {
    static final String ULKE="Türkiye";
    String adi, soyadi;
    int maas;
    static String firma;
    static int personelSayisi;

    public Personel() {
        personelSayisi++;
    }
    static String getFirma(){
     
    //  Çal??mayan kod.
    //  int toplamMaas=maas;
        return firma +"' firmasinda calisan personel sayisi "+ personelSayisi;
    }
    
    void getPersonelFirma(){
           System.out.println(getFirma());
    }
    static{
        firma="FSMVÜ";
    }
    
}
