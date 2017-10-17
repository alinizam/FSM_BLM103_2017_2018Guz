/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders04;

/**
 *
 * @author anizam
 */
public class Ornek6 {
    public static void main(String[] args) {
        int not=-60;
        String harfNot;
        if (not >= 70 && not <= 100)  harfNot="AA";    
        else if (not >= 40 && not < 80) harfNot="CC"; 
        else if (not >= 0 && not < 40) harfNot="DD"; 
        else harfNot="Hata";   
        
        System.out.println(harfNot);
    }
}
