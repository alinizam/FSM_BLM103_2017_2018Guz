/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders2laba;

/**
 *
 * @author anizam
 */
public class Soru6 {
    public static void main(String[] args) {
        double sayi=10.43;
        double kusurat=sayi-(int)sayi;
        int ondalikBasamak=(int)(kusurat*10);
        
        System.out.println("Onadal?k ikiye bölüüyor mu? = "+ (ondalikBasamak%2==0));
        
        
        
    }
}
