/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders03Lab;

/**
 *
 * @author anizam
 */
public class Ornek3 {
    public static void main(String[] args) {
        int i=163;
        int birler=i%10;
        i=i-birler;
        int sonuc=(birler<5)?i:i+10;
        System.out.println("Sonuc: "+sonuc);
    }
}
