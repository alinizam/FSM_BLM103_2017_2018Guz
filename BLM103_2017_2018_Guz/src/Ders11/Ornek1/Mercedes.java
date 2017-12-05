/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders11.Ornek1;

/**
 *
 * @author anizam
 */
public class Mercedes extends Araba {

    @Override
    void hizlan() {
        if (anlikHiz<sonHiz*0.7){
          super.hizlan();
          super.hizlan();
        }
    }
    
}
