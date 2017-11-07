/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders07.Ornek3;

/**
 *
 * @author anizam
 */
public class Test {
    public static void main(String[] args) {
        Sayi s=new Sayi();
        int i=5;
        s.artir(i);
        System.out.println("D?? say?: "+i);
        
        Araba a=new Araba();
        
        Araba digerAraba=new Araba();
        digerAraba.hiz=50;
        a.hizlandir(digerAraba);
        System.out.println("Metot D???: "+digerAraba.hiz);
        
    }
}
