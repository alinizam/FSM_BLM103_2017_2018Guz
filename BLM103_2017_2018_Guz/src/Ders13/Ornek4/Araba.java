/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders13.Ornek4;

/**
 *
 * @author anizam
 */
public class Araba implements IHareket {
    int hiz;
    int zaman;
    public int getHiz(){
        return this.hiz;
    }

    @Override
    public int getKonum() {
         return this.hiz*this.zaman;
    }
  
}
