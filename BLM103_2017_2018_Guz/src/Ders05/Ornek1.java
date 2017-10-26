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
public class Ornek1 {
    public static void main(String[] args) {
        int i=1;
        char yazilacakChar=(char)97;
        while(i<=5){
            System.out.print(i+" ");
            int j=0;
            while(j<4){ // 4 sutun yaz
               System.out.print(yazilacakChar+" ");
               yazilacakChar++;
               j++; 
            }
            i++;
            System.out.println("");
        }   
    }
}
