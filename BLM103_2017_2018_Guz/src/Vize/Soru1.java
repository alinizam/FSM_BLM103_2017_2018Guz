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
public class Soru1 {
    public static void main(String[] args) {
        double maas=10000;
        int ayNo=3;
        switch(ayNo){
            case 1: maas=maas*1.1; break;
            case 2: maas=maas*1.1*1.1; break;
            case 3:case 4: case 5: case 6:  maas=maas*1.1*1.1*1.1; break;
        }
        
        if (ayNo==1) maas=maas*1.1; 
        else if (ayNo==2) maas=maas*1.1*1.1; 
        else if (ayNo>=3) maas=maas*1.1*1.1*1.1; 
        
    }
}
