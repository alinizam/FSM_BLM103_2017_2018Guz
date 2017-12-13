/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders12.Ornek3;

/**
 *
 * @author anizam
 */
public class Musteri {
    private String firma;
    private String adi;
    private int yas;
    
    void firmaGoster(){
        Musteri m=new Musteri();
        System.out.println(m.firma);
    }
      
    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public String getFirma() {
        return firma;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }
    
    
            
}
