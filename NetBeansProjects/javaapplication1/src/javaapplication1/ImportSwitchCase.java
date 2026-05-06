package javaapplication1;
import java.util.Scanner;
public class ImportSwitchCase {
    public static void main(String[] args) {
        int hari = 17, tahun = 2025;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nombor antara 1 hingga 12: ");
        int bulan = input.nextInt();

        switch (bulan) {
            case 1:
                System.out.println(hari + " Januari " + tahun);
                break;
            case 2:
                System.out.println(hari + " Februari " + tahun);
                break;
            case 3:
                System.out.println(hari + " Mac " + tahun);
                break;
            case 4:
                System.out.println(hari + " April " + tahun);
                break;
            case 5:
                System.out.println(hari + " Mei " + tahun);
                break;
            case 6:
                System.out.println(hari + " Jun " + tahun);
                break;
            case 7:
                System.out.println(hari + "Julai " + tahun);
                break;
            case 8:
                System.out.println(hari + " Ogos " + tahun);
                break;
            case 9:
                System.out.println(hari + " September " + tahun);
                break;
            case 10:
                System.out.println(hari + " Oktober " + tahun);
                break;
            case 11:
                System.out.println(hari + " November " + tahun);
                break;
            case 12:
                System.out.println(hari + " Disember " + tahun);
                break;
            default:
                System.out.println("Nombor bulan tidak sah");
        }
        input.close();
    }
}


