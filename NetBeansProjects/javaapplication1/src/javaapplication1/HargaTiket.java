package javaapplication1;
import java.util.Scanner;
public class HargaTiket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan umur Anda: ");
        int umur = scanner.nextInt();
        int hargaTiket;
        if (umur < 12) {
            hargaTiket = 15;
        } else {
            hargaTiket = 18;
        }
        System.out.println("Umur pelanggan: " + umur);
        System.out.println("Harga tiket anda: RM" + hargaTiket);
        scanner.close();
    }
}