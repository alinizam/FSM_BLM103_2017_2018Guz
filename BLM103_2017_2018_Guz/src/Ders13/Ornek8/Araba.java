/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders13.Ornek8;

/**
 *
 * @author anizam
 */
public class Araba {
    String model;
    int arabaHiz, arabaSonHiz;
    String getPanelId(){
        class yerelPanel extends KontrolPanel{
            
        }
        yerelPanel yp=new yerelPanel();
        yp.hizKontrol(arabaHiz, arabaHiz);
    }
    
     String getPanelIdAnonim(){
        
        KontrolPanel yp=new KontrolPanel(){
        
        
        }
        yp.hizKontrol(arabaHiz, arabaHiz);
        
    }
    
    class icPanel extends KontrolPanel{

        @Override
        void hizKontrol(int hiz, int sonHiz) {
            if (model.equals("Ferrari"))
                System.out.println("H?z kontrolü gereksiz");
            else
               super.hizKontrol(hiz, sonHiz); 
        }
        
    }
}
