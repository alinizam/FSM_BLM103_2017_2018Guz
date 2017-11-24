/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders09Lab;

/**
 *
 * @author anizam
 */
public class Ornek1c {

    public static void main(String[] args) {
        int arananSayi = 4;
        int[] arananDizi = {4, 7, 4, 3, 2, 4, 56, 89};

        int[] yeniDizi = indisler(4, arananDizi);
        
        for (int i = 0; i < yeniDizi.length; i++) {
            System.out.print(yeniDizi[i] + " ");
        }
    }
    
    static int[] indisler(int sayi, int[] dizi){
        int[] sonuc = new int[dizi.length];
        
        for (int i = 0; i < dizi.length; i++) {
            if(dizi[i] == sayi){
                sonuc[i] = 1;
            }   
        }
        return sonuc;
    }
}
