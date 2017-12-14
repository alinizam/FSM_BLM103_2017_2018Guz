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
public interface IHareket {
    void hareketEt(int location);
    void setXY(int x, int y);
    int getX();
    int getY();
    
    int getAlan();
}
