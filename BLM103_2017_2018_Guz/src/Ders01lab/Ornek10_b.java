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
public class Ornek10_b {
    public static void main(String[] args) {
        int number = 185;
      
    
        int birler, onlar,yuzler;
        birler=number%10;
        number = number/10;
        
        onlar=number%10;
        number=number/10;
        
        yuzler=number;
        number = birler*100 + 10*onlar+yuzler;
        System.out.println("sayinin tersi="+number);
    }
}
