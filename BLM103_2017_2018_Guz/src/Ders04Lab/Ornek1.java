/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders04Lab;

/**
 *
 * @author anizam
 */
public class Ornek1 {

    public static void main(String[] args) {
        double fiyat = 368.5;
        double indFiyat;
        if (fiyat < 200 && fiyat > 0) 
            indFiyat = fiyat * 0.9;
         else if (fiyat >= 200 && fiyat < 400) {
            indFiyat = fiyat * 0.85;
        } else {
            indFiyat = fiyat * 0.80;
        }
        System.out.println("net fiyat=" + indFiyat);
    }
}
