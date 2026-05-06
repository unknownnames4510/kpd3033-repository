package javaapplication1;
import java.util.Scanner;
public class LatihanMerdeka {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tahun Lahir Anda: ");
        int Lahir = scanner.nextInt();
        if( Lahir >= 1957){
            System.out.println("merdeka");
        }
        else {
            System.out.println("Dijajah sebelum merdeka");
        }
        scanner.close();
    }
}
