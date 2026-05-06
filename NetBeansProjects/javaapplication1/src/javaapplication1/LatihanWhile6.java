package javaapplication1;
import java.util.Scanner;
public class LatihanWhile6 {
public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        int n;
        int jumlah=0;

        System.out.print("Masukkan nombor: ");
            n = input.nextInt();

        while (n != 0) {
            jumlah = jumlah + n; 
            System.out.print("Masukkan nombor: ");
            n = input.nextInt(); 
            
            
        }  
        System.out.println("Jumlah Nombor penamat ialah: " + jumlah);
        input.close();
    }
}
