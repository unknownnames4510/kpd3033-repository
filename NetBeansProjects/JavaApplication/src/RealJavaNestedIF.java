public class RealJavaNestedIF {
    public static void main(String[] args) {
        int umur = 20;
        boolean warganegara = true;

        if (umur >= 18) {
            System.out.println("anda layak untuk mengundi!");

        if (warganegara) {
            System.out.println("anda warganegara, anda boleh mengundi jugak!");
        } else {
            System.out.println("anda mesti warganegara untuk mengundi!");
        }
        } else {
            System.out.println("anda belum cukup umur untuk mengundi!");
        }
    }

}
