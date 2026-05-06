package javaapplication1;

public class DoWhile {
    public static void main(String[] args) {
        int y = 1;
        int x = 12;
        
        do {
            int z = x * y;
            System.out.print(y+ " x 12 = " + z  + "\n");
        y++;
        } while (y <= 12);
    }

}
