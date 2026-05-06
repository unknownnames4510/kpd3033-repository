package javaapplication1;
import java.util.Scanner;
public class LatihanBMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  

        System.out.print("Masukkan berat badan (kg): ");
        double berat = input.nextDouble();

        System.out.print("Masukkan tinggi badan (m): ");
        double tinggi = input.nextDouble()/100;

        double bmi = berat / (tinggi * tinggi);
        System.out.println("Indeks Jisim Badan (BMI) anda adalah:" + bmi);

        if (bmi <= 18.5) {
            System.out.println("Anda kekurangan berat badan.");
        }
        else if (bmi <= 25) {
            System.out.println("Berat badan anda normal.");            
        }
        else if (bmi <= 30) {
            System.out.println("Anda mempunyai berat badan berlebihan.");
            
        } else {
            System.out.println("Anda mempunyai obesiti.");

            input.close();
    }
}

}
