/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders11.Ornek3;

/**
 *
 * @author anizam
 */
public class TestAltaDonusum {
    public static void main(String[] args) {
        Araba a=new Arazi();
        Arazi arazi=(Arazi)a;
       ((Arazi)a).yukseklik=10;
        yuksekligiYaz(a);
        
        Araba a1=new Sedan();
        yuksekligiYaz(a1);
    }
    static void yuksekligiYaz(Araba a){
        if (a instanceof Arazi){
            System.out.println(((Arazi)a).getYukseklik());
        }
        else{
            System.out.println("0");
        }
    }
}
