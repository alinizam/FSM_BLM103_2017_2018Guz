/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders11.Ornek2;

/**
 *
 * @author anizam
 */
public class BilgisayarOgrenci extends Ogrenci {

    public BilgisayarOgrenci(String adi, String soyadi) {
        super(adi, soyadi);
        System.out.println("Alt sinif yapicisi ça?rildi.");
    }
    
    @Override
    public String toString() {
        return adi; //To change body of generated methods, choose Tools | Templates.
    }

}
