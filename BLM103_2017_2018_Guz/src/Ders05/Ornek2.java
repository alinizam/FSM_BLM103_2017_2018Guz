/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders05;

/**
 *
 * @author anizam
 */
public class Ornek2 {
    public static void main(String[] args) {
        int i=1;
        char yazilacakKucukHarf=(char)97;
        char yazilacakBuyukHarf=(char)65;
        while(i<=5){
            System.out.print(i+" ");
            int j=0;
            while(j<4){ 
               if (i%2==1) {
                   System.out.print(yazilacakKucukHarf+" ");
                   yazilacakKucukHarf++;
               }else{
                   System.out.print(yazilacakBuyukHarf+" ");
                   yazilacakBuyukHarf++;
               }
               j++; 
            }
            i++;
            System.out.println("");
        }   
    }
}
