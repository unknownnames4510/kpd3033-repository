package javaapplication1;
import java.util.Scanner;
public class TahunLahirKalenderCina {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan tahun lahir anda: ");
        int tahun = input.nextInt();
        int baki = tahun % 12;
        String namaZodiak;

        switch (baki) {
            case 0: namaZodiak = "Monyet"; break;
            case 1: namaZodiak = "Ayam"; break;
            case 2: namaZodiak = "Anjing"; break;
            case 3: namaZodiak = "Babi"; break;
            case 4: namaZodiak = "Tikus"; break;
            case 5: namaZodiak = "Lembu"; break;
            case 6: namaZodiak = "Harimau"; break;
            case 7: namaZodiak = "Arnab"; break;
            case 8: namaZodiak = "Naga"; break;
            case 9: namaZodiak = "Ular"; break;
            case 10: namaZodiak = "Kuda"; break;
            case 11: namaZodiak = "Kambing"; break;
            
            default: namaZodiak = "Tidak Sah"; break;
        }

        System.out.println("Tahun " + tahun + " adalah tahun " + namaZodiak + ".");
        input.close();
    }
}
    