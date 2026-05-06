package javaapplication1;
import java.util.Scanner;
public class MarkahNestedIF {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int markah = input.nextInt();

        // Syarat Luar (Cek Gred)
        if (markah >= 50) {
            if (markah >= 75) {
            }
            System.out.println("Lulus.");
        } else {
            // Jika Syarat Luar 'false'
            System.out.println("Gagal.");
        }
        input.close();
    }

}
