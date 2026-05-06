package javaapplication1;
public class NestedIFTest {
    public static void main(String[] args) {
        int umur = 19;
boolean adaLesen = true;

// 1. Syarat Luar (Cek Umur)
if (umur >= 18) {
    System.out.println("Anda sudah cukup umur.");

    // 2. Syarat Dalam (Cek Lesen)
    // Bahagian ini HANYA akan disemak jika umur >= 18
    if (adaLesen == false) {
        System.out.println("Anda layak memandu!");
    } else {
        System.out.println("Anda tidak boleh memandu kerana tiada lesen.");
    }

} else {
    // 3. Jika Syarat Luar 'false'
    System.out.println("Maaf, anda belum cukup umur untuk memandu.");
}
    }

}


