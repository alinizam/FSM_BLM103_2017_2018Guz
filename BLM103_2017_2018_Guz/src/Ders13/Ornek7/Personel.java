/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders13.Ornek7;

/**
 *
 * @author anizam
 */
public class Personel {
    String adi,soyadi;
    int  burut, kidem, derece, kademe;
    Maas getMaas(){
        return new Maas();
    }
    
    class Maas{
        int getMaas(){
            return burut*kidem*derece*kademe;
        }
    }
    String getFirma(){
        Firma f=new Firma();
        return f.getFirma();
    }
    
    static class Firma{
        String getFirma(){
            return "FSMVÜ";
        }
        int getBurut(){
            Personel p=new Personel();
            return p.burut;
        }
    }
}
