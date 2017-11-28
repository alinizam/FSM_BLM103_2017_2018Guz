/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders10.Yapici;

/**
 *
 * @author anizam
 */
public class Personel {
    int maas;
    String adi,soyadi;
    Personel(){
     
    }
    Personel(int maas1){
        System.out.println("yap?c? çal??t?");
        maas=maas1;
    }

    public Personel(int maas, String adi, String soyadi) {
        this.maas = maas;
        this.adi = adi;
        this.soyadi = soyadi;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Silindi");
        super.finalize(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
