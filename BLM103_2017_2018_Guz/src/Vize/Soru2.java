/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vize;

/**
 *
 * @author anizam
 */
public class Soru2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int j = 0; j < 10; j++) {
            if (!rakamKontrol(j)) System.out.println(j);
        } 
    }
    static boolean rakamKontrol(int j){
        int rakam;
        boolean varMi=false;
        int i = 13215660;
        while (i > 0) {
                rakam = i % 10;
                if(rakam==j) {
                    varMi=true;
                    break;
                } 
                i = i / 10;
            }
        return varMi;
    }

}
