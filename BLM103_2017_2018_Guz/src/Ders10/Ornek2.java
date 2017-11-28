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
public class Ornek2 {
    public static void main(String[] args) {
        ArrayList nesneler=new ArrayList();
        
        nesneler.add(new Personel());
        nesneler.add("Ankara");
        nesneler.add(15);
        for (Object nesne : nesneler) {
            System.out.println(nesne.toString());
        }
        System.out.println(nesneler.get(2));
        
        System.out.println(nesneler.indexOf("Ankara"));
        System.out.println(nesneler.contains("?zmir"));
    }
    
}
