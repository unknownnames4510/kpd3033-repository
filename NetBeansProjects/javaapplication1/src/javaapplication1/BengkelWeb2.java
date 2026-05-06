package javaapplication1;
import java.util.Scanner;
public class BengkelWeb2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan panjang bengkel (meter): ");
        double panjang = input.nextDouble();

        System.out.print("Masukkan lebar bengkel (meter): ");
        double lebar = input.nextDouble();
        double luasLantai = panjang * lebar;

        System.out.print("Masukkan lebar tingkap (meter): ");
        double LebarTingkap = input.nextDouble();

        System.out.print("Masukkan Panjang Tingkap (meter):");
        double PanjangTingkap = input.nextDouble();
        double luasTingkap = LebarTingkap * PanjangTingkap;
        luasLantai = luasLantai - luasTingkap;

        System.out.println("Luas lantai bengkel tanpa ialah: " + luasLantai + " meter persegi.");
        input.close();

    }

}
