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
public class Ornek4 {
    public static void main(String[] args) {
        int not = 50;
        
        if (not >= 70 && not <= 100) System.out.println("AA");
        else if (not >= 40 && not < 80) System.out.println("CC");
        else if (not >= 0 && not < 40) System.out.println("FF");
        else System.out.println("Not hatal?");
    }
}
