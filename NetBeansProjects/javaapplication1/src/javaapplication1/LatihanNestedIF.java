package javaapplication1;
import java.util.Scanner;
public class LatihanNestedIF {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jantina: ");
        String jantinaInput = input.next();

        System.out.print("Masukkan umur anda: ");
        int umur = input.nextInt();

        System.out.print("Masukkan gaji bulanan anda: ");
        double gaji = input.nextDouble();

        boolean layak = false; 

       
        if (jantinaInput.equalsIgnoreCase("L")) {
            if (umur > 25 && gaji > 25000) {
                layak = true;
            }
        } 
    
        else if (jantinaInput.equalsIgnoreCase("P")) {
            if (umur > 30 && gaji >= 20000) {
                layak = true;
            }
        } else {
            System.out.println("Input jantina tidak sah. Sila masukkan L atau P.");
        }

     
        if (layak) {
            System.out.println("Keputusan: TAHNIAH! Anda layak untuk membuat pinjaman.");
        } else {
            System.out.println("Keputusan: MAAF. Anda tidak layak untuk membuat pinjaman.");
        }


        input.close();
    }
}
