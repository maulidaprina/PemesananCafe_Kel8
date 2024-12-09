public class fungsiTampilkanPesanan {
    
        
}
public static void tampilkanPesanan() {
    System.out.println("\n========== DAFTAR PESANAN ==========");
    for (int i = 0; i < jumlahPesanan; i++) {
        boolean sudahDitampilkan = false;

        for (int j = 0; j < i; j++) {
            if (pesanan[i][0].equals(pesanan[j][0]) && pesanan[i][1].equals(pesanan[j][1])) {
                sudahDitampilkan = true;
                break;
            }
        }

        if (!sudahDitampilkan) {
            System.out.println("Nama Pelanggan: " + pesanan[i][0]);
            System.out.println("Nomor Meja: " + pesanan[i][1]);
            System.out.println("\nDetail Pesanan:");

            int totalHargaPelanggan = 0;
            for (int j = i; j < jumlahPesanan; j++) {
                if (pesanan[i][0].equals(pesanan[j][0]) && pesanan[i][1].equals(pesanan[j][1])) {
                    System.out.println("- " + pesanan[j][2] + " x " + pesanan[j][3] + " = Rp " + pesanan[j][4]);
                    totalHargaPelanggan += Integer.parseInt(pesanan[j][4]);
                }
            }

            System.out.println("\nTotal Harga Pesanan: Rp " + totalHargaPelanggan);
            System.out.println("-----------------------------------");
        }
    }
}