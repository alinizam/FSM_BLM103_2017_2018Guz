/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders14.Ornek3;

/**
 *
 * @author anizam
 */
public class HesapMakine {

    void hesaplaVeSonucunuYazdir(int a, int b) {
        IHesap topla = (x, y) -> x + y;
        islemYap(a, b, topla);

        IHesap cikar = (x, y) -> x - y;
        islemYap(a,b,cikar);

        IHesap carp = (x, y) -> x * y;
        islemYap(a,b,carp);
        
    }
   
    void islemYap(int a,int b,IHesap arayuz){
        System.out.println(arayuz.hesapla(a, b));
    }
    
}
