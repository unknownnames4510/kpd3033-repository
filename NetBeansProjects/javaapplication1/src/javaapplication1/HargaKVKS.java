package javaapplication1;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ruby Hoshino Anime
 */
import java.util.Scanner;
public class HargaKVKS {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        double hargaAsal = 85.69;
        double peratus = hargaAsal /4.0;
        double baki = 0.75;
        double hargaAkhir = hargaAsal * baki;
        
        System.out.println("Harga Asal: RM " + hargaAsal);
        System.out.println("Harga Selepas Diskaun 25%: RM " + hargaAkhir);
        System.out.println("Peratus Diskaun: " + peratus);
        input.close();
    }
}