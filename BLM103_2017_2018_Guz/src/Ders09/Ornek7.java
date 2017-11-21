/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders09;

/**
 *
 * @author anizam
 */
public class Ornek7 {
    public static void main(String[] args) {
        int[][] sayilar={{1,2},{1,3},{6,6}};
        for (int i = 0; i < sayilar.length; i++) {
            for (int j = 0; j <sayilar[i].length ; j++) {
                System.out.print(sayilar[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
