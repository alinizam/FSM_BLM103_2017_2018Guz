/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders06;

/**
 *
 * @author anizam
 */
public class Fabrika {

    public static void main(String[] args) {
        Araba araba1;
        araba1 = new Araba();
        araba1.sonHiz = 500;
        araba1.motorHacmi = 1600;
        araba1.model = "Clio";

        Araba araba2;
        araba2 = araba1;
        araba2.model = "Kartal";
        System.out.println(araba1.model);

        Araba araba3 = new Araba();
        araba3.sonHiz = 200;
        System.out.println(araba3.model);

        System.out.println(araba2.toString());

        araba1 = araba3;
        System.out.println(araba1.model);

        System.out.println(araba1.toString());
        System.out.println(araba3.toString());
        System.out.println(araba2.toString());

        Araba araba4 = new Araba();
        araba4.sonHiz = 5;
        araba4.anlikHiz = 0;
        araba4.hizlan();
        araba4.hizlan();
        araba4.hizlan();
        araba4.hizlan();
        araba4.hizlan();
        araba4.hizlan();
        araba4.hizlan();
        araba4.hizlan();
        System.out.println(araba4.anlikHiz);
        
        
    }
}
