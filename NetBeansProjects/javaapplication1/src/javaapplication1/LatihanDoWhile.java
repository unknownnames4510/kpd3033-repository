package javaapplication1;
import java.util.Scanner;
public class LatihanDoWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String Pengguna;
        int jam;
        double kadar = 3.50;
        double jumlah;
        do {
            System.out.println("Masukkan Nama Pengguna:");
            Pengguna = input.nextLine();
            System.out.println("Masukkan Bilangan Jam Bekerja:");
            jam = input.nextInt();

            if (jam > 40) {
                System.out.println("Masukkan Bilangan Jam lebih Dari 40");
            }

        } while (jam > 40);
        jumlah = jam * kadar;
            System.out.println("\n Nama Pengguna: " + Pengguna);
            System.out.println("Bilangan Jam Bekerja: " + jam);
            input.close();
            System.out.printf("Jumlah Gaji: RM %.2f\n", jumlah);
        }
    }
