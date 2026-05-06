package javaapplication1;
import java.util.Scanner;
public class ifelsetest {
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.print("Masukkan umur Anda: ");
       int umur = input.nextInt();
       if (umur < 18) {
           System.out.println("Anda masih di bawah umur.");
       } else {
           System.out.println("Anda sudah dewasa.");
       }
         input.close();
   }
}