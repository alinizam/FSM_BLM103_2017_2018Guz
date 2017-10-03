/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders2;

import java.util.Scanner;

/**
 *
 * @author anizam
 */
public class Ornek6Boolean {
    public static void main(String[] args) {
        boolean maasUygunMu=false;
        int maas=2000,asgariUcret=2000;
        maasUygunMu=(maas>asgariUcret);
        System.out.println("Maa? uygun mu? " +maasUygunMu);
        boolean esitMi;
        esitMi=(maas==asgariUcret);
        System.out.println("Esit mi?"+esitMi);
        /*ileride anlat?lacak
        System.out.print("Bir maa? giriniz:");
        Scanner s=new Scanner(System.in);
        maas=s.nextInt();
        System.out.print("Asgari ücreti giriniz:");
        asgariUcret=s.nextInt();*/
       
                
        
        
    }
}
