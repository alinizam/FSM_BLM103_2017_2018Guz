/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders12Lab;

/**
 *
 * @author anizam
 */
public class Test {
    public static void main(String[] args) {
        IHareket hareketliNesne = new Pencere();
        
        System.out.println("hareket öncesi x : " + hareketliNesne.getX());
        hareketliNesne.hareketEt(10);
        System.out.println("hareket sonras? x : " + hareketliNesne.getX());
      
        
         
        hareketliNesne = new Buton();
        
        System.out.println("hareket öncesi x : " + hareketliNesne.getX());
        hareketliNesne.hareketEt(10);
        System.out.println("hareket sonras? x : " + hareketliNesne.getX());
        
        Buton buton3 = new Buton();
        ((IHareket)buton3).getX();
        
        
        Ekran ekran = new Ekran();
        
        ekran.nesneEkle(hareketliNesne);
        ekran.nesneEkle(new Buton());
        ekran.nesneEkle(new Pencere());
        
        System.out.println("toplam alan : " + ekran.toplamAlan());
      
        
        hareketliNesne = new Buton();
          
        IHareket hareketliPencere = new Pencere();
        hareketliPencere.setXY(10, 20);
              
        System.out.println("hareket öncesi x : " + hareketliNesne.getX());
        System.out.println("hareket öncesi y : " + hareketliNesne.getY());

        ((Buton)hareketliNesne).butonHareket(hareketliPencere, 10);
        System.out.println("hareket sonras? x : " + hareketliNesne.getX());
        System.out.println("hareket sonras? y : " + hareketliNesne.getY());
   
    }
}
