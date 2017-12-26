/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders14.Ornek1;

/**
 *
 * @author anizam
 */
public class Test {
    public static void main(String[] args) {
        UstSinif u=new UstSinif();
        u.yaz();
        UstSinif.IcSinif icSinif=u.new IcSinif();
        icSinif.degiskenYaz();
        (u.new IcSinif()).degiskenYaz();
        
        UstSinif.statikGomuluSinif s=new UstSinif.statikGomuluSinif();
        UstSinif.statikGomuluSinif.firma="FSMVÜ";
         
    }
}
