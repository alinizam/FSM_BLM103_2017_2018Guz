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
public class Ornek7a {

    public static void main(String[] args) {
        int a = 7;
        int b = 8;
        int tmp;
        System.out.println("a'nin degeri= " + a);
        System.out.println("b'nin degeri= " + b);
        System.out.println();
        
        tmp = a;
        a = b;
        b = tmp;
        
        System.out.println("a'nin yeni degeri= " + a);
        System.out.println("b'nin yeni degeri= " + b);
    }
}
