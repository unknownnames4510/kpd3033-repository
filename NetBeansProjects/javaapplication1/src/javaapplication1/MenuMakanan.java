package javaapplication1;
import java.util.Scanner;
public class MenuMakanan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int menu;
        int kuantiti;
        double total = 0;
        int ulang = 1; 

        System.out.println("1. Nasi Lemak  (RM 5.00)");
        System.out.println("2. Nasi Goreng (RM 6.00)");
        System.out.println("3. Roti Canai  (RM 3.50)");
        System.out.println("4. Mee Goreng  (RM 5.50)");

        while (ulang == 1) {
            
            System.out.print("Masukkan Nombor Menu (1-4): ");
            menu = scanner.nextInt();

            System.out.print("Masukkan Kuantiti: ");
            kuantiti = scanner.nextInt();

            switch (menu) {
                case 1:
                    total = total + (5.00 * kuantiti);
                    break;
                case 2:
                    total = total + (6.00 * kuantiti);
                    break;
                case 3:
                    total = total + (3.50 * kuantiti);
                    break;
                case 4:
                    total = total + (5.50 * kuantiti);
                    break;
                default:
                    System.out.println("Menu tiada.");
                    break;
            }
            
            System.out.print("Nak order lagi? (1 = Ya, 0 = Tamat): ");
            ulang = scanner.nextInt();
        }
        System.out.println("JUMLAH: RM " + total);
        scanner.close();
    }
}