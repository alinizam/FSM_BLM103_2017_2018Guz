/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders10Lab;

/**
 *
 * @author anizam
 */
public class Malzeme {

    String adi;
    int fiyat;

    public Malzeme(String adi, int fiyat) {
        this.adi = adi;
        this.fiyat = fiyat;

        Fabrika.malzemeEkle(this);
    }
    
    public Malzeme(Malzeme m) {
        this.adi = m.adi;
        this.fiyat = m.fiyat;
        
        Fabrika.malzemeEkle(this);
    }

}
