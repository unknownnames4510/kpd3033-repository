package javaapplication1;

public class LatihanWhile2 {
    public static void main(String[] args) {
        int jumlah = 0; 
        
        for (int i = 1; i <= 10; i++) {
            jumlah = jumlah + i;
        }

        System.out.println("Jumlah nombor 1 hingga 10 ialah: " + jumlah);
    }
}