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
class Araba {
    String model;
    int motorHacmi;
    int sonHiz;
    int anlikHiz;
    void hizlan(){
        if (anlikHiz+1<=sonHiz)
            anlikHiz++;
    }
}
