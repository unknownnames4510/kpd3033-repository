package javaapplication1;
import java.util.Scanner;
public class AmaliDoWhile {
    public static void main(String[] args) {
        int hari;
        int gaji = 160;
        int jumlah;
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nama: ");
        String nama = input.nextLine();
    do {
        System.out.println("Masukkan bilangan hari kerja: ");
        hari = input.nextInt();
        if (hari > 31) {
            System.out.println("Jumlah hari kerja tidak boleh melebihi 31 hari. Silakan coba lagi.");
        }
    } while (hari > 31);
        jumlah = gaji * hari;
        System.out.println("Rumusan gaji yang diperoleh:");
        System.out.println("Nama: " + nama);
        System.out.println("Jumlah gaji: RM " + jumlah);
        input.close();
    }
}
