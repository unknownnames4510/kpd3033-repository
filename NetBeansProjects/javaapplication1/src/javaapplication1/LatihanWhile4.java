package javaapplication1;
import java.util.Scanner;
public class LatihanWhile4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan satu nombor:");

        int nombor = input.nextInt();
        System.out.println("Memulakan turutan menurun:");

        while (nombor >=0) {
            System.out.println(nombor);
            nombor--;
        }
        input.close();
    }


}
