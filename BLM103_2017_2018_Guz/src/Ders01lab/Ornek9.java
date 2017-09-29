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
public class Ornek9 {

    public static void main(String[] args) {
        int f0 = 0, f1 = 1, f2;
        f2 = f1 + f0;
        System.out.println("f0:" + f0 + " f1:" + f1);

        f0 = f1;
        f1 = f2;
        f2 = f1 + f0;

        System.out.println("f0:" + f0 + " f1:" + f1);

        f0 = f1;
        f1 = f2;
        f2 = f1 + f0;

        System.out.println("f0:" + f0 + " f1:" + f1);

        f0 = f1;
        f1 = f2;
        f2 = f1 + f0;

        System.out.println("f0:" + f0 + " f1:" + f1);

      
    }
}
