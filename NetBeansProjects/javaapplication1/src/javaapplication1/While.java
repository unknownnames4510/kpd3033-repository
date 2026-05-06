package javaapplication1;
public class While {
    public static void main(String[] args) {
        int n = 5; //pemulaan nilai n adalah 5
        while (n > 0) { //kondisi pengulangan selama n lebih besar dari 0
            System.out.println(n+","); //menampilkan nilai n diikuti koma
            n-=1; //mengurangi nilai n sebesar 1 setiap iterasi
        }

    }
}