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
public class Markah {
    public static void main(String[] args) {
        int BM = 89 ;
        int BI = 90 ;
        int SEJ = 80 ;
        int MT = 100 ;

        int jumlah = BM + BI + SEJ + MT ;
        int purata = jumlah / 4 ;
        double peratus = (jumlah / 400.0 * 100);
        System.out.println("Jumlah Markah: " + jumlah);
        System.out.println("Purata Markah: " + purata);
        System.out.println("Peratus Markah: " + peratus + "%");
    }
    
}
