package javaapplication1;

public class ifelseiftest {
    public static void main(String[] args) {
        int umur = 16;
        if (umur < 18) {
            System.out.println("Anda masih di bawah umur.");
        } else if (umur < 60) {
            System.out.println("Anda sudah dewasa.");
        } else {
            System.out.println("Anda sudah lanjut usia.");
        }
         System.out.println("Umur tidak valid.");
    }
}

    // Blok kod jika SEMUA syarat di atas PALSU

