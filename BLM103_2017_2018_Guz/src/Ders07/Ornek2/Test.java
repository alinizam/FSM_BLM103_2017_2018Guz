/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders07.Ornek2;

/**
 *
 * @author anizam
 */
public class Test {
    public static void main(String[] args) {
        Fabrika f=new Fabrika();
        Araba araba=f.arabaUret();
        araba.anlikHiz=50;
        
        Araba sahin=f.modelliArabaUret("?ahin");
        System.out.println(sahin.model);
        
        Araba eskiModel=f.modelliArabaUret("?ahin");
        Araba yeniAraba=f.modeliDegistir(eskiModel, "F12");
        
        System.out.println(yeniAraba.model);
        
        System.out.println(f.rengiDegistir(araba, "K?rm?z?").renk);
        
    }
}
