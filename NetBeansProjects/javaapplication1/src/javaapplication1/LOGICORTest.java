package javaapplication1;

public class LOGICORTest {
    public static void main(String[] args) {
        boolean hariCuti = false;
boolean hariMinggu = true; // (cth: hari Ahad)

// Cukup jika ia hari cuti ATAU hari minggu untuk tidak bekerja
if (hariCuti == true || hariMinggu == false) {
    System.out.println("Anda tidak perlu bekerja hari ini."); // Ini akan berjalan
} else {
    System.out.println("Pergi bekerja.");
}
    }

}
