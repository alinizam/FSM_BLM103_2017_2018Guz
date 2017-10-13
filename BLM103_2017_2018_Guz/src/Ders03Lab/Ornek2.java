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
public class Ornek2 {
    public static void main(String[] args) {
        int a = 3000;
        int b = 2600;
        int c = 28000;
        
        int max;
        
        max = (a>b && a>c)? a:(b>c)? b:c;
        System.out.println("en büyük sayi="+max);
    }
}
