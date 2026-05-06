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
public class Haziq {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Siapakah nama anda?: ");
        String nama= input.next();
         System.out.println("Berapakah Umur anda?: ");
        int umur = input.nextInt();
        System.out.println("Apakah Hobi anda?: ");
        String Hobi = input.next();
        
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur + " tahun");
        System.out.println("Hobi: " + Hobi);
        input.close();
        
    }
    
}

    
