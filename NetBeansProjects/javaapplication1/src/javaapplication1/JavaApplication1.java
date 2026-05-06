/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author azlem
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int BI = 89 ;
       int BM = 92 ;
       int SEJ = 90 ;
       int MT = 100 ;
       
       int Jumlah = BI+BM+SEJ+MT ;
       int Purata = Jumlah/4 ;
       double Peratus = (Jumlah/400.0)*100 ;
       
       System.out.println("Jumlah: " + Jumlah);
       System.out.println("Purata: " + Purata);
       System.out.println("Peratus: " + Peratus + "%");
       

        // TODO code application logic here
    }
    
}
