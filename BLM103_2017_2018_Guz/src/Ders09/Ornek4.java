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
public class Ornek4 {
    public static void main(String[] args) {
        //içinde 1 olmayan sat?rlar? yazd?r?n?z.
        int matris[][]=new int[3][4];
        matris[0][0]=1;
        matris[0][1]=2;
        matris[0][2]=1;
        matris[2][3]=1;
        for (int i = 0; i < matris.length; i++) {
            boolean varMi=false;
            for (int j = 0; j < matris[i].length; j++) {
                if (matris[i][j]==1){
                    varMi=true;
                    break;
                }
            }
            if(!varMi) System.out.println(i+"inci sat?rda 1 yok.");
        }      
    }
}
