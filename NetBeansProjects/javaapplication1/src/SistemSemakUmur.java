import java.util.Scanner;
public class SistemSemakUmur {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Masukkan umur anda: ");
        int umur = input.nextInt();
        if (umur <13) {
            System.out.println("Anda adalah kanak-kanak.");
        } else if (umur<18) {
            System.out.println("Anda adalah remaja.");
        } else if (umur >18 && umur <=60) {
            System.out.println("Anda adalah dewasa.");
        } else {
            System.out.println("Anda adalah warga emas.");
            
        }
        input.close();
    }

}
