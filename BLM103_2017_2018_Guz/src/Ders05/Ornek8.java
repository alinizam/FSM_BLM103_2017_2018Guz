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
public class Ornek8 {
    public static void main(String[] args) {
        int ilkDeger=-5, sonDeger=111656165;
        boolean araliktaSifirVarMi=false;
        for (int i = ilkDeger; i < sonDeger; i++) {
            System.out.println(i);
            if(i==0){
                araliktaSifirVarMi=true;
                break;
            }
        }
        System.out.println(araliktaSifirVarMi);
    }
}
