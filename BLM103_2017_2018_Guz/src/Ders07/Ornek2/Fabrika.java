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
public class Fabrika {
       String renk;
       Araba arabaUret(){
           Araba a=new Araba();
           return a;        
       }
       
       Araba modelliArabaUret(String pModel){
           Araba modelliAraba=new Araba();
           modelliAraba.model=pModel;
           return modelliAraba;        
       }
       
       Araba modeliDegistir(Araba eskiModelAraba, String yeniModel){
           eskiModelAraba.model=yeniModel;
           return eskiModelAraba;
       }
       
      Araba rengiDegistir(Araba araba, String renk){
          araba.renk=renk;
          return araba;
      }
      
      
       
}
