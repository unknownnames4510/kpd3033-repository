package javaapplication1;

public class LatihanAND {

    public static void main(String[] args) {
        int markah = 55;
        System.out.println("Menyemak markah: " + markah);
        if (markah >= 0 && markah <= 100) {
           System.out.println("Markah adalah SAH (dalam julat 0-100).");    
        } else {
            System.out.println("Markah TIDAK SAH (di luar julat 0-100).");
            
        }
    }
}
