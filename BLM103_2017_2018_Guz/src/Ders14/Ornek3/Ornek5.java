/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders14.Ornek3;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author anizam
 */
public class Ornek5 {

    public static void main(String[] args) {
        ArrayList<Integer> sayilar = new ArrayList();
        sayilar.add(10);
        sayilar.add(1);
        sayilar.add(6);
        sayilar.add(3);
        System.out.println(sayilar.stream().filter(x -> x > 5).mapToInt(x -> x).sum());

    }
}
