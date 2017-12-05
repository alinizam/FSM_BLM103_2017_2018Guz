/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders11.Ornek3;

/**
 *
 * @author anizam
 */
public class Arazi extends Araba{
    int yukseklik;

    public Arazi() {
    }

    public Arazi(int yukseklik) {
        this.yukseklik = yukseklik;
    }
    
    int getFiyat(){
        return 200000;
    }
    int getYukseklik(){
        return yukseklik;
    }
}
