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
public class Ornek5 {
      public static void main(String[] args) {
        //Sat?r toplamlar?n? yazd?r?n?z.
        int matris[][]=new int[3][4];
        matris[0][0]=1;
        matris[0][1]=2;
        matris[0][2]=1;
        matris[2][3]=1;
        for (int i = 0; i < matris.length; i++) {
            int toplam=0;
            for (int j = 0; j < matris[i].length; j++) {
                System.out.print(matris[i][j]+" ");
                toplam+=matris[i][j];
            }
            System.out.println("toplam = "+toplam);
        } 
    }
}
