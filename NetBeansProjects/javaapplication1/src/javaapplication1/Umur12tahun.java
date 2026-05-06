package javaapplication1;
import java.util.Scanner;
public class Umur12tahun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan umur Anda: ");
        int umur = scanner.nextInt();
        int hargaTiket;
        if (umur >= 12) {
            System.out.println("Anda sudah berumur 12 tahun atau lebih.");
            hargaTiket = 18;
        } else {
            System.out.println("Anda belum berumur 12 tahun.");
            hargaTiket = 15;
        }
        System.out.println("Umur pelanggan: " + umur);
        System.out.println("Harga tiket anda: RM" + hargaTiket);
        scanner.close();
    }

}
