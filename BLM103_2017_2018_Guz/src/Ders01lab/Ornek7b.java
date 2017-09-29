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
public class Ornek7b {

    public static void main(String[] args) {
        int a = 9;
        int b = 10;
        System.out.println("a'nin degeri= " + a);
        System.out.println("b'nin degeri= " + b);
        System.out.println();
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a'nin yeni degeri= " + a);
        System.out.println("b'nin yeni degeri= " + b);

    }
}
