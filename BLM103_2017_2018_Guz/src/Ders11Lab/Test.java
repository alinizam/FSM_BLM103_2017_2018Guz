/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders11Lab;

public class Test {

    public static void main(String[] args) {
        Personel p1 = new Memur();
        // System.out.println(((Memur)p1).discipline);

        Personel p2 = new Isci();
        Personel p3 = new Kadrolu();
        Personel p4 = new Sozlesmeli();
        Personel p5 = new Personel(300);

        Fabrika f1 = new Fabrika();
        f1.personelEkle(p1);
        f1.personelEkle(p2);
        f1.personelEkle(p3);
        f1.personelEkle(p4);
        f1.personelEkle(p5);

        //   System.out.println(p1 instanceof Isci);
        f1.hangiTurElemanlarVar();
        f1.hangiTurElemanKacAdetVar();

        System.out.println(p4.maas);
        
        System.out.println("toplam odenen maas : " + f1.getToplamMaas());
    }
}
