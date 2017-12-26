/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders14.Ornek1;

/**
 *
 * @author anizam
 */
public class UstSinif {
    int a,b,c;
    static int x;
    void yaz(){
        IcSinif sinif=new IcSinif();
        sinif.degiskenYaz();
    }
    class IcSinif implements IIslem{
        int a;
        public void degiskenYaz() {
            System.out.println("De?i?ken yaz?ld? : "+UstSinif.this.a+""+b);
        }
        
    }
    
    static class statikGomuluSinif{
        static int x;
        static String firma;
         public void degiskenYaz() {
            System.out.println("De?i?ken yaz?ld? :"+ UstSinif.x);
        }
    
    }
    
}
