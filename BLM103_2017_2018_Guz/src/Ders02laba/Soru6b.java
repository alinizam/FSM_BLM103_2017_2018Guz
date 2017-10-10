/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders02laba;

/**
 *
 * @author anizam
 */
public class Soru6b {
    public static void main(String[] args) {
        double sayi=10.43;
        int ondalikBasamak=(int)((10*sayi)%10);
        System.out.println("Onadal?k ikiye bölüüyor mu? = "+ (ondalikBasamak%2==0));
        
    }
}
