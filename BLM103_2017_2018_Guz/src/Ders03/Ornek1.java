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
public class Ornek1 {
    public static void main(String[] args) {
        int i=5;
        i= (i=i+6)+10;  //Tercih edilmez.
        System.out.println("i: "+ i);
    }
}
