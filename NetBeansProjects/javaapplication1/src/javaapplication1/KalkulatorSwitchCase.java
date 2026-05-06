package javaapplication1;
import java.util.Scanner;
public class KalkulatorSwitchCase {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

        System.out.println("_____ Operasi Anda      _____");
        System.out.println("----- 1.Operasi Tambah  -----");
        System.out.println("----- 2.Operasi Tolak   -----");
        System.out.println("----- 3.Operasi Darab   -----");
        System.out.println("----- 4.Operasi Bahagi  -----");

        int operator = input.nextInt();

        System.out.println("-----Masukkan nombor pertama anda-----");
        double num1 = input.nextDouble();

        System.out.println("-----Masukkan nombor kedua anda-----");
        double num2 = input.nextDouble();

        double hasil;
        

        switch (operator) {
            case 1:
                hasil = num1 + num2;
                System.out.println("Hasil tambah ialah " + hasil);
                break;
             case 2:
                hasil = num1 - num2;
                System.out.println("Hasil tolak ialah " + hasil);
                break;
             case 3:
                hasil = num1 * num2;
                System.out.println("Hasil darab ialah " + hasil);
                break;
             case 4:
                if (num1 == 0){
                    System.out.println("Tidak boleh bahagi dengan 0");   
                } else {
                    hasil = num1 / num2;
                    System.out.println("Hasil bahagi ialah " + hasil );   
                }
                break;
            default:
                System.out.println("Error");    
        }
        input.close();

        
    }

}   
