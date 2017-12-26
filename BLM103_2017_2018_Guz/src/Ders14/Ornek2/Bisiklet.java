/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders14.Ornek2;

/**
 *
 * @author anizam
 */
public class Bisiklet {
    int hiz;
    void hizlan(){
        int araHiz;
        class Hizlandirici implements IHareket{
            public void hizlan() {
               hiz++;
            }
        }
        Hizlandirici h=new Hizlandirici();
        h.hizlan();
    }
}
