/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders04Lab;

/**
 *
 * @author anizam
 */
public class Ornek5 {

    public static void main(String[] args) {
        int sayi = 1;
        int toplam = 0;
        while (toplam < 3000 && sayi <= 100) {
            toplam += sayi;
            sayi++;
        }
        System.out.println(--sayi + ". sayida 3000 sayisi asimistir");
        System.out.println("toplam=" + toplam);
    }
}
