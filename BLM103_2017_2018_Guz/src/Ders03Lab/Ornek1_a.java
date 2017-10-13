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
public class Ornek1_a {
    public static void main(String[] args) {
        int ogrenciNotu = 8;
        
        String harfNotu =   (ogrenciNotu>70)?"AA":
                            (ogrenciNotu>40)?"CC":"FF";
        
        System.out.println("harf notu : " + harfNotu);
    }
}
