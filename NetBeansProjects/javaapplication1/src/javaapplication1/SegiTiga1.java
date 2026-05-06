/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Ruby Hoshino Anime
 */
import java.util.Scanner;
public class SegiTiga1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan tapak segi tiga (cth: 15.2): ");
        double Tapak = input.nextDouble();
         System.out.println("Masukkan tinggi segi tiga (cth: 20.0): \"");
        double Tinggi = input.nextDouble();
        double luas = 0.5 * Tapak * Tinggi;
        

        System.out.println("Tapak: " + Tapak + " cm");
        System.out.println("Tinggi: " + Tinggi + " cm");
        System.out.println("Luas segi tiga ialah: " + luas + " cm²");
        input.close();
        
    }
    
}
