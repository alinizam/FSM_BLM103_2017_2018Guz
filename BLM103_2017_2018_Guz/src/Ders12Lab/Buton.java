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
public class Buton implements IHareket {

    private int x, y;

    void butonHareket(Object nesne, int location) {
        if (nesne instanceof IHareket) {
            int yeniX = ((IHareket) nesne).getX() + location;
            int yeniY = ((IHareket) nesne).getY();
            setXY(yeniX, yeniY);
        }
    }

    @Override
    public void hareketEt(int location) {
        this.x = location + 5;
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
        return 2;
    }
}
