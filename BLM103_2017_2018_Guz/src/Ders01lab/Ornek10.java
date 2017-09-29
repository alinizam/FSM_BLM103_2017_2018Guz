/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders01lab;

/**
 *
 * @author anizam
 */
public class Ornek10 {
    public static void main(String[] args) {
        int number = 54;
        int mod = 10;
        
        int birler = number%mod;
        int onlar = number/mod;
        System.out.println("birler basama?? = " + birler);
        System.out.println("onlar basama?? = " + onlar);
        
        number = birler*10 + onlar;
        
        System.out.println("yeni say? = " + number);
    }
}
