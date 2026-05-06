package javaapplication1;

public class ForWhile {
    public static void main(String[] args) {
        int jumlah = 0;
        for (int i = 2; i <= 100; i++) {
            jumlah += i;
            System.out.println("Jumlah dari 2 hingga " + i + " adalah: " + jumlah);
        }
    }
    

}
