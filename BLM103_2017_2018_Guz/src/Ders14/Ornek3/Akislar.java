/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders14.Ornek3;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author anizam
 */
public class Akislar {

    public static void main(String[] args) {
        ArrayList<Integer> sayilar = new ArrayList();
        Random r = new Random();
        for (int i = 0; i < 1000000; i++) {
            sayilar.add(r.nextInt(10));
        }
        long start, end;

        int sayac = 0;
        start = System.nanoTime();
        for (Integer sayi : sayilar) {
            if (sayi == 10) {
                sayac++;
            }
        }
        end = System.nanoTime();
        System.out.println(sayac);
        System.out.println("Klasik süre" + (end - start));
        long klasikSure=end - start;    
        start = System.nanoTime();
        System.out.println(sayilar.stream().filter(x -> x == 10).count());
        end = System.nanoTime();
        System.out.println("Stream süre" + (end - start));
        long streamSure=end - start;   
        System.out.println("Oran:"+ (streamSure/klasikSure));
    }
}
