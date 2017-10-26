/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders05;

/**
 *
 * @author anizam
 */
public class Ornek12a {

    public static void main(String[] args) {
        //5'e bölüneneler hariç faktöriyel hesab?
        for (int i = 0; i < 15; i++) {
            if (i % 5 == 0) {
                continue;
            }
            int f = 1;
            for (int j = 1; j <= i; j++) {
                f = f * j;
            }
            System.out.println(i + ":" + f);

        }
    }
}
