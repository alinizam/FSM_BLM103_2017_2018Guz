/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders07;

/**
 *
 * @author anizam
 */
public class Ornek4 {
    public static void main(String[] args) {
        Ornek4 o1=new Ornek4();
        System.out.println(o1.toString());
        Ornek4 o2=new Ornek4();
        o2=o1;
        
        System.out.println(o1.equals(o2));
                
    }
 
}
