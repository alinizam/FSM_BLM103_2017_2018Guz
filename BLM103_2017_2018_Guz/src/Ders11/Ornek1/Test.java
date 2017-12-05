/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders11.Ornek1;

/**
 *
 * @author anizam
 */
public class Test {
    public static void main(String[] args) {
        Araba a=new Araba();
       
        System.out.println("Araba son hiz = "+a.anlikHiz);
        Mercedes m=new Mercedes();
        Tofas t=new Tofas();

        System.out.println(m);
        
        System.out.println("Mercedes son hiz = "+m.anlikHiz);
        
        for (int i = 0; i < 10; i++) {
            a.hizlan();
            System.out.println(a.anlikHiz);
        }
        
         for (int i = 0; i < 10; i++) {
            m.hizlan();
            System.out.println(m.anlikHiz);
        }
    }
   
}
