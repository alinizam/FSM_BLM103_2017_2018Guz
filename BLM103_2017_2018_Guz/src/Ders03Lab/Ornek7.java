/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders03Lab;

/**
 *
 * @author anizam
 */
public class Ornek7 {
    public static void main(String[] args) {
        // Bir say?n?n 5'ten küçük bölenleri
        int i=24;
        int bolen=1;
        bolen=(i%2==0?++bolen:bolen);
        bolen=(i%3==0?++bolen:bolen);
        bolen=(i%4==0?++bolen:bolen);
        System.out.println(bolen);
    }
}
