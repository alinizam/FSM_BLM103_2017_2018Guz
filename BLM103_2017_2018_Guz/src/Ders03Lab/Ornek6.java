/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders03Lab;

/**
 *
 * @author anizam
 */
public class Ornek6 {
    public static void main(String[] args) {
        int number = 45;
        
        String result = (number % 5 == 0 && number % 2 == 0) ? "Hem 5 hem 2":
                        (number % 5 == 0)? "Sadece 5":
                        (number % 2 == 0)? "Sadece 2":"Ne 5 ne 2";
        
        System.out.println(result);
    }
}
