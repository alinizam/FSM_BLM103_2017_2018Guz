/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders10;

import java.util.ArrayList;

/**
 *
 * @author anizam
 */
public class Ornek3 {
    public static void main(String[] args) {
        ArrayList<Integer> sayilar=new ArrayList();
        sayilar.add(15);
        sayilar.add(20);
        sayilar.add(25);
        
        int toplam=0;
        for (Integer sayi : sayilar) {
            toplam+=sayi;
        }
        System.out.println(toplam);
        
        
    }
}
