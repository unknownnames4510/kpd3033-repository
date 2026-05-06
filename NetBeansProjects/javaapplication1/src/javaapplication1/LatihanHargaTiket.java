package javaapplication1;
import java.util.Scanner;
public class LatihanHargaTiket {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Jantina (L/P); ");
        String jantina = input.next();

        System.out.print("Umur: ");
        int umur = input.nextInt();

        System.out.print("Gaji:  ");
        double gaji = input.nextDouble();

        if (jantina.equalsIgnoreCase("L") && umur > 25 && gaji > 25000) {
            System.out.println("Layak buat pinjaman");

        } else if (jantina.equalsIgnoreCase("P") && umur > 21 && gaji > 20000) {
            System.out.println("Layak buat pinjaman");

        } else {
            System.out.println("Tidak layak buat pinjaman");
        }
        input.close();
    }
}