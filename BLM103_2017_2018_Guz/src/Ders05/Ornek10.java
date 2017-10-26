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
public class Ornek10 {
    public static void main(String[] args) {
   
        dis:
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(i+","+j+" ");
                if(j==3 && i==3){
                    break dis;
                }        
            }
            System.out.println("");
        }     
    }
}
