/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders03;

/**
 *
 * @author anizam
 */
public class Ornek3ArttirmaAzaltma {
    public static void main(String[] args) {
        int x=3,y;
        x+=5;   //x=x+5;
        
        x--;
        System.out.println(x);
        
        
        x=2;
        y=3*(x++)-2*(--x);
        System.out.println("y: "+y +"     x:"+x);
        
                
    }
}
