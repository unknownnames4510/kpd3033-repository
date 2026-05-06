package javaapplication1;
import java.util.Scanner;
public class KodPlatKenderaan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan huruf pertama plat kenderaan: ");
        String huruf = input.next();
        String kodNegeri = huruf.toUpperCase();

        switch (kodNegeri) {
            
            case "A": System.out.println("Perak"); break;
            
            case "B": System.out.println("Selangor"); break;

            case "C": System.out.println("Pahang"); break;
            
            case "D": System.out.println("Kelantan"); break;

            case "J": System.out.println("Johor"); break;

            case "K": System.out.println("Kedah"); break;
            
            case "M": System.out.println("Melaka"); break;
            
            case "P": System.out.println("Pulau Pinang"); break;

            case "R": System.out.println("PERLIS"); break;

            case "T": System.out.println("Terengganu"); break;

            case "V": System.out.println("Wilayah Persekutuan: Kuala Lumpur"); break;
            
            default:
                System.out.println("Kod tidak dikenali atau bukan plat Semenanjung utama.");
                input.close();
        }
    }

}
