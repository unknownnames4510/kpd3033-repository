package javaapplication1;

public class LatihanFor {
    public static void main(String[] args) {
        double baki = 500;
        double faedah = 0.10;
        int tahun = 5;
        for (int i = 1; i <= tahun; i++) {
            baki = baki + (baki * faedah);
        }
        System.out.printf("Jumlah akhir selepas 5 tahun: %.2f", baki);
    }

}
