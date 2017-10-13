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
public class Ornek5 {
    public static void main(String[] args) {
        int a=15;
        String bolunme=(a%2==0 && a%5==0)?"hem 5'e hem 2'ye bolunur":
                (a%2==0)?"Sadece 2'ye bolunur":
                (a%5==0)?"Sadece 5'e bolunur":
                "ne 5'e ne de 2 bolunebilir";
        System.out.println(bolunme);
                
    }
}
