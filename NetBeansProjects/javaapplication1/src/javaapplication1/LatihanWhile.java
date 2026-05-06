package javaapplication1;
import java.util.Scanner; 
public class LatihanWhile {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Sila masukkan nombor permulaan (x): ");
        int x = input.nextInt();
        while (x > 0) {
            System.out.println(x + ",");
            x -= 1; 
        }
        input.close(); 
    }
}