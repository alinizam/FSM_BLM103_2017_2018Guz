/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders13.Ornek5;

/**
 *
 * @author anizam
 */
public class Test {
    public static void main(String[] args) {
        GrafikNesne g=new Kare();
        g.setX(5);
        g.setY(10);
        System.out.println(g.getAlan());
        
        
        g=new Ucgen();
        g.setX(6);
        g.setY(10);
        System.out.println(g.getAlan());
                
    }
  
}
