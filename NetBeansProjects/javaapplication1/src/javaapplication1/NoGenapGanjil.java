package javaapplication1;
import java.util.Scanner;
public class NoGenapGanjil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  
        System.out.print("Masukkan satu nombor integer: ");
        int nombor = input.nextInt();

        if (nombor % 2 == 1) {
            System.out.println(nombor + " adalah angka ganjil.");
        } else {
            System.out.println(nombor + " adalah angka genap.");
        }
        input.close();
    } 


}
