public class RealJavaLogical {
    public static void main(String[] args) {
        boolean log = true;
        boolean out = false;
        int security = 3;
    
    if (log && (out || security <= 2)) {
        System.out.println("akses berjaya");
    } else {
        System.out.println("Tidak boleh akses");
    }
    }

}
