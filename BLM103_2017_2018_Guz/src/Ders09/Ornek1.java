/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders09;

/**
 *
 * @author anizam
 */
public class Ornek1 {
    public static void main(String[] args) {
      /*int sayilar[]=new int[3];
        sayilar[0]=10;
        sayilar[1]=15;
        sayilar[2]=13;*/
        
        int sayilar[]={10,15,13};
        int aranan=13;
        boolean varMi=false;
        for (int i = 0; i < sayilar.length; i++) {
           if (sayilar[i]==aranan) {
               varMi=true;
               break;
           } 
        }
        System.out.println(varMi);
        
        for (int sayi : sayilar) {
            if (sayi==aranan) {
               varMi=true;
               break;
           } 
        }
        System.out.println(varMi);
    }
}
