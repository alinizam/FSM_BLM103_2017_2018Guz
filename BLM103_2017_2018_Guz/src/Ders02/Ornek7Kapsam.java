/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders02;

/**
 *
 * @author anizam
 */
public class Ornek7Kapsam {
    static int x=5;  
    public static  void main(String[] args) {
         x=6;
        {
            int x=3;
            System.out.println("x : "+x); 
            {
                {
                
                }
            }
        }
        
    }
   
}
