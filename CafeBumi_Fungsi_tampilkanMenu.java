import java.util.Scanner;

public class CafeBumi8_Fungsi_tampilkanMenu {

    public static void tampilkanMenu() {
        System.out.println("\n============ MENU KAFE ============");
        for (int i = 0; i < daftarMenu.length; i++) {
            System.out.println((i + 1) + ". " + daftarMenu[i] + " - Rp " + hargaMenu[i]);
        }
        System.out.println("===================================");
    }
}