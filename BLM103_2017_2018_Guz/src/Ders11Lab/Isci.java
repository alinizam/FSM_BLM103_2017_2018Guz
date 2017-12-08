/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders11Lab;

public class Isci extends Personel {
    int overTimePayment;

    public Isci() {
        super(2500);
    }
    
    @Override
    void yeniMaas() {
        for (AylikMaas aylikMaas : maaslar) {
            aylikMaas.maas *= 1.2;
        }
    }
}
