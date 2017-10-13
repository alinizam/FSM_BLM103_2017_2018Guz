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
public class Ornek2_a {
    public static void main(String[] args) {
        int a = 24;
        int b = 26;
        int c = 2;
        
        int max;
        
        max = (a>b)? a:b;
        max = (max>c)? max:c;
        
        System.out.println("max : " + max);
    }
}
