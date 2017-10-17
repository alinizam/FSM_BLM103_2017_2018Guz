/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders04;

import java.util.Scanner;

/**
 *
 * @author anizam
 */
public class Ornek15 {
    public static void main(String[] args) {
        //-1 yazana kadar klavyeden girilen say?lar?n toplam?n? ekrana yazd?r?n?z.
        Scanner s=new Scanner(System.in);
        System.out.println("Bir say? giriniz.");
        int x=s.nextInt();
        int toplam=0;
        while(x!=-1){
            toplam+=x;
            System.out.println("Toplam = "+toplam);
            System.out.println("Bir say? daha giriniz.");
            x=s.nextInt();
        }
             
    }
    
}
