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
public class Ornek16 {
   
    public static void main(String[] args){
        //-1 yazana kadar klavyeden girilen say?lar?n toplam?n? ekrana yazd?r?n?z.
        Scanner s=new Scanner(System.in);
        int x=0;
        int toplam=0;
        do{
            toplam+=x;
            System.out.println("Toplam = "+toplam);
            System.out.println("Bir say? daha giriniz.");
            x=s.nextInt();
        }while(x!=-1);
             
    } 
}
