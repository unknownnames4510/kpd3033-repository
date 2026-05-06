package javaapplication1;
import java.util.Scanner;
public class LatihanTrialAmaliSwitchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int menu;
        double harga = 0;
        int kuantiti = 0;
        double jumlahBayaran = 0;
        System.out.println("===== SISTEM KIRA MENU =====");
        System.out.println("1. Nasi Lemak  (RM 5.00)");
        System.out.println("2. Nasi Goreng (RM 6.00)");
        System.out.println("3. Roti Canai  (RM 3.50)");
        System.out.println("4. Mee Goreng  (RM 5.50)");
        System.out.print("Masukkan Nombor Menu (1-4): ");
        System.out.println("============================");
        menu = input.nextInt();

        System.out.print("Masukkan Kuantiti: ");
        kuantiti = input.nextInt();

        switch (menu) {
                case 1:
                    harga = 5.00;
                    System.out.println(" Tambah: Nasi Lemak (x" + kuantiti + ")");
                    break;
                case 2:
                    harga = 6.00;
                    System.out.println(" Tambah: Nasi Goreng (x" + kuantiti + ")");
                    break;
                case 3:
                    harga = 3.50;
                    System.out.println(" Tambah: Roti Canai (x" + kuantiti + ")");
                    break;
                case 4:
                    harga = 5.50;
                    System.out.println(" Tambah: Mee Goreng (x" + kuantiti + ")");
                    break;
                default:
                    harga = 0;
                    System.out.println("Menu tidak tersedia.");
        }
        if (harga != 0) {
            jumlahBayaran = harga * kuantiti;
            System.out.printf("Jumlah Bayaran: RM %.2f\n", jumlahBayaran);
        } else {
            System.out.println("Tiada bayaran dikenakan.");
            }
        input.close();
        }
    }