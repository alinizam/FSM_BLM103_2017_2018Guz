/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders03;

/**
 *
 * @author anizam
 */
public class Ornek6BitKaydirma {
    public static void main(String[] args) {
        int i=5; //101
        System.out.println(i<<3);
        i=i<<3;
        System.out.println(i);
        int j=10;
        System.out.println(j>>5);
        
        int k=-0b1100;
        System.out.println(k);
        System.out.println(k>>>1);
        
    }
}
