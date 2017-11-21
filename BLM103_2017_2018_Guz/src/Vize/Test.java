/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vize;

/**
 *
 * @author anizam
 */
public class Test {
    public static void main(String[] args) {
        Personel p1=new Personel();
        Personel p2=new Personel();
        p1.unvan="A";
        p2.unvan="B";
        p1.unvanDegistir(p1, p2);
        System.out.println(p2.unvan);
    }
    
}
