package javaapplication1;
import java.util.Scanner;
public class LatihanSwitchCase1 {
       public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double nombor1, nombor2, hasil = 0;
        int pilihan;
        boolean operasiSah = true;
        
        System.out.println("\nSila Pilih Operasi:");
        System.out.println("1. Tambah (+)");
        System.out.println("2. Tolak (-)");
        System.out.println("3. Darab (*)");
        System.out.println("4. Bahagi (/)");
        System.out.print("Masukkan pilihan (1-4): ");
        pilihan = input.nextInt();

        System.out.println("=== KALKULATOR RINGKAS ===");
        System.out.print("Masukkan nombor pertama: ");
        nombor1 = input.nextDouble();
        System.out.print("Masukkan nombor kedua: ");
        nombor2 = input.nextDouble();

        System.out.println("---------------------------");

        switch (pilihan) {
            case 1:
                hasil = nombor1 + nombor2;
                System.out.println("Operasi: Tambah");
                break;

            case 2:
                hasil = nombor1 - nombor2;
                System.out.println("Operasi: Tolak");
                break;

            case 3:
                hasil = nombor1 * nombor2;
                System.out.println("Operasi: Darab");
                break;

            case 4:
                System.out.println("Operasi: Bahagi");
                if (nombor2 != 0) {
                    hasil = nombor1 / nombor2;
                } else {
                    System.out.println("Ralat: Tidak boleh bahagi dengan kosong (0)!");
                    operasiSah = false;
                }
                break;

            default:
                System.out.println("Pilihan tidak sah! Sila pilih 1 hingga 4.");
                operasiSah = false;
                break;
        }

        if (operasiSah) {
            System.out.println("KEPUTUSAN: " + hasil);
        }
        
        System.out.println("---------------------------");
        input.close();
    }
}
