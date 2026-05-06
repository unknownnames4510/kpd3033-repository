package javaapplication1;

public class Whileloop {
    public static void main(String[] args) {
        
        int minyak = 1; // Tangki kosong

        // Syarat: Selagi minyak kurang dari 5 liter
        while (minyak < 2000) {
            System.out.println("Sedang isi minyak... Liter ke-" + minyak);
             // Tambah minyak
        }
        
        System.out.println("Tangki dah penuh!");
    }
}

