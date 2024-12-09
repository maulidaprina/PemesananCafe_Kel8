public static void hitungTotalPendapatan() {
    System.out.println("\n========== RINCIAN PENDAPATAN HARIAN ==========");
    int totalPendapatan = 0;
    
    for (int i = 0; i < jumlahPesanan; i++) {
        System.out.println("Pelanggan: " + pesanan[i][0]);
        System.out.println("Nomor Meja: " + pesanan[i][1]);
        System.out.println("Pesanan: " + pesanan[i][2] + " x " + pesanan[i][3] + " = Rp " + pesanan[i][4]);
        totalPendapatan += Integer.parseInt(pesanan[i][4]);
        System.out.println("----------------------------------------------");
    }
    System.out.println("Total Pendapatan Harian: Rp " + totalPendapatan);
    System.out.println("----------------------------------------------");
    }