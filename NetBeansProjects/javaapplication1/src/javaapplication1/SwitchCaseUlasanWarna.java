package javaapplication1;
import java.util.Scanner;
public class SwitchCaseUlasanWarna {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama anda: ");
        String nama = input.nextLine();

        System.out.print("Masukkan Jantina (Lelaki/Perempuan): ");
        String jantina = input.nextLine();

        System.out.print("Masukkan warna kegemaran anda: ");
        String warna = input.nextLine();
         String ulasan;
         
        switch (warna.toLowerCase()) {
            case "merah":
                ulasan = "Warna merah melambangkan keberanian dan semangat yang tinggi.";
                break;
            case "biru":
                ulasan = "Warna biru melambangkan ketenangan dan kepercayaan.";
                break;
            case "hijau":
                ulasan = "Warna hijau melambangkan kesegaran dan keharmonian dengan alam.";
                break;
            case "kuning":
                ulasan = "Warna kuning melambangkan keceriaan dan optimisme.";
                break;
            case "hitam":
                ulasan = "Warna hitam melambangkan kekuatan dan keanggunan.";
                break;
            case "putih":
                ulasan = "Warna putih melambangkan kesucian dan kebersihan.";
                break;
            default:
                ulasan = "Warna yang anda pilih unik dan menarik!";
                break;
        }
        System.out.println("\n----- Analisis Penampilan Diri -----");
        System.out.println("Nama           : " + nama);
        System.out.println("Jantina        : " + jantina);
        System.out.println("Warna Kegemaran: " + warna);
        System.out.println("Ulasan         : " + ulasan);
        System.out.println("------------------------------------");

        input.close();
    }
}