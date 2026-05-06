package javaapplication1;

import java.util.Scanner;
public class PurataNombor {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
       System.out.print("Masukkan Nombor 1: ");
       double num1 = input.nextDouble();

       System.out.print("Masukkan nombor 2: ");
        double num2 = input.nextDouble();

        System.out.print("Masukkan nombor 3: ");
        double num3 = input.nextDouble();

        double jumlah = num1 + num2 + num3;
        double purata = jumlah / 3.0;
        
        System.out.println("Purata bagi tiga nombor ini ialah: " + purata);
        input.close();
        

    }
}
