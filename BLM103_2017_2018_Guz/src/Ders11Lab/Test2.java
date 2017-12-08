/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders11Lab;

public class Test2 {

    public static void main(String[] args) {
        Personel p1 = new Isci();

        Isci m = (Isci) p1;
        System.out.println(m.overTimePayment);

        System.out.println(p1 instanceof Isci);
        System.out.println(p1 instanceof Personel);

        Isci p2 = new Isci();
        Kadrolu p3 = new Kadrolu();
        Sozlesmeli p4 = new Sozlesmeli();
        Personel p5 = new Personel(3000);

        Fabrika f1 = new Fabrika();
        f1.personelEkle(p1);
        f1.personelEkle(p2);
        f1.personelEkle(p3);
        f1.personelEkle(p4);
        f1.personelEkle(p5);

        //   System.out.println(p1 instanceof Isci);
        f1.hangiTurElemanlarVar();
        f1.hangiTurElemanKacAdetVar();

        // System.out.println(((Kadrolu)f1.personelListesi.get(0)).degree);
        System.out.println(p4.maas);

        System.out.println("toplam odenen maas : " + f1.getToplamMaas());

        p2.addAylikMaas(new AylikMaas(1, 1000));
        p2.addAylikMaas(new AylikMaas(2, 1200));
        p2.addAylikMaas(new AylikMaas(3, 1800));

        System.out.println("p4 toplam maas : " + p2.getToplamMaas());
        p2.setYeniMaas();

        System.out.println("p4 yeni toplam maas : " + p2.getToplamMaas());

        p2.yeniMaas();
        System.out.println("p4 son toplam maas : " + p2.getToplamMaas());
    }
}
