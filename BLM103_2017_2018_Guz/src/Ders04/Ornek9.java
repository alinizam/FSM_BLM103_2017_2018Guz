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
public class Ornek9 {

    public static void main(String[] args) {
        boolean maasArtisinaUygun;
        int maas = 5000, girisYili = 2000;
        String unvan = "MEMUR";

        maasArtisinaUygun = (maas < 1000 && girisYili <= 2000 || unvan == "MEMUR");

        if (maasArtisinaUygun) {
            maas += maas * 0.5;
        }
    }

}
