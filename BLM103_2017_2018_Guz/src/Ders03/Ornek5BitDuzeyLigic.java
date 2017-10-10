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
public class Ornek5BitDuzeyLigic {
    public static void main(String[] args) {
        int i=0b1010;
        int j=0b0111;
        System.out.println("Veya:"+(i | j));  //   1111
        System.out.println("Veya:"+(i & j));  //   0010
        System.out.println("Veya:"+(~i));     // 1 0101
        System.out.println("Veya:"+(i^j));     //  1101
        
    }
}
