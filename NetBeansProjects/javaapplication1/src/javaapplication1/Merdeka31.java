package javaapplication1;
import java.util.Scanner;
public class Merdeka31 {
    public static void main(String[] args) {
        final int TAHUN_MERDEKA = 1957;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Penentu Status Kelahiran Merdeka");
        System.out.print("Sila masukkan TAHUN kelahiran anda: ");
        int tahunLahir = scanner.nextInt();        
        String status;
        if (tahunLahir < TAHUN_MERDEKA) {
            status = "Anda dilahirkan SEBELUM tahun Merdeka.";
        } 
        else if (tahunLahir > TAHUN_MERDEKA) {
            status = "Anda dilahirkan SELEPAS tahun Merdeka.";
        } 
        else {
                status = "Anda dilahirkan PADA TAHUN Merdeka!";
        }
        System.out.println("Tahun Lahir: " + tahunLahir);
        System.out.println("Tahun Merdeka: " + TAHUN_MERDEKA);
        System.out.println("Status: " + status);
        scanner.close();
    }

}
