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
public class Ornek8 {
     public static void main(String[] args) {
        //Y?l?n geriye kalan aylar?n? yazd?r?n?z.
        int ayNo = 15;
        switch (ayNo) {
            case (1):
                System.out.println("Ocak"); 
            case (2):
                System.out.println("?ubat"); 
            case (3):
                System.out.println("Mart");
            case (4):
                System.out.println("Nisan");
            case (5):
                System.out.println("May?s");
            case (6):
                System.out.println("Haziran");
                break;
            default: System.out.println("Hatal? ay numaras?");
        }
    }
}
