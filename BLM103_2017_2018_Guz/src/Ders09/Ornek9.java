/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders09;

import java.util.ArrayList;

/**
 *
 * @author anizam
 */
public class Ornek9 {
    public static void main(String[] args) {
        ArrayList iller=new ArrayList();
        iller.add("Ankara");
        iller.add("?stanbul");
        iller.add("Adana");
        for (Object iller1 : iller) {
            System.out.println(iller1);
        }
        for (int i = 0; i < iller.size(); i++) {
            System.out.println(iller.get(i));
        } 
        
        ArrayList<Personel> calisanlar=new ArrayList(); 
        
    }
    
}
