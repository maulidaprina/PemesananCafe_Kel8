import java.util.Scanner;

public class CafeBumi8_Fungsi_prosesPesanan {
    static Scanner kel8 = new Scanner(System.in);

    public static void prosesPesanan() {
        kel8.nextLine();
        System.out.print("Masukkan nama pelanggan: ");
        String namaPelanggan = kel8.nextLine();
        String nomorMeja;
        boolean meja = false;

        do {
            System.out.print("Masukkan nomor meja: ");
            nomorMeja = kel8.nextLine();
            meja = true;

            for (int i = 0; i < jumlahPesanan; i++) {
                if (pesanan[i][1].equals(nomorMeja)) {
                    System.out.println("Nomor meja ini sudah terpakai. Silakan pilih nomor meja lain.");
                    meja = false;
                    break;
                }
            }
        } while (!meja);

        int totalHargaPesanan = 0;

        tampilkanMenu();
        while (true) {
            System.out.print("Pilih menu (masukkan nomor menu, atau 0 untuk selesai): ");
            int pilihanMenu = kel8.nextInt();

            if (pilihanMenu == 0) break;

            if (pilihanMenu < 1 || pilihanMenu > daftarMenu.length) {
                System.out.println("Pilihan menu tidak valid. Silakan coba lagi.");
                continue;
            }

            System.out.print("Masukkan jumlah item untuk " + daftarMenu[pilihanMenu - 1] + ": ");
            int jumlahItem = kel8.nextInt();

            if (jumlahItem <= 0) {
                System.out.println("Jumlah item harus lebih dari 0. Silakan coba lagi.");
                continue;
            }

            int hargaItem = hargaMenu[pilihanMenu - 1] * jumlahItem;
            totalHargaPesanan += hargaItem;

            pesanan[jumlahPesanan][0] = namaPelanggan;
            pesanan[jumlahPesanan][1] = nomorMeja;
            pesanan[jumlahPesanan][2] = daftarMenu[pilihanMenu - 1];
            pesanan[jumlahPesanan][3] = String.valueOf(jumlahItem);
            pesanan[jumlahPesanan][4] = String.valueOf(hargaItem);
            jumlahPesanan++;
        }

        System.out.println("Pesanan berhasil ditambahkan.");
        System.out.println("-----------------------------------");
        System.out.println("Total harga pesanan: Rp " + totalHargaPesanan);
    }
}