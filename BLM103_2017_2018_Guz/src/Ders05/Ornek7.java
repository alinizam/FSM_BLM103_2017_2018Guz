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
public class Ornek7 {
    public static void main(String[] args) {
        //3000 olana kadar topla
        int toplam=0;
        int i;
        int kacinciAdimdaGectim=0;
        for (i = 0; i < 100; i++) {
            if(toplam+i<3000){
                toplam+=i;
                kacinciAdimdaGectim=i;
            }else{    
                break;
            }
        }
        System.out.println(i+" : "+kacinciAdimdaGectim+" : "+toplam);
    }
}
