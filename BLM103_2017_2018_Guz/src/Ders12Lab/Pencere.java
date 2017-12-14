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
public class Pencere implements IHareket {
    private int x, y;

    @Override
    public void hareketEt(int location) {
        this.x = location + 10;
    }

    @Override
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }

    @Override
    public int getAlan() {
        return 1;
    }

}
