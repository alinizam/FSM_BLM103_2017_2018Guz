/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders13.Ornek5;

/**
 *
 * @author anizam
 */
public class Kare extends GrafikNesne {

    @Override
    int getAlan() {
        return getX()*getX(); 
    }
    
}
