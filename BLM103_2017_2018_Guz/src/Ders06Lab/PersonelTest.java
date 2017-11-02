/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders06Lab;

/**
 *
 * @author anizam
 */
public class PersonelTest {
    public static void main(String[] args) {
        Personel p=new Personel();
        p.adi="Ahmet";
       // p.soyadi="AK";
        //System.out.println(p.adi+" "+p.soyadi);
        p.ismiGoster();
        System.out.println(p.ismiBul());
        
       
        System.out.println(p.ismiBul() + p.ismiBul() + 5*3);
    }
    
}
