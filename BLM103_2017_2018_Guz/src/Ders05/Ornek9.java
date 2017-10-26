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
public class Ornek9 {
    public static void main(String[] args) {
        char yazilacakChar=(char)97;
        disDongu:
        for (int i = 1; i <= 5; i++) {
            System.out.print(i+" ");
            for (int j = 1; j <=4; j++) {
                yazilacakChar++;
                if(yazilacakChar=='q'){
                    break disDongu;
                }
                System.out.print(yazilacakChar+" ");
                
            }
            System.out.println("");
        }
  
 
    }
}
